package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Connect {
	public Connection connection = null;
	//Phuong thuc thuc hien ket noi CSDL
	public void connectSQL() throws SQLException {
		try {
			String userName = "sa";
			String password = "123456";
			String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSanpham;";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = java.sql.DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Ket noi CSDL that bai", "Thong bao", 1);
		}
	}
	//Phuong thuc dung de truy van CSDL
	public ResultSet LoadData(String sql) {
		ResultSet result = null;
		try {
			Statement statement = connection.createStatement();
			return statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	//Phuong thuc thuc hien Them, Xoa, Sua du lieu
	public void UpdateData(String sql) {
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
