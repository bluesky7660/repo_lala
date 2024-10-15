package com.lalaping.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmList")
	public String codeGroupXdmList(@ModelAttribute("vo") CodeGroupVo vo, Model model) {
		
		
		return "/xdm/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmForm")
	public String codeGroupXdmForm() {
		return "/xdm/v1/infra/codegroup/codeGroupXdmForm";
	}
	 
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmInst")
	public String codeGroupXdmInst(CodeGroupDto codeGroupDto) {

		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmMfom")
	public String codeGroupXdmMfom(Model model,CodeGroupDto codeGroupDto) {

		return "xdm/v1/infra/codegroup/codeGroupXdmMfom";
	}
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmUpdt")
	public String codeGroupXdmUpdt(CodeGroupDto codeGroupDto) {

		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmUelt")
	public String codeGroupXdmUelt(CodeGroupDto codeGroupDto) {

		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
	@RequestMapping(value = "/v1/infra/codegroup/codeGroupXdmDelt")
	public String codeGroupXdmDelt(CodeGroupDto codeGroupDto) {

		return "redirect:/v1/infra/codegroup/codeGroupXdmList";
	}
}
