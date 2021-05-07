package HelloWorld;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/form-nguoi-dung"})
public class Form extends HttpServlet{
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter printWriter = resp.getWriter();
	printWriter.println("<form action = '/HelloWorld/them-nguoi-dung' method = 'post'>");
	printWriter.println("ten: <input type ='test' name='ten'>");
	printWriter.println("tuoi: <input type ='test' name='tuoi'>");
	printWriter.println("diachi: <input type ='test' name='diachi'>");
	printWriter.println("<input type ='submit' value='submit'>");
	printWriter.println("</form>");
}
}
