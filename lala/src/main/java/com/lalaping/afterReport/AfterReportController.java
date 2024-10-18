package com.lalaping.afterReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.common.util.UtilDateTime;

@Controller
public class AfterReportController {
	@Autowired
	AfterReportService afterReportService;
	
	@RequestMapping(value = "/v1/infra/afterReport/afterReportXdmList")
	public String afterReportXdmList(@ModelAttribute("afterReportvo") AfterReportVo afterReportVo, Model model) {
		System.out.println("시작날:"+afterReportVo.getShDateStart());
		System.out.println("마감날:"+afterReportVo.getShDateEnd());
		afterReportVo.setShDateStart(afterReportVo.getShDateStart() == null || afterReportVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(afterReportVo.getShDateStart()));
		afterReportVo.setShDateEnd(afterReportVo.getShDateEnd() == null || afterReportVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(afterReportVo.getShDateEnd()));
		afterReportVo.setParamsPaging(afterReportService.afterReportlistCount(afterReportVo));
		System.out.println("nqonoifqs");
		model.addAttribute("list", afterReportService.afterReportSelectList(afterReportVo));
//		for(AfterReportDto item : afterReportService.selectList(afterReportVo)) {
//			System.out.println("리스트seq: " + item.get );
//		}
		return "/xdm/v1/infra/afterReport/afterReportXdmList";
	}
	
	@RequestMapping(value = "/xdm/v1/infra/afterReport/afterReportXdmForm")
	public String afterReportXdmForm() {
		return "/xdm/v1/infra/afterReport/afterReportXdmForm";
	}
	@RequestMapping(value = "/xdm/v1/infra/afterReport/afterReportXdmMfom")
	public String afterReportXdmMfom() {
		return "/xdm/v1/infra/afterReport/afterReportXdmMfom";
	}

	// CRUD
	@RequestMapping(value = "/xdm/v1/infra/afterReport/afterReportXdmInst")
	public String afterReportXdmInst(AfterReportDto afterReportDto) {
		System.out.println("AfterReportDto.getsfName(): " + afterReportDto.getArSeq());
		int inst = afterReportService.insertAfterReport(afterReportDto);
		System.out.println("afterReportService.insertAfterReport(afterReportDto): " + inst);
		return "redirect:/xdm/v1/infra/afterReport/afterReportXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/afterReport/afterReportXdmUpdate")
	public String afterReportXdmUpdate(AfterReportDto afterReportDto) {
		System.out.println("AfterReportDto.getsfSeq(): " + afterReportDto.getArSeq());
		int updt = afterReportService.updateAfterReport(afterReportDto);
		System.out.println("afterReportService.updateAfterReport(afterReportDto): " + updt);
		return "redirect:/xdm/v1/infra/afterReport/afterReportXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/afterReport/afterReportXdmDelete")
	public String afterReportXdmDelete(AfterReportDto afterReportDto) {
		System.out.println("AfterReportDto.getsfSeq(): " + afterReportDto.getArSeq());
		int delt = afterReportService.deleteAfterReport(afterReportDto);
		System.out.println("afterReportService.deleteAfterReport(afterReportDto): " + delt);
		return "redirect:/xdm/v1/infra/afterReport/afterReportXdmList";
	}
	@RequestMapping(value = "/xdm/v1/infra/afterReport/afterReportXdmUelete")
	public String afterReportXdmUelete(AfterReportDto afterReportDto) {
		System.out.println("AfterReportDto.getsfSeq(): " + afterReportDto.getArSeq());
		int uelt = afterReportService.ueleteAfterReport(afterReportDto);
		System.out.println("afterReportService.ueleteAfterReport(afterReportDto): " + uelt);
		return "redirect:/xdm/v1/infra/afterReport/afterReportXdmList";
	}
}