package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.DBoperationImplementation;
import connectionpackage.Rent;
import connectionpackage.Rto;

/**
 * Servlet implementation class RentRetrive
 */
public class RentRetrive extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RentRetrive() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String busnumber=request.getParameter("busnumber");
		int busnumber1=Integer.parseInt(busnumber);
		DBoperationImplementation impl=new DBoperationImplementation();
	   // response.setContentType("text/html");
	   // PrintWriter pw=response.getWriter();
	  //  pw.println("<html>");
	   // pw.println("<body bgcolor='#E6E6FA'");
	    ArrayList result=impl.Rentretrive(busnumber1);
  	  RequestDispatcher rd = request.getRequestDispatcher("/RentDisplay.jsp");
	    request.setAttribute("rentlist", result);
	    rd.forward(request, response);
	    
	}


	}
