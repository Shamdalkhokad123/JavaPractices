package com.sham.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sham.dao.DeleteDAO;
import com.sham.dao.RetrieveDAO;
import com.sham.model.ProductBean;

/**
 * Servlet implementation class MyCodeServlet
 */
@WebServlet("/my-code")
public class MyCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String TAG = MyCodeServlet.class.getSimpleName();
    
    public void init() {
    	System.out.println(TAG +" started");
    }
   
    public MyCodeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(TAG + "inside doGet() ");
		
		try {
			Cookie[] ck = request.getCookies();
			
			if(ck == null) {
				request.getRequestDispatcher("JSP/invalid.jsp").forward(request, response);
			}else {
				String fname = ck[0].getValue();
				request.setAttribute("fname", fname);
				String s2 = request.getParameter("s2");
				
				//check s2 is empty or not
				if(s2 == "Update") {
					ProductBean bean = new RetrieveDAO().retrieve(request);
					request.setAttribute("pb", bean);
					request.getRequestDispatcher("JSP/update.jsp").forward(request, response);
				}else {
					//for delete
					int i = new DeleteDAO().delete(request);
					
					if(i>0) {
						request.getRequestDispatcher("JSP/deletesuccess.jsp").forward(request, response);
					}
				}
			}
			
		} catch (Exception e) {
			System.out.println(TAG +" exception while checking code "+e.getLocalizedMessage());
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
