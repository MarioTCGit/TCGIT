package server.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import mainControl.SMJPControl;
import pojo.TESTB;

@Controller
@RequestMapping("/HOME")
public class TCGDController extends SMJPControl {

	@RequestMapping("/")
	public ModelAndView init(ModelAndView model, HttpServletRequest request, HttpSession session) {
		model.setViewName("forward:/page/userPage/main.jsp");
		TESTB p = new TESTB();
		p.setT1("pk");
		p.setT2("pk");
		Gson gson = new Gson();
		String x = gson.toJson(p);
		System.out.println(x);
		return model;
	}
}
