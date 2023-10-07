package com.sham.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sham.dao.LoginDAO;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/admin-login")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String TAG = AdminLoginServlet.class.getSimpleName();

	public void init() {
		System.out.println(TAG + " started");
	}

	public AdminLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(TAG + " inside doPost() ");

		try {
			String fname = new LoginDAO().login(request);

			if (fname == null) {
				RequestDispatcher rd = request.getRequestDispatcher("JSP/invalid.jsp");
				rd.forward(request, response);
			} else {
				Cookie ck = new Cookie("fname", fname);
				response.addCookie(ck);// adding this to cookie

				this.getServletContext().setAttribute("fname", fname);

				RequestDispatcher rd = request.getRequestDispatcher("JSP/valid.jsp");
				rd.forward(request, response);
			}

		} catch (Exception e) {

			System.out.println(TAG + " exception in login " + e.getLocalizedMessage());
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
