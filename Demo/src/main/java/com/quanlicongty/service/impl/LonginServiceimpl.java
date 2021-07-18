package com.quanlicongty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quanlicongty.model.GetLogin;
import com.quanlicongty.model.Login;
import com.quanlicongty.repository.LoginRepository;
import com.quanlicongty.service.LoginServive;
@Service
public class LonginServiceimpl implements LoginServive {
	@Autowired LoginRepository repository;

	@Override
	public Login insertLogin(Login login) {
		// TODO Auto-generated method stub
		return repository.save(login);
	}

	@Override
	public boolean checkExits(String userName) {
		// TODO Auto-generated method stub
		if (repository.checkExits(userName) > 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean checkLogin(GetLogin getLogin) {
		// TODO Auto-generated method stub
		String username = getLogin.getUsername();
		Login login = repository.findByUsername(username);
		if (username == null) {
			return false;
		}
		if (!getLogin.getPassWord().equals(login.getPassWord())) {
			return false;
		}
		return true;
	}
}
