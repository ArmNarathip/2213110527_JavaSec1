
public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id, Customer customer,double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	public int getID() {
		return this.id;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getCustomerID() {
		return customer.getID();
	}
	public String getCustomerName() {
		return customer.getName();
	}
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	public double getAmountAfterDiscount() {
		return getAmount()-customer.getDiscount();
	}
	public String toString() {
		return "Invoice[id="+id+",customer="+customer.getName()
		+"("+customer.getID()+")("+customer.getDiscount()+"%),amount="
		+getAmount();
	}
}
