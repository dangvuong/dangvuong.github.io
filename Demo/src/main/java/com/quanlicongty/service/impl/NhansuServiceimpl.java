package com.quanlicongty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quanlicongty.model.Nhansu;
import com.quanlicongty.repository.NhansuRepository;
import com.quanlicongty.service.NhansuService;
@Service
public class NhansuServiceimpl implements NhansuService {
	@Autowired NhansuRepository repository;



	@Override
	public Nhansu getByIdNhanSu(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public Nhansu addNhanSu(Nhansu nhansu) {
		// TODO Auto-generated method stub
		
		return repository.save(nhansu);
	}

	@Override
	public Nhansu updateNhanSu(Nhansu nhansu) {
		// TODO Auto-generated method stub
		return repository.save(nhansu);
	}

	@Override
	public void deleteNhanSu(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Nhansu> getAllNhanSu() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
