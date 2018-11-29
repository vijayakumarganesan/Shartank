package connectionpackage;

public class Battery {

	String date;
	int busnumber;
	String batterydescription;
	String storename;
	int amount;
	int quantity;
	int totalamount;
	public String getDate() {
		return date;
	}
	public int getBusnumber() {
		return busnumber;
	}
	public String getBatterydescription() {
		return batterydescription;
	}
	public String getStorename() {
		return storename;
	}
	public int getAmount() {
		return amount;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setBusnumber(int busnumber) {
		this.busnumber = busnumber;
	}
	public void setBatterydescription(String batterydescription) {
		this.batterydescription = batterydescription;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
}
