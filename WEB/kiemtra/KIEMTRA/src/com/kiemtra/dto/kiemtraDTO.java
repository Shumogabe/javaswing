package com.kiemtra.dto;

public class kiemtraDTO {
	int magv, hesoluong;
	String hoten, tenbomon;
	public kiemtraDTO() {
		super();
	}
	public kiemtraDTO(int magv, String hoten, String tenbomon, int hesoluong) {
		super();
		this.magv = magv;
		this.hesoluong = hesoluong;
		this.hoten = hoten;
		this.tenbomon = tenbomon;
	}
	public int getMagv() {
		return magv;
	}
	public void setMagv(int magv) {
		this.magv = magv;
	}
	public int getHesoluong() {
		return hesoluong;
	}
	public void setHesoluong(int hesoluong) {
		this.hesoluong = hesoluong;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getTenbomon() {
		return tenbomon;
	}
	public void setTenbomon(String tenbomon) {
		this.tenbomon = tenbomon;
	}
	@Override
	public String toString() {
		return "kiemtraDTO [magv=" + magv + ", hesoluong=" + hesoluong + ", hoten=" + hoten + ", tenbomon=" + tenbomon
				+ "]";
	}
	
}
