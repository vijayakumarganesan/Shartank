 package connectionpackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import sun.util.calendar.BaseCalendar.Date;

public class DBoperationImplementation {
	
	public int busregistration(String date,int busnumber1,String spare,String storename,int amount1,int quantity1,int totalamount1)
	{
		String quary="INSERT INTO spareregistration(date,busnumber,spare,storename,amount,quantity,totalamount)values('"+date+"','"+busnumber1+"','"+spare+"','"+storename+"','"+amount1+"','"+quantity1+"','"+totalamount1+"')";
		Connection con=ConnectionFactory.getConnection();
		try {
			Statement sts=con.createStatement();
			int Status = sts.executeUpdate(quary);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
		
	}	
	public ArrayList spareRetrive(int busnumber1) {
		String quary="SELECT * FROM spareregistration WHERE busnumber='"+busnumber1 +"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Spares s1 = new Spares();
				s1.setDate(rs.getString(1) );
				s1.setBusnumber(rs.getInt(2));
				s1.setSparename(rs.getString(3));
				s1.setStore(rs.getString(4));
				s1.setAmount(rs.getInt(5));
				s1.setQuantity(rs.getInt(6));
				s1.setTotalamount(rs.getInt(7));
				mylist.add(s1);
				
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return mylist;

		
	}
	public int Rtoregistration(String date, int busnumber1, String description, int amount1, String amounttype) {
		// TODO Auto-generated method stub
		String quary="INSERT INTO rtoregistration(date,busnumber,description,amount,amounttype)values('"+date+"','"+busnumber1+"','"+description+"','"+amount1+"','"+amounttype+"')";
		Connection con=ConnectionFactory.getConnection();
		try {
			Statement sts=con.createStatement();
			int status=sts.executeUpdate(quary);
			
		}
		catch(SQLException e){

			e.printStackTrace();
		}
		return 0;
		
	}
	public ArrayList Rtoretrive(int busnumber1)
	{
		String quary="SELECT * FROM rtoregistration WHERE busnumber='"+busnumber1+"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Rto r1 = new Rto();
				r1.setDate(rs.getString(1) );
				r1.setBusnumber(rs.getInt(2));
				r1.setDescription(rs.getString(3));
				r1.setAmount(rs.getInt(4));
				r1.setAmounttype(rs.getString(5));
				mylist.add(r1);
				
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return mylist;
		
	}
	
	public int tyerDetail(String date,int busnumber1,String position,String workdetail,String storename,int amount)
	{
		
		int status = 0;
		String query = "INSERT INTO tyreregistration(date,busnumber,position,workdetail,storename,amount)values('"+date+"','"+busnumber1+"','"+position+"','"+workdetail+"','"+storename+"','"+amount+"')";
		Connection con = ConnectionFactory.getConnection();
		try
		{
		 Statement sts = con.createStatement();
		 status = sts.executeUpdate(query);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		
		return status; 
		
	}
	public ArrayList Tyreretrive(int busnumber1)
	{
		String quary="SELECT * FROM tyreregistration WHERE busnumber='"+busnumber1+"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Tyre r1 = new Tyre();
				r1.setDate(rs.getString(1) );
				r1.setBusnumber(rs.getInt(2));
				r1.setPosition(rs.getString(3));
				r1.setWorkdetail(rs.getString(4));
				r1.setStorename(rs.getString(5));
				r1.setAmount(rs.getInt(6));
				mylist.add(r1);
				
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return mylist;
		
	}
	public int Labourdetail(String date,int busnumber1,String workdescription,String workshopname,int amount1)
	
	{
		
		int status = 0;
		String query = "INSERT INTO labourregistration(date,busnumber,workdescription,workshopname,amount)values('"+date+"','"+busnumber1+"','"+workdescription+"','"+workshopname+"','"+amount1 +"')";
		Connection con = ConnectionFactory.getConnection();
		try
		{
		 Statement sts = con.createStatement();
		 status = sts.executeUpdate(query);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		
		return status; 
		
	}
	
	public ArrayList Labourretrive(int busnumber1)
	{
		String quary="SELECT * FROM labourregistration WHERE busnumber='"+busnumber1+"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Labour r1 = new Labour();
				r1.setDate(rs.getString(1) );
				r1.setBusnumber(rs.getInt(2));
				r1.setWorkdescription(rs.getString(3));
				r1.setWorkshopname(rs.getString(4));
				r1.setAmount(rs.getInt(5));
				mylist.add(r1);
				
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return mylist;
		
	}
	public int batteryregistration(String date,int busnumber1,String batterydescription,String storename,int amount1,int quantity1,int totalamount1)
	{
		String quary="INSERT INTO batteryregistration(date,busnumber,batterydescription,storename,amount,quantity,totalamount)values('"+date+"','"+busnumber1+"','"+batterydescription+"','"+storename+"','"+amount1+"','"+quantity1+"','"+totalamount1+"')";
		Connection con=ConnectionFactory.getConnection();
		try {
			Statement sts=con.createStatement();
			int Status = sts.executeUpdate(quary);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
		
	}	
	public ArrayList Batteryretrive(int busnumber1) {
		String quary="SELECT * FROM batteryregistration WHERE busnumber='"+busnumber1 +"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Battery s1 = new Battery();
				s1.setDate(rs.getString(1) );
				s1.setBusnumber(rs.getInt(2));
				s1.setBatterydescription(rs.getString(3));
				s1.setStorename(rs.getString(4));
				s1.setAmount(rs.getInt(5));
				s1.setQuantity(rs.getInt(6));
				s1.setTotalamount(rs.getInt(7));
				mylist.add(s1);			
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return mylist;

		
	}
	public int bodyworkregistration(String date, int busnumber1, String description, int amount1, String amounttype) {
		// TODO Auto-generated method stub
		String quary="INSERT INTO bodyworkregistration(date,busnumber,description,amount,amounttype)values('"+date+"','"+busnumber1+"','"+description+"','"+amount1+"','"+amounttype+"')";
		Connection con=ConnectionFactory.getConnection();
		try {
			Statement sts=con.createStatement();
			int status=sts.executeUpdate(quary);
			
		}
		catch(SQLException e){

			e.printStackTrace();
		}
		return 0;
		
	}
	public ArrayList bodyworkretrive(int busnumber1)
	{
		String quary="SELECT * FROM bodyworkregistration WHERE busnumber='"+busnumber1+"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Bodywork r1 = new Bodywork();
				r1.setDate(rs.getString(1) );
				r1.setBusnumber(rs.getInt(2));
				r1.setDescription(rs.getString(3));
				r1.setAmount(rs.getInt(4));
				r1.setAmounttype(rs.getString(5));
				mylist.add(r1);
				
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return mylist;
		
	}
	public int Rentregistration(String date, int busnumber1, String place, int rentamount1, int tollamount1) {
		// TODO Auto-generated method stub
		String quary="INSERT INTO rentregistration(date,busnumber,place,rentamount,tollamount)values('"+date+"','"+busnumber1+"','"+place+"','"+rentamount1+"','"+tollamount1+"')";
		Connection con=ConnectionFactory.getConnection();
		try {
			Statement sts=con.createStatement();
			int status=sts.executeUpdate(quary);
			
		}
		catch(SQLException e){

			e.printStackTrace();
		}
		return 0;
		
	}
	public ArrayList Rentretrive(int busnumber1)
	{
		String quary="SELECT * FROM Rentregistration WHERE busnumber='"+busnumber1+"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Rent r1 = new Rent();
				r1.setDate(rs.getString(1) );
				r1.setBusnumber(rs.getInt(2));
				r1.setPlace(rs.getString(3));
				r1.setRentamount(rs.getInt(4));
				r1.setTollamount(rs.getInt(5));
				mylist.add(r1);
				
			}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return mylist;
		
	}
	
	

}

 