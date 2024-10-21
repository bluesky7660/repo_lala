package com.lalaping.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DashboardController {
	@RequestMapping(value = "/v1/dashboard")
	public String index() {

		return "xdm/v1/index";
	}
	
	@RequestMapping(value = "/v1/loginXdm")
	public String loginXdm() {

		return "xdm/v1/loginXdm";
	}
	
}
