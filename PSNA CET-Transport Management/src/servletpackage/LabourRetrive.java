package servletpackage;

import java.io.IOException;
import connectionpackage.*;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.DBoperationImplementation;
import connectionpackage.Labour;
import connectionpackage.Spares;

/**
 * Servlet implementation class LabourRetrive
 */
public class LabourRetrive extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LabourRetrive() {
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
	    //PrintWriter pw=response.getWriter();
    	ArrayList result=impl.Labourretrive(busnumber1);
        RequestDispatcher rd = request.getRequestDispatcher("/LabourDisplay.jsp");
  	    request.setAttribute("labourlist", result);
  	    rd.forward(request, response);
	   
	}

	}

