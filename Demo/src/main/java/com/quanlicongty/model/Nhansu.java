package com.quanlicongty.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "qlns")
public class Nhansu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "tenns")
	private String tenNhanSu;
	
	@Column(name = "namsinh")
	private int namSinh;
	
	@Column(name = "cmnd")
	private String cmnd;
	
	@Column(name = "diachi")
	private String diaChi;
	
	@Column(name = "ngaybatdau")
	private String ngayBatDau;
	
	@Column(name = "ngaynghiviec")
	private String ngayNghiviec;
	
	@Column(name = "trinhdo")
	private String trinhDo;
	
	@Column(name = "ngoaingu")
	private String ngoaiNgu;
	
	@Column(name = "tinhoc")
	private String tinHoc;
	
	@Column(name = "thanhtich")
	private String thanhTich;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenNhanSu() {
		return tenNhanSu;
	}

	public void setTenNhanSu(String tenNhanSu) {
		this.tenNhanSu = tenNhanSu;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getNgayBatDau() {
		return ngayBatDau;
	}

	public void setNgayBatDau(String ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	public String getNgayNghiviec() {
		return ngayNghiviec;
	}

	public void setNgayNghiviec(String ngayNghiviec) {
		this.ngayNghiviec = ngayNghiviec;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public String getNgoaiNgu() {
		return ngoaiNgu;
	}

	public void setNgoaiNgu(String ngoaiNgu) {
		this.ngoaiNgu = ngoaiNgu;
	}

	public String getTinHoc() {
		return tinHoc;
	}

	public void setTinHoc(String tinHoc) {
		this.tinHoc = tinHoc;
	}

	public String getThanhTich() {
		return thanhTich;
	}

	public void setThanhTich(String thanhTich) {
		this.thanhTich = thanhTich;
	}
	@ManyToOne
	@JoinColumn(name = "phongbanid", nullable = false)
	private Phongban phongban;
	
	@OneToOne
	@JoinColumn(name = "chucvuid",nullable = false)
	private Chucvu chucvu;

	public Phongban getPhongban() {
		return phongban;
	}

	public void setPhongban(Phongban phongban) {
		this.phongban = phongban;
	}

	public Chucvu getChucvu() {
		return chucvu;
	}

	public void setChucvu(Chucvu chucvu) {
		this.chucvu = chucvu;
	}

}
