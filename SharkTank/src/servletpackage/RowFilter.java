package servletpackage;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.*;

/**
 * Servlet implementation class RowFilter
 */
public class RowFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RowFilter() {
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
		String row=request.getParameter("row");
		int row1=Integer.parseInt(row);
		DboperationImplementation impl=new DboperationImplementation();
	    //response.setContentType("text/html");
	    //PrintWriter pw=response.getWriter();
	    ArrayList result=impl.SeriesFilter(row1);
	    RequestDispatcher rd = request.getRequestDispatcher("Rowdisplay.jsp");
	    request.setAttribute("rowlist", result);
	    rd.forward(request, response);
	}

}
