package connectionpackage;
import java.sql.*;
public class ConnectionFactory {

	private static ConnectionFactory instance=new ConnectionFactory();
	private static final String url="jdbc:mysql://localhost:3306/sharktank";
    private static final String username="root";
    private static final String password="";
    private static final String Driverclass="com.mysql.jdbc.Driver";
    Connection con=null;
    
    private Connection ConnectionFactory() 
    {
    	try{
    	
     Class.forName("Driverclass");
    	
    	}
    	catch(ClassNotFoundException e)
    	{
    		e.printStackTrace();
    		
    	}
    	return con;
    }
    private Connection Createconnection() {
    	try {
    		
    		con=DriverManager.getConnection(url, username, password);
    	}
    	catch (SQLException e) 
		{
			System.out.println("ERROR: Unable to Connect to Database.");
		}
		return con;
	}

	public static Connection getConnection() 
	{
		return instance.Createconnection();
    	
    }
	
	
}
