package com.quanlicongty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quanlicongty.model.Phongban;
import com.quanlicongty.repository.PhongbanRepository;
import com.quanlicongty.service.PhongbanService;

@Service
public class PhongbanServiceimpl implements PhongbanService {
	@Autowired PhongbanRepository repository;
// getAll
	@Override
	public List<Phongban> getAllPhongBan() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
//creat
	@Override
	public Phongban addPhongban(Phongban phongban) {
		// TODO Auto-generated method stub
		return repository.save(phongban);
	}
//update
	@Override
	public Phongban updatePhongban(Phongban phongban) {
		// TODO Auto-generated method stub
		return repository.save(phongban);
	}
//delete
	@Override
	public void deletePhongBan(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}
	@Override
	public Phongban getByIdPhongBan(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}
	
	

	
}
