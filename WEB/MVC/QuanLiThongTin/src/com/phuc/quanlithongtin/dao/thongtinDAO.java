package com.phuc.quanlithongtin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.phuc.quanlithongtin.dto.thongtinDTO;

public class thongtinDAO {
	String url = "jdbc:sqlserver://LAPTOP-R880T7P1\\SHUMOGABE;databaseName=javaweb;integratedSecurity=true";
	String user = "sa";
	String password = "123456";
	String db = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	Connection conn = null; // Kết nối sql
	PreparedStatement ps = null;// Ném câu lệnh query từ eclipse sang sqlserver
	String sql = null;// Câu truy vấn
	ResultSet rs = null;// Nhận kết quả trả về

	public void load(String db) {
		try {
			Class.forName(db);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			Class.forName(db);// Đăng ký JDBC driver cho SQL Server và thiết lập kết nối.
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Successful");
		} catch (SQLException e) {
			System.out.println("Fail");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	// TRUY VẤN
	//
	// select select * from quanlithongtin
	public List<thongtinDTO> getListThongTin() {
		List<thongtinDTO> list = new ArrayList<>();// Tạo list chứa dl
		try {
			conn = getConnection();// Mở kết nối
			sql = "select * from quanlithongtin";
			ps = conn.prepareStatement(sql);// Ném câu lệnh
			rs = ps.executeQuery();// execute query và trả về kết quả
			while (rs.next()) {// Lấy dl từng dòng
				thongtinDTO tt = new thongtinDTO(
						rs.getInt("masv"), 
						rs.getString("hoten"), 
						rs.getString("tenkhoa"),
						rs.getInt("gioitinh"),
						rs.getInt("diemtin"));// Lấy theo từng cột
				list.add(tt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// select by id select * from quanlithongtin where name = ?
	public thongtinDTO getListThongTinBy(String masv) {
		try {
			conn = getConnection();// Mở kết nối
			sql = "select * from quanlithongtin where masv = ?";
			ps = conn.prepareStatement(sql);// Ném câu lệnh
			ps.setString(1, masv);
			rs = ps.executeQuery();// execute query và trả về kết quả
			while (rs.next()) {// Lấy dl từng dòng
				return new thongtinDTO(
						rs.getInt("masv"), 
						rs.getString("hoten"), 
						rs.getString("tenkhoa"),
						rs.getInt("gioitinh"),
						rs.getInt("diemtin"));// Lấy theo từng cột
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// insert insert into quanlithongtin values(?,?,?)
	public void insert(String masv, String hoten, String tenkhoa, String gioitinh, String diemtin)	{
		try {
			conn = getConnection();
			sql = "insert into quanlithongtin values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, masv);
			ps.setString(2, hoten);
			ps.setString(3, tenkhoa);
			ps.setString(4, gioitinh);
			ps.setString(5, diemtin);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// update update quanlithongtin set name = ?, sex = ?, age =? where id = ?
	public void update(String masv, String hoten, String tenkhoa, String gioitinh, String diemtin) {
		try {
			conn = getConnection();
			sql = "update quanlithongtin set hoten = ?, tenkhoa = ?, gioitinh = ?, diemtin = ? where masv = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, hoten);
			ps.setString(2, tenkhoa);
			ps.setString(3, gioitinh);
			ps.setString(4, diemtin);
			ps.setString(5, masv);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// delete delete from quanlithongtin where masv = ?
	public void delete(int id) {
		try {
			conn = getConnection();
			sql = "delete from quanlithongtin where masv = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
