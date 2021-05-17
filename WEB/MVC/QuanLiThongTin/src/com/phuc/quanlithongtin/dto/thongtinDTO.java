package com.phuc.quanlithongtin.dto;

public class thongtinDTO {
	int masv;
	String hoten;
	String tenkhoa;
	int gioitinh;
	int diemtin;
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getTenkhoa() {
		return tenkhoa;
	}
	public void setTenkhoa(String tenkhoa) {
		this.tenkhoa = tenkhoa;
	}
	public int getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(int gioitinh) {
		this.gioitinh = gioitinh;
	}
	public int getDiemtin() {
		return diemtin;
	}
	public void setDiemtin(int diemtin) {
		this.diemtin = diemtin;
	}
	public thongtinDTO() {
		super();
	}
	public thongtinDTO(int masv, String hoten, String tenkhoa, int gioitinh, int diemtin) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.tenkhoa = tenkhoa;
		this.gioitinh = gioitinh;
		this.diemtin = diemtin;
	}
	@Override
	public String toString() {
		return "thongtinDTO [masv=" + masv + ", hoten=" + hoten + ", tenkhoa=" + tenkhoa + ", gioitinh=" + gioitinh
				+ ", diemtin=" + diemtin + "]";
	}
	
	
}
