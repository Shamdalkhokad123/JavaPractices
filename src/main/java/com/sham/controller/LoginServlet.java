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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private static final String TAG = LoginServlet.class.getSimpleName();
     
     public void init() {
    	 System.out.println(TAG +" started");
     }
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(TAG +" inside doPost() ");
		
		try {
			String fname = new LoginDAO().login(request);
			
			if(fname == null) {
				RequestDispatcher rd = request.getRequestDispatcher("JSP/invalid.jsp");
				rd.forward(request, response);
			}else {
				Cookie ck = new Cookie("fname",fname);
				response.addCookie(ck);//adding this to cookie
				
				this.getServletContext().setAttribute("fname", fname);
				
				RequestDispatcher rd = request.getRequestDispatcher("JSP/valid.jsp");
				rd.forward(request, response);
			}
			
		} catch (Exception e) {

			System.out.println(TAG + " exception in login "+e.getLocalizedMessage());
		}
	}

}
