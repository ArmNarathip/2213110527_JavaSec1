import javax.swing.*;
import java.text.*;
import java.util.Random;
public class Lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		DecimalFormat frm = new DecimalFormat("#,###");
		int Withdraw = Integer.parseInt(JOptionPane.showInputDialog("You balance : "+frm.format(balance)+
				"\nInput money to withdraw:"));
		int B1000 = Withdraw/1000 , B500,B100;
		int withdraw1000 = Withdraw-(B1000*1000);
		B500 = withdraw1000/500;
		int withdraw500 = withdraw1000-(B500*500);
		B100 = withdraw500/100;
		int withdraw100 = withdraw500-(B100*100);
		if(Withdraw>balance) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if(Withdraw>20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw100 !=0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+withdraw100+" baht",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, 
					"You withdaw : "+frm.format(Withdraw)+
					"\n1000 ="+B1000+
					"\n500 ="+B500+
					"\n100 ="+B100);
		}
	}

}
