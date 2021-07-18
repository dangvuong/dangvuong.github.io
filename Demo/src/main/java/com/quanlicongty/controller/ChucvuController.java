package com.quanlicongty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quanlicongty.model.Chucvu;
import com.quanlicongty.service.ChucvuService;

@Controller
public class ChucvuController {
	@Autowired ChucvuService chucvuService;
	//getById
	@RequestMapping(value = {"/viewchucvu/{id}"}, method = RequestMethod.GET)
	public String getById(Model model,@PathVariable(name = "id")int id) {
		model.addAttribute("chucvu",chucvuService.getByIdChucVu(id));
		return"viewchucvu";
	}
	
	//getAll
	@RequestMapping(value = {"listchucvu"}, method = RequestMethod.GET)
	public String getAllChucVu(Model model) {
		model.addAttribute("chucvu", chucvuService.getAllChucVu());
		return"listchucvu";
	}
	//Add
	@RequestMapping(value = {"/addchucvu"}, method = RequestMethod.GET)
	public String addChucVu(Model model) {
		model.addAttribute("chucvu", new Chucvu());
		return"addchucvu";
	}
	@RequestMapping(value = {"/addchucvu"}, method = RequestMethod.POST)
	public String doAddChucVu(@ModelAttribute("chucvu") Chucvu chucvu) {
		chucvuService.addChucVu(chucvu);
		return"redirect:listchucvu";
	}
	//update
	@RequestMapping(value = {"/updatechucvu/{id}"},method = RequestMethod.GET)
	public String updateChucVu(Model model,@PathVariable(name = "id") int id) {
		model.addAttribute("updatechucvu",chucvuService.getByIdChucVu(id));
		return"updatechucvu";
	}
	@RequestMapping(value = {"/updatechucvu"}, method = RequestMethod.POST)
	public String doUpdateChucVu(@ModelAttribute("updatechucvu")Chucvu chucvu) {
		chucvuService.updateChucVu(chucvu);
		return"redirect:listchucvu";
	}
	//delete
	@RequestMapping(value = {"/deletechucvu/{id}"}, method = RequestMethod.GET)
	public String deletePhongBan(@PathVariable(name = "id")int id) {
		
		chucvuService.deleteChucvu(id);
		return"home";
	}
}
