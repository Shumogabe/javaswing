package HelloWorld;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/them-nguoi-dung"})
public class Person extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		String ten = req.getParameter("ten");
		String tuoi = req.getParameter("tuoi");
		String diachi = req.getParameter("diachi");
		printWriter.println("Ten: "+ten+", tuoi "+tuoi+", diachi "+diachi);
	}
}
