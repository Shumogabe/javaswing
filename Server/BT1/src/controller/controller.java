package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.model;

@WebServlet(urlPatterns = { "/bt" })
public class controller extends HttpServlet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://LAPTOP-R880T7P1\\SHUMOGABE;databaseName=QLSanpham;integratedSecurity=true";
		String user = "sa";
		String password = "";
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sinhvien");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
						+ rs.getString(4) + " " + rs.getFloat(5));
			}
			System.out.println("Successful");
		} catch (SQLException e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp, ResultSet rs) throws ServletException, IOException, SQLException {
		model model = new model();
		model.setId(rs.getString(1));
		model.setName(rs.getString(2));
		model.setFacultyname(rs.getString(3));
		model.setSex(rs.getString(4));
		model.setPoint(rs.getFloat(5));
		req.setAttribute("u", model);
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, resp);

	}
}
