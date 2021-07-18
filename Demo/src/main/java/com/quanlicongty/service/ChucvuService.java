package com.quanlicongty.service;

import java.util.List;

import com.quanlicongty.model.Chucvu;

public interface ChucvuService {
	//getAll
	List<Chucvu> getAllChucVu();
	//getById
	Chucvu getByIdChucVu(int id);
	//add
	Chucvu addChucVu(Chucvu chucvu);
	//update
	Chucvu updateChucVu(Chucvu chucvu);
	//delete
	void deleteChucvu(int id);

}
