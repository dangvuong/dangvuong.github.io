package com.quanlicongty.service;

import java.util.List;

import com.quanlicongty.model.Nhansu;

public interface NhansuService {
	//getAll
	List<Nhansu> getAllNhanSu();
	
	//getById
	Nhansu getByIdNhanSu(int id);
	
	//add
	Nhansu addNhanSu(Nhansu nhansu);
	
	//update
	Nhansu updateNhanSu(Nhansu nhansu);
	
	//delete
	void deleteNhanSu(int id);
	
}
