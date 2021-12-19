package EcoBikeRental.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import EcoBikeRental.Dao.UserDao;

@Controller
public class HomeController {
	@Autowired
	UserDao userDao;

	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("users", userDao.getAllUser());
		return mav;
	}
}
