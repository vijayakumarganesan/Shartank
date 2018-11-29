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
 * Servlet implementation class SeriesFilter
 */
public class SeriesFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeriesFilter() {
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
		String series=request.getParameter("series");
		int series1=Integer.parseInt(series);
		DboperationImplementation impl=new DboperationImplementation();
	    //response.setContentType("text/html");
	    //PrintWriter pw=response.getWriter();
	    ArrayList result=impl.SeriesFilter(series1);
	    RequestDispatcher rd = request.getRequestDispatcher("Seriesdisplay.jsp");
	    request.setAttribute("serieslist", result);
	    rd.forward(request, response);
	}

}
