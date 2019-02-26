package com.capg.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyFourthServlet
 */
@WebServlet("/MyFourthServlet")
public class MyFourthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFourthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		HttpSession  session = request.getSession();
		String fname = (String)session.getAttribute("FirstName");
		out.println(" First Name : " + fname);
		out.println("<br>");
		out.println("<br>");
		
		String lname = (String)session.getAttribute("LastName");
		out.println(" Last Name : " + lname);
		out.println("<br>");
		out.println("<br>");
		
		String qual = (String)session.getAttribute("Qualify");
		out.println(" Qualification : " + qual);
		out.println("<br>");
		out.println("<br>");

		String mark = request.getParameter("mark");
		out.println(" Marks : " + mark);
		session.setAttribute("Marks",mark);
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
