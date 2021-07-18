package com.quanlicongty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quanlicongty.model.GetLogin;
import com.quanlicongty.model.Login;
import com.quanlicongty.service.LoginServive;

@Controller
public class LoginController {
 @Autowired LoginServive loginServive;
 @RequestMapping(value = {"","/"})
 public String homeLogin() {
	 
	 return"homelogin";
 }
 @RequestMapping(value = {"/dangki"}, method = RequestMethod.GET)
 public String registration(Model model) {
	 model.addAttribute("registration", new Login());
	 return"dangki";
 }
 @RequestMapping(value = {"/dangki"}, method = RequestMethod.POST)
 public String doRegistration(@ModelAttribute("registration") Login login, Model model) {
	 
	 if (login.getUserName() == null || login.getUserName().equals("")) {
		 
		model.addAttribute("username","username can not empty !");
		return"dangki";
	}
	 if (loginServive.checkExits(login.getUserName())) {
		 
		model.addAttribute("username","username exited !");
		return"dangki";
	}
	 loginServive.insertLogin(login);
	 model.addAttribute("Username","Đăng kí Thành Công.");
	 return"redirect:dangki";
 }
 @RequestMapping(value = {"/dangnhap"}, method = RequestMethod.GET)
 public String login(Model model) {
	 model.addAttribute("login", new Login());
	 return"dangnhap";
 }
 
 @RequestMapping(value = {"/dangnhap"}, method = RequestMethod.POST)
 public String doLogin(@ModelAttribute("login") GetLogin getLogin, Model model) {
	 if (!loginServive.checkLogin(getLogin)) {
		model.addAttribute("error", "Tài khoản hoặc mật khẩu không đúng !");
		return"dangnhap";
	}
	 return"home";
 }
}
