import javax.swing.*;

public class Example_402 {

	public static void main(String[] args) {
		String inputemail = JOptionPane.showInputDialog("Input your e-mail");
		while (inputemail.startsWith("@")||inputemail.contains(" 	")) {
			inputemail = JOptionPane.showInputDialog("Input your e-mail");
		}
		inputemail = inputemail.toLowerCase();
	if(inputemail.endsWith("@gmail.com")||inputemail.endsWith("@hotmail.com")) {
		JOptionPane.showMessageDialog(null, "Your email is "+inputemail);
	}
	else 
		JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
	}
		//boolean checkemail = inputemail.endsWith("@gmail.com")|| inputemail.endsWith("@hotmail.com");
		//JOptionPane.showMessageDialog(null,(checkemail)? "Your e-mail is "+ inputemail :"Your e-mail is not hotmail or gmail dot com");
		
}
