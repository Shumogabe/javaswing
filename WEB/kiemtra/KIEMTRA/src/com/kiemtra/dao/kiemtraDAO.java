package com.kiemtra.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kiemtra.dto.*;
public class kiemtraDAO {
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
	public List<kiemtraDTO> getListThongTin() {
		List<kiemtraDTO> list = new ArrayList<>();// Tạo list chứa dl
		try {
			conn = getConnection();// Mở kết nối
			sql = "select * from gv";
			ps = conn.prepareStatement(sql);// Ném câu lệnh
			rs = ps.executeQuery();// execute query và trả về kết quả
			while (rs.next()) {// Lấy dl từng dòng
				kiemtraDTO tt = new kiemtraDTO(
						rs.getInt("magv"), 
						rs.getString("hoten"),
						rs.getString("tenbomon"),
						rs.getInt("hesoluong"));// Lấy theo từng cột
				list.add(tt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// select by id select * from quanlithongtin where name = ?
	public kiemtraDTO getListThongTinBy(String masv) {
		try {
			conn = getConnection();// Mở kết nối
			sql = "select * from gv where magv = ?";
			ps = conn.prepareStatement(sql);// Ném câu lệnh
			ps.setString(1, masv);
			rs = ps.executeQuery();// execute query và trả về kết quả
			while (rs.next()) {// Lấy dl từng dòng
				return new kiemtraDTO(
						rs.getInt("magv"), 
						rs.getString("hoten"),
						rs.getString("tenbomon"),
						rs.getInt("hesoluong"));// Lấy theo từng cột
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// insert insert into quanlithongtin values(?,?,?)
	public void insert(String magv, String hoten, String tenbomon, String hesoluong)	{
		try {
			conn = getConnection();
			sql = "insert into gv values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, magv);
			ps.setString(2, hoten);
			ps.setString(3, tenbomon);
			ps.setString(4, hesoluong);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// update update quanlithongtin set name = ?, sex = ?, age =? where id = ?
	public void update(String magv, String hoten, String tenbomon, String hesoluong) {
		try {
			conn = getConnection();
			sql = "update gv set hoten = ?, tenbomon = ?, hesoluong = ? where magv = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, hoten);
			ps.setString(2, tenbomon);
			ps.setString(3, hesoluong);
			ps.setString(4, magv);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// delete delete from quanlithongtin where masv = ?
	public void delete(int id) {
		try {
			conn = getConnection();
			sql = "delete from gv where magv = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
