package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://LAPTOP-R880T7P1\\SHUMOGABE;databaseName=javaweb;integratedSecurity=true";
		String user = "sa";
		String password = "";
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from quanlithongtin");
			while (rs.next()) {
                System.out.println(rs.getString(1)+ " "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getFloat(5));
            }
			System.out.println("Successful");
		} catch (SQLException e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
}
