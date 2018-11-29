package connectionpackage;

import java.util.ArrayList;
import java.util.Date;

public interface DBoperation {
	public int busregistration(String date,int busnumber,String spare,String storename,int amount,int quantity,int totalamount);
	public ArrayList spareRetrive(int busnumber1);
	public int Rtoregistration(String date,int busnumber,String description,int amount,String amounttype);
	public ArrayList Rtoretrive(int busnumber1);
	public int tyerDetail(String date,int busnumber1,String position,String workdetail,String storename,int amount);
	public ArrayList Tyreretrive(int busnumber1);
	public int Labourdetail(String date,int busnumber1,String workdescription,String workshopname,int amount1);
	public ArrayList Labourretrive(int busnumber);
	public int batteryregistration(String date,int busnumber1,String batterydescription,String storename,int amount1,int quantity1,int totalamount1);
	public ArrayList Batteryretrive(int busnumber1);
	public int bodyworkregistraion(String date, int busnumber1, String description, int amount1, String amounttype);
	public ArrayList bodyworkretrive(int busnumber1);
	public int Rentregistration(String date, int busnumber1, String place, int rentamount1, int tollamount1);
    public ArrayList Rentretrive(int busnumber1);
}
