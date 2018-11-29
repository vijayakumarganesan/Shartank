package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.DBoperationImplementation;

/**
 * Servlet implementation class RentServlet
 */
public class RentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RentServlet() {
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
		String date=request.getParameter("date");
		String busnumber=request.getParameter("busnumber");
		String place=request.getParameter("place");
		String rentamount=request.getParameter("rentamount");
		String tollamount=request.getParameter("tollamount");
		int busnumber1=Integer.parseInt(busnumber);
		int rentamount1=Integer.parseInt(rentamount);
		int tollamount1=Integer.parseInt(tollamount);
		DBoperationImplementation impl=new DBoperationImplementation();
		int result=impl.Rentregistration(date, busnumber1, place,rentamount1,tollamount1);  
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		if(result != -1){
			pw.println("Registered Successfully" );
		}else{
			pw.println("Registration Failed");
		}

	}

	}
