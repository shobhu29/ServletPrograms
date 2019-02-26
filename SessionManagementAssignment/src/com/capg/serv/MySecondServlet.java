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
 * Servlet implementation class MySecondServlet
 */
@WebServlet("/MySecondServlet")
public class MySecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MySecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		HttpSession  session = request.getSession();
		String fname = (String)session.getAttribute("FirstName");
		out.println(" First Name : " + fname);
		out.println("<br>");
		out.println("<br>");

		String lname = request.getParameter("lname");
		out.println(" Last Name : " + lname);
		session.setAttribute("LastName",lname);

		out.println("<html>");		
		out.println("<body>");		
		out.println("<form action = MyThirdServlet>");	
		out.println("Enter Qualification: <input type = text name = qual>");
		out.println("<br>");
		out.println("<br>");
		out.println("<input type = submit value = 'Submit qualification' />");
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
