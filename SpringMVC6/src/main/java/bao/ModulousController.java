package bao;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModulousController {
	@RequestMapping("/mod")
	public String mod()
	{
		return "modulous";		
	}
	@RequestMapping("/modlogic")
	public ModelAndView modlogic(HttpServletRequest request,HttpServletResponse response)
	{
		int num1=Integer.parseInt(request.getParameter("txt1"));
		int num2=Integer.parseInt(request.getParameter("txt2"));
		int num3=num1%num2;
		return new ModelAndView("modulous","key",num3);
	}
}
