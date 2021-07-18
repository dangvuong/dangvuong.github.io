package com.quanlicongty.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quanlicongty.model.Phongban;
import com.quanlicongty.service.PhongbanService;



@Controller
public class PhongbanController {
	@Autowired PhongbanService phongbanService;
	//getById
	@RequestMapping(value = {"/viewphongban/{id}"},method = RequestMethod.GET)
	public String getById(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("phongban",phongbanService.getByIdPhongBan(id));
		return"viewphongban";
	}
	//getAll
	@RequestMapping(value = {"/listphongban"}, method = RequestMethod.GET)
	public String getAllPhongBan(Model model) {
		model.addAttribute("phongban",phongbanService.getAllPhongBan());
		
		return"listphongban";
	}
	//creat
	@RequestMapping(value = {"/addphongban"}, method = RequestMethod.GET)
	public String addPhongBan(Model model) {
		model.addAttribute("addPhongban", new Phongban());
		return"addphongban";
	}
	
	@RequestMapping(value = {"/addphongban"}, method = RequestMethod.POST)
	public String doAddPhongBan(@ModelAttribute("addphongban") Phongban phongban) {
		
		phongbanService.addPhongban(phongban);
		return"redirect:listphongban";
	}
	
	// updatephongban
	
	@RequestMapping(value = {"/updatephongban/{id}"}, method = RequestMethod.GET)
	public String updatePhongBan(Model model,@PathVariable(name = "id") int id) {
		model.addAttribute("updatephongban", phongbanService.getByIdPhongBan(id));
				
		return"updatephongban";
	}
	@RequestMapping(value = {"/updatephongban"}, method = RequestMethod.POST)
	public String doUpDatePhongBan(@ModelAttribute("updatephongban") Phongban phongban) {
		phongbanService.updatePhongban(phongban);
		return"redirect:listphongban";
		
	}
	// deletephongban
	@RequestMapping(value = {"/deletephongban/{id}"}, method = RequestMethod.GET)
	public String deletePhongBan(@PathVariable(name = "id")int id) {
		phongbanService.deletePhongBan(id);
		return"home";
	}

}
