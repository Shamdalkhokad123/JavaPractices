package com.sham.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String TAG = LogoutServlet.class.getSimpleName();
    
    public void init() {
    	System.out.println(TAG + " started ");
    }
  
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(TAG + " inside doGet() ");
		try {
			Cookie[] ck = request.getCookies();
			
			if(ck == null) {
				RequestDispatcher rd = request.getRequestDispatcher("JSP/invalid.jsp");
				rd.forward(request, response);
			}else {
				ck[0].setMaxAge(0);
			}
			RequestDispatcher rd = request.getRequestDispatcher("JSP/logout.jsp");
			rd.forward(request, response);
			
			
		} catch (Exception e) {
			System.out.println(TAG +" exception while logout "+e.getLocalizedMessage());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
