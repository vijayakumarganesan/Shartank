package connectionpackage;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DboperationImplementation {
	public ArrayList SeriesFilter(int series) {
	String quary="SELECT * FROM sharktanktable WHERE series='"+series+"'";
	Connection con =ConnectionFactory.getConnection();
	ArrayList mylist = new ArrayList();
	try {
		Statement sts=con.createStatement();
		ResultSet rs=sts.executeQuery(quary);
		while(rs.next()) {
			Series s1 = new Series();
			s1.setRow(rs.getInt(1));
			s1.setSeason(rs.getInt(2));
			s1.setSeries(rs.getInt(3));
			s1.setCompany(rs.getString(4));
			s1.setDeal(rs.getString(5));
			s1.setIndustory(rs.getString(6));
			s1.setGender(rs.getString(7));
			s1.setAmount(rs.getInt(8));
			s1.setEquity(rs.getString(9));			
			mylist.add(s1);
			
		}
		
	}
	
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	

	return mylist;

	}
	public ArrayList SeasonFilter(int season) {
		String quary="SELECT * FROM sharktanktable WHERE season='"+season+"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Season s1 = new Season();
				s1.setRow(rs.getInt(1));
				s1.setSeason(rs.getInt(2));
				s1.setSeries(rs.getInt(3));
				s1.setCompany(rs.getString(4));
				s1.setDeal(rs.getString(5));
				s1.setIndustory(rs.getString(6));
				s1.setGender(rs.getString(7));
				s1.setAmount(rs.getInt(8));
				s1.setEquity(rs.getString(9));			
				mylist.add(s1);
				
			}
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

		return mylist;

		}

	public ArrayList AmountFilter(int amount) {
		String quary="SELECT * FROM sharktanktable WHERE amount='"+amount+"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Amount s1 = new Amount();
				s1.setRow(rs.getInt(1));
				s1.setSeason(rs.getInt(2));
				s1.setSeries(rs.getInt(3));
				s1.setCompany(rs.getString(4));
				s1.setDeal(rs.getString(5));
				s1.setIndustory(rs.getString(6));
				s1.setGender(rs.getString(7));
				s1.setAmount(rs.getInt(8));
				s1.setEquity(rs.getString(9));			
				mylist.add(s1);
				
			}
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

		return mylist;

		}
	public ArrayList GenderFilter(String gender) {
		String quary="SELECT * FROM sharktanktable WHERE gender='"+gender+"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Gender s1 = new Gender();
				s1.setRow(rs.getInt(1));
				s1.setSeason(rs.getInt(2));
				s1.setSeries(rs.getInt(3));
				s1.setCompany(rs.getString(4));
				s1.setDeal(rs.getString(5));
				s1.setIndustory(rs.getString(6));
				s1.setGender(rs.getString(7));
				s1.setAmount(rs.getInt(8));
				s1.setEquity(rs.getString(9));			
				mylist.add(s1);
				
			}
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

		return mylist;

		}
	public ArrayList RowFilter(int row) {
		String quary="SELECT * FROM sharktanktable WHERE row='"+row+"'";
		Connection con=ConnectionFactory.getConnection();
		ArrayList mylist = new ArrayList();
		try {
			Statement sts=con.createStatement();
			ResultSet rs=sts.executeQuery(quary);
			while(rs.next()) {
				Row s1 = new Row();
				s1.setRow(rs.getInt(1));
				s1.setSeason(rs.getInt(2));
				s1.setSeries(rs.getInt(3));
				s1.setCompany(rs.getString(4));
				s1.setDeal(rs.getString(5));
				s1.setIndustory(rs.getString(6));
				s1.setGender(rs.getString(7));
				s1.setAmount(rs.getInt(8));
				s1.setEquity(rs.getString(9));			
				mylist.add(s1);
				
			}
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

		return mylist;

		}

}
