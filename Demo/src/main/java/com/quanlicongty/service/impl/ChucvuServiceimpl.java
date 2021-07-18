package com.quanlicongty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quanlicongty.model.Chucvu;
import com.quanlicongty.repository.ChucvuRepository;
import com.quanlicongty.service.ChucvuService;
@Service
public class ChucvuServiceimpl implements ChucvuService {
	@Autowired ChucvuRepository repository;

	@Override
	public List<Chucvu> getAllChucVu() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Chucvu getByIdChucVu(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public Chucvu addChucVu(Chucvu chucvu) {
		// TODO Auto-generated method stub
		return repository.save(chucvu);
	}

	@Override
	public Chucvu updateChucVu(Chucvu chucvu) {
		// TODO Auto-generated method stub
		return repository.save(chucvu);
	}

	@Override
	public void deleteChucvu(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
