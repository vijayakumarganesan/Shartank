package connectionpackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	private static ConnectionFactory instance=new ConnectionFactory();
	private static final String URL="jdbc:mysql://localhost:3306/psnabusmaintanance";
	private static final String USER="root";
	private static final String PASSWORD="";
	private static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	Connection con = null;
	private ConnectionFactory()
	{ 
		try {
		Class.forName(DRIVER_CLASS);
	}
	catch(ClassNotFoundException e)
	{ 
		e.printStackTrace();
	}
		
	}
	private Connection createConnection() {
		
		try
			{
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		}
		catch (SQLException e) 
		{
			System.out.println("ERROR: Unable to Connect to Database.");
		}
		return con;
	}

	public static Connection getConnection() 
	{
		return instance.createConnection();
	}
		

}
