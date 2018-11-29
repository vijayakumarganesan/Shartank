package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.Battery;
import connectionpackage.DBoperationImplementation;
import connectionpackage.Spares;

/**
 * Servlet implementation class BatteryRetrive
 */
public class BatteryRetrive extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatteryRetrive() {
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
		System.out.println(busnumber);
		int busnumber1=Integer.parseInt(busnumber);
		DBoperationImplementation impl=new DBoperationImplementation();
	    //response.setContentType("text/html");
	    //PrintWriter pw=response.getWriter();
	    ArrayList result=impl.Batteryretrive(busnumber1);
	    //request.setAttribute("mylist", result);
	   
	    //if( !='\0') {
	    RequestDispatcher rd = request.getRequestDispatcher("/BatteryDisplay.jsp");
	    request.setAttribute("mylist", result);
	    rd.forward(request, response);
	}

}
