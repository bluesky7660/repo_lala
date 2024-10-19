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
	
	@RequestMapping(value = "/v1/afterReport/afterReportXdmList")
	public String afterReportXdmList(@ModelAttribute("vo") AfterReportVo afterReportVo, Model model) {
		System.out.println("시작날:"+afterReportVo.getShDateStart());
		System.out.println("마감날:"+afterReportVo.getShDateEnd());
		afterReportVo.setShDateStart(afterReportVo.getShDateStart() == null || afterReportVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(afterReportVo.getShDateStart()));
		afterReportVo.setShDateEnd(afterReportVo.getShDateEnd() == null || afterReportVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(afterReportVo.getShDateEnd()));
		afterReportVo.setParamsPaging(afterReportService.listCount(afterReportVo));
		System.out.println("nqonoifqs");
		model.addAttribute("list", afterReportService.selectList(afterReportVo));
//		for(Aft	erReportDto item : afterReportService.selectList(afterReportVo)) {
//			System.out.println("리스트seq: " + item.get );
//		}
		model.addAttribute("formLink", "afterReportXdmForm");
		return "xdm/v1/afterReport/afterReportXdmList";
	}
	
	@RequestMapping(value = "/v1/afterReport/afterReportXdmForm")
	public String afterReportXdmForm(Model model) {
		model.addAttribute("listLink", "afterReportXdmList");
		return "/xdm/v1/afterReport/afterReportXdmForm";
	}
	@RequestMapping(value = "/v1/afterReport/afterReportXdmMfom")
	public String afterReportXdmMfom(Model model) {
		model.addAttribute("listLink", "afterReportXdmList");
		return "/xdm/v1/afterReport/afterReportXdmMfom";
	}

	// CRUD
	@RequestMapping(value = "/v1/afterReport/afterReportXdmInst")
	public String afterReportXdmInst(AfterReportDto afterReportDto) {
		System.out.println("AfterReportDto.getsfName(): " + afterReportDto.getArSeq());
		int inst = afterReportService.insert(afterReportDto);
		System.out.println("afterReportService.insertAfterReport(afterReportDto): " + inst);
		return "redirect:/v1/afterReport/afterReportXdmList";
	}
	@RequestMapping(value = "/v1/afterReport/afterReportXdmUpdate")
	public String afterReportXdmUpdate(AfterReportDto afterReportDto) {
		System.out.println("AfterReportDto.getsfSeq(): " + afterReportDto.getArSeq());
		int updt = afterReportService.update(afterReportDto);
		System.out.println("afterReportService.updateAfterReport(afterReportDto): " + updt);
		return "redirect:/v1/afterReport/afterReportXdmList";
	}
	@RequestMapping(value = "/v1/afterReport/afterReportXdmDelete")
	public String afterReportXdmDelete(AfterReportDto afterReportDto) {
		System.out.println("AfterReportDto.getsfSeq(): " + afterReportDto.getArSeq());
		int delt = afterReportService.delete(afterReportDto);
		System.out.println("afterReportService.deleteAfterReport(afterReportDto): " + delt);
		return "redirect:/v1/afterReport/afterReportXdmList";
	}
	@RequestMapping(value = "/v1/afterReport/afterReportXdmUelete")
	public String afterReportXdmUelete(AfterReportDto afterReportDto) {
		System.out.println("AfterReportDto.getsfSeq(): " + afterReportDto.getArSeq());
		int uelt = afterReportService.uelete(afterReportDto);
		System.out.println("afterReportService.ueleteAfterReport(afterReportDto): " + uelt);
		return "redirect:/v1/afterReport/afterReportXdmList";
	}
}