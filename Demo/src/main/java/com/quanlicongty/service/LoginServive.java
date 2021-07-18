package com.quanlicongty.service;

import com.quanlicongty.model.GetLogin;
import com.quanlicongty.model.Login;

public interface LoginServive {
	
	Login insertLogin(Login login);
	
	
	boolean checkExits(String userName);
	
	boolean checkLogin(GetLogin getLogin);
}
