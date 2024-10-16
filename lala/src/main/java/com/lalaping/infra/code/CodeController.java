package com.lalaping.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.common.util.UtilDateTime;

@Controller
public class CodeController {
	@Autowired
	CodeService codeService;
	
	@RequestMapping(value = "/v1/infra/code/codeXdmList")
	public String CodeXdmList(Model model,@ModelAttribute("vo") CodeVo codeVo) {
		codeVo.setShDateStart(codeVo.getShDateStart() == null || codeVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(codeVo.getShDateStart()));
		codeVo.setShDateEnd(codeVo.getShDateEnd() == null || codeVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(codeVo.getShDateEnd()));
		codeVo.setParamsPaging(codeService.listCount(codeVo));
		model.addAttribute("list", codeService.selectList(codeVo));
		return "/xdm/v1/infra/code/codeXdmList";
	}
	@RequestMapping(value = "/v1/infra/code/codeXdmForm")
	public String CodeXdmForm() {
		return "/xdm/v1/infra/code/codeXdmForm";
	}
	

}
