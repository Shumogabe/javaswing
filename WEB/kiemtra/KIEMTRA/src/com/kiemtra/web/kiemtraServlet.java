package com.kiemtra.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.kiemtra.dto.*;
import com.kiemtra.dao.*;
/**
 * Servlet implementation class kiemtraServlet
 */
@WebServlet("/")
public class kiemtraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public kiemtraServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/load":
				load(request, response);
				break;
			case "/delete":
				delete(request, response);
				break;
			case "/update":
				showupdate(request, response);
				break;
			default:
				load(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/add":
				add(request, response);
				break;
			case "/update":
				update(request, response);
				break;
			default:
				load(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
	private void load(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
		// GET data from DAO
		kiemtraDAO dao = new kiemtraDAO();
		List<kiemtraDTO> list = dao.getListThongTin();
		// SET data to JSP
		request.setAttribute("listS", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	private void delete(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
		// GET id from JSP
		int id = Integer.parseInt(request.getParameter("id"));
		// PASS id to DAO
		kiemtraDAO dao = new kiemtraDAO();
		dao.delete(id);
		response.sendRedirect("load");
	}
	private void add(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
		String magv = request.getParameter("magv");
		String hoten = request.getParameter("hoten");
		String tenbomon = request.getParameter("tenbomon");
		String hesoluong = request.getParameter("hesoluong");
		kiemtraDAO dao = new kiemtraDAO();
		dao.insert(magv, hoten, tenbomon, hesoluong);
		response.sendRedirect("load");
	}
	private void showupdate(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
		// GET id from JSP
		String id = request.getParameter("id");
		// PASS id to DAO
		kiemtraDAO dao = new kiemtraDAO();
		kiemtraDTO dto = dao.getListThongTinBy(id);
		request.setAttribute("tt", dto);
		request.getRequestDispatcher("them.jsp").forward(request, response);
	}
	private void update(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException, ServletException {
		// GET id from JSP
		String magv = request.getParameter("magv");
		String hoten = request.getParameter("hoten");
		String tenbomon = request.getParameter("tenbomon");
		String hesoluong = request.getParameter("hesoluong");
		// PASS id to DAO
		kiemtraDAO dao = new kiemtraDAO();
		dao.update(magv, hoten, tenbomon, hesoluong);;
		response.sendRedirect("load");
	}

}
