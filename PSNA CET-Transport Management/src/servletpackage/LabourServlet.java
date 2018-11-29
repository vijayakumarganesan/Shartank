package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.DBoperationImplementation;

/**
 * Servlet implementation class LabourServlet
 */
public class LabourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LabourServlet() {
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
		String workdescription=request.getParameter("workdescription");
		String workshopname=request.getParameter("workshopnname");
		String amount=request.getParameter("amount");
		
	int busnumber1=Integer.parseInt(busnumber);
	int amount1=Integer.parseInt(amount);
	
		
		DBoperationImplementation impl = new DBoperationImplementation();
		int result = impl.Labourdetail(date,busnumber1,workdescription,workshopname,amount1);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
		if(result != -1){
			pw.println("Inserted Successfully");
		}else{
			pw.println("Insertion Failed");
	}

}

	}
