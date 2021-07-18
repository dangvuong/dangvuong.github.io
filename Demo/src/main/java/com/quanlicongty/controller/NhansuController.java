package com.quanlicongty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quanlicongty.model.Nhansu;
import com.quanlicongty.service.NhansuService;

@Controller
public class NhansuController {
	@Autowired NhansuService nhansuService;
	@RequestMapping(value = {"/viewnhansu/{id}"}, method = RequestMethod.GET)
	public String  getById(Model model,@PathVariable(name = "id")int id) {
		model.addAttribute("nhansu",nhansuService.getByIdNhanSu(id));
		return"viewnhansu";
	}
	@RequestMapping(value = {"/listnhansu"}, method = RequestMethod.GET)
	public String getAllNhanSu(Model model) {
		model.addAttribute("nhansu",nhansuService.getAllNhanSu());
		return"listnhansu";
	}
	
	@RequestMapping(value = {"/addnhansu"}, method = RequestMethod.GET)
	public String addNhanSu(Model model) {
		model.addAttribute("nhansu", new Nhansu());
		return"addnhansu";
	}
	@RequestMapping(value = {"/addnhansu"}, method = RequestMethod.POST)
	public String doAddNhanSu(@ModelAttribute("nhansu")Nhansu nhansu) {
		nhansuService.addNhanSu(nhansu);
		return"redirect:listnhansu";
	}
}
