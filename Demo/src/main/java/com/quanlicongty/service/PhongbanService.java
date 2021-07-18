package com.quanlicongty.service;

import java.util.List;

import com.quanlicongty.model.Phongban;

public interface PhongbanService {
	//get all
	List<Phongban> getAllPhongBan();
	
	// add phongban
	Phongban addPhongban(Phongban phongban);
	
	Phongban getByIdPhongBan(int id);
	//update phong ban
	Phongban updatePhongban(Phongban phongban);
	
	//delete phongban
	void deletePhongBan(int id);

}
