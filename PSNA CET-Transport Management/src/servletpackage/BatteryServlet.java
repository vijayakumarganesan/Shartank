package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.DBoperationImplementation;

/**
 * Servlet implementation class BatteryServlet
 */
public class BatteryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatteryServlet() {
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
		String batterydescription=request.getParameter("batterydescription");
		String storename=request.getParameter("storename");
		String amount=request.getParameter("amount");
		String quantity=request.getParameter("quantity");
		String totalamount=request.getParameter("totalamount");
		int busnumber1=Integer.parseInt(busnumber);
		int amount1=Integer.parseInt(amount);
		int quantity1=Integer.parseInt(quantity);
		int totalamount1=Integer.parseInt(totalamount);
		DBoperationImplementation impl=new DBoperationImplementation();
		int result=impl.batteryregistration(date, busnumber1, batterydescription, storename, amount1, quantity1, totalamount1);  
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		if(result != -1){
			pw.println("Registered Successfully" );
		}else{
			pw.println("Registration Failed");
		}

	}

	}
