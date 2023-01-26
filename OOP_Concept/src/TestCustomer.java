
public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		System.out.println(c1.toString());
		c1.setDiscount(5);
		System.out.println(c1.toString());
		Line();
		System.out.println("\nid is: "+c1.getID());
		System.out.println("name is: "+c1.getName());
		System.out.println("discount is:"+c1.getDiscount());
		Line();
		System.out.println("###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1, 12000.00);
		System.out.println(inv1.toString());
		Line();
		System.out.println("\nid is :"+inv1.getID());
		System.out.println("customer is :"+c1.toString());
		System.out.println("amount is :"+inv1.getAmount());
		Line();

		public static void Line() {
		for(int i=0;i<60;i++) {
			System.out.print("*");
		}
		}

}
