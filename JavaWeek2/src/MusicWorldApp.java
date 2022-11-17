import javax.swing.*;
public class MusicWorldApp {
	static final double TAX_RATE = .0625;
	public static void main(String[] args) {
		String cdId ;
		String cdTitle ;
		int cdQuantity ;
		double cdPrice ;
		double cdSubtotal ;
		double cdTotal ;
		double tax = TAX_RATE*100;		
		cdId = JOptionPane.showInputDialog("This program calculates the total cost of a CD order \nPlese enter the ID of the CD");
		cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
		cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		cdSubtotal = cdPrice * cdQuantity;
		cdTotal =cdSubtotal * (1 + TAX_RATE);
		JOptionPane.showMessageDialog(null, "Summary of the transaction:"+
		"\n\nCD ID:"+cdId+"\nCD Title:"+cdTitle+"\nCD Unit Price:$"
		+cdPrice+"\nCD Quantity: "+cdQuantity+"\n\nSubtotal:$"+cdSubtotal+"\nTax rate: "+tax+"%\nTotal:$"+cdTotal+"\n\nEnd of Program");
	
		
		
	}

}
