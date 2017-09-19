package server.controller;

import java.sql.Blob;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mainControl.SMJPControl;
import pojo.Pec_r;
import server.service.ITestService;

@Controller
@RequestMapping("/test")
public class TestController extends SMJPControl {

	@Resource
	private ITestService testService;

	@RequestMapping(value = "/jsonToString", method = RequestMethod.POST, consumes = "application/text", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String testJsonToString(HttpServletRequest request,
			HttpSession session, @RequestBody String jsonString)
			throws SerialException, SQLException {

		String pk = "test";
		testService.deleteBValue(pk);
		Pec_r pec_r = new Pec_r();
		pec_r.setPk(pk);
		pec_r.setBvalue(jsonString);
		testService.addBValue(pec_r);
		Pec_r returnJsonStr = testService.getBValue(pk);
		Blob blob = (Blob) returnJsonStr.getBvalue();
		String content = "";
		try {
			content = new String(blob.getBytes((long) 1, (int) blob.length()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (content.equals(jsonString)) {
			System.out.println("yes! ok");
		}
		return content;
	}
}
