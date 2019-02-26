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
 * Servlet implementation class MyThirdServlet
 */
@WebServlet("/MyThirdServlet")
public class MyThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyThirdServlet() {
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

		String qual = request.getParameter("qual");
		out.println(" Qualification : " + qual);
		session.setAttribute("Qualify",qual);

		out.println("<html>");		
		out.println("<body>");		
		out.println("<form action = MyFourthServlet>");	
		out.println("Enter Marks: <input type = text name = mark>");
		out.println("<br>");
		out.println("<br>");
		out.println("<input type = submit value = 'Submit marks' />");
		out.println("</form>");		
		out.println("</body>");		
		out.println("</html>");			
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
