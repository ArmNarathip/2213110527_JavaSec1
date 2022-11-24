import javax.swing.*;
import java.text.*;
public class Lab301 {
	static final int pricePerson = 299;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberOfcustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double totalPrice = pricePerson * numberOfcustomer;
		int memberCard;
		do {
		memberCard = JOptionPane.showConfirmDialog(null, 
				"Total Price is "+totalPrice+"baht."+
				"\nDo you have a member card?");
		} while(memberCard ==2);
		double TotalPriceWithDiscount ;
		if(memberCard==0) {
			TotalPriceWithDiscount = totalPrice-(totalPrice*10/100); // discount = totalPrice*90/100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(TotalPriceWithDiscount)+" baht.");
		}
		else if(memberCard==1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalPrice)+" baht.");
		}
		
			
		
		
		

	}

}
