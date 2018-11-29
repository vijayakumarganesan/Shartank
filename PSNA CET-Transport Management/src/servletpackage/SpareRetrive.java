package servletpackage;

import java.io.IOException;

import java.io.PrintWriter;
import java.net.ResponseCache;
import java.util.ArrayList;

import connectionpackage.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SpareRetrive
 */
public class SpareRetrive extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpareRetrive() {
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
	    //response.setContentType("text/html");
	  //  PrintWriter pw=response.getWriter();
	    ArrayList result=impl.spareRetrive(busnumber1);
	    RequestDispatcher rd = request.getRequestDispatcher("/SpareDisplay.jsp");
	    request.setAttribute("sparelist", result);
	    rd.forward(request, response);
	   	}

}
