package HelloWorld;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/chuyen-huong-trang"})
public class Redirect extends HttpServlet{
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	resp.sendRedirect("https://www.hunre.edu.vn/");

}
}
