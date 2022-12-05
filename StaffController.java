package com.project.SpringMVC1Project;

import org.springframework.beans.factory.annotation.Autowired
;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StaffController 
{
	@Autowired
	AddData adddata;
	@RequestMapping("/")

	public String home()
   {
       return "home.jsp";	
    }
	@RequestMapping("addData")
	public String addStaff(Staff staff)
	{
		adddata.save(staff);
		return "home.jsp";
	}
}
