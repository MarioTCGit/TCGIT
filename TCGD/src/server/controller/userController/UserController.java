package server.controller.userController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mainControl.SMJPControl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.SMJP_USER;
import server.service.userService.UserService;

@Controller
@RequestMapping("/userController")
public class UserController extends SMJPControl {

	@Resource
	private UserService userService;

	@RequestMapping("/login")
	public ModelAndView test(ModelAndView model, HttpServletRequest request,
			HttpSession session) {
		model.setViewName("forward:/page/userPage/main.jsp");
		SMJP_USER SMJP_USER_ = new SMJP_USER();
		SMJP_USER_.setUsername("wtc");
		SMJP_USER_.setPassword("wtc");
		int x = userService.login(SMJP_USER_);
		System.out.print(x);
		return model;
	}
}
