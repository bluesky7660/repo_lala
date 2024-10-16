package com.lalaping.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.common.util.UtilDateTime;
import com.lalaping.infra.codegroup.CodeGroupDto;
import com.lalaping.infra.codegroup.CodeGroupService;
import com.lalaping.infra.codegroup.CodeGroupVo;

@Controller
public class CodeController {
	@Autowired
	CodeService codeService;
	@Autowired
	CodeGroupService codeGroupService;
	
	@RequestMapping(value = "/v1/infra/code/codeXdmList")
	public String CodeXdmList(Model model,@ModelAttribute("vo") CodeVo codeVo) {
		codeVo.setShDateStart(codeVo.getShDateStart() == null || codeVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(codeVo.getShDateStart()));
		codeVo.setShDateEnd(codeVo.getShDateEnd() == null || codeVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(codeVo.getShDateEnd()));
		codeVo.setParamsPaging(codeService.listCount(codeVo));
		model.addAttribute("list", codeService.selectList(codeVo));
		return "/xdm/v1/infra/code/codeXdmList";
	}
	@RequestMapping(value = "/v1/infra/code/codeXdmForm")
	public String CodeXdmForm(Model model , CodeGroupVo codeGroupVo) {
		model.addAttribute("group", codeGroupService.selectList(codeGroupVo));
		return "/xdm/v1/infra/code/codeXdmForm";
	}
	@RequestMapping(value = "/v1/infra/commonCode/CodeXdmInst")
	public String CodeXdmInst(CodeDto codeDto) {
		return "redierect:/xdm/v1/infra/commonCode/CodeXdmList";
	}
	@RequestMapping(value = "/v1/infra/commonCode/CodeXdmMFom")
	public String CodeXdmMFom(Model model,CodeDto codeDto) {
		model.addAttribute("item", codeService.selectOne(codeDto));
		return "/xdm/v1/infra/commonCode/CodeXdmMFom";
	}
	@RequestMapping(value = "/v1/infra/commonCode/codeXdmUpdt")
	public String codeXdmUpdt(CodeDto codeDto) {
		return "redierect:/xdm/v1/infra/commonCode/CodeXdmList";
	}
	@RequestMapping(value = "/v1/infra/commonCode/codeXdmUete")
	public String codeXdmUete(CodeDto codeDto) {
		return "redierect:/xdm/v1/infra/commonCode/CodeXdmList";
	}
	@RequestMapping(value = "/v1/infra/commonCode/codeXdmDete")
	public String codeXdmDete(CodeDto codeDto) {
		return "redierect:/xdm/v1/infra/commonCode/CodeXdmList";
	}

}
