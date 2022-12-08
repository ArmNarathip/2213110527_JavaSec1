import javax.swing.*;

public class Lab502 {

	static String email;
	
	public static void main(String[] args) {
		inputEmail(); //call inputEmail method
	}
	
	public static void inputEmail() {
		String ans ="";
		do {
			email = JOptionPane.showInputDialog("Input yout e-mail:");
			checkEmailError(email);		
			ans = JOptionPane.showInputDialog("Contiue [ y||Y to continue ] : ");		
	} while (ans.equalsIgnoreCase("y"));
}
	public static void checkEmailError(String chkEmail) {
		while (chkEmail.startsWith("@")||chkEmail.contains(" ")) {
			email = JOptionPane.showInputDialog("Input your e-mail,agian:");
		}
		chkEmail = chkEmail.toLowerCase();
		boolean checkEmail = chkEmail.endsWith("@gmail.com") || chkEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, (checkEmail)
				? "Your e-mail is "+ chkEmail
				: "Yout e-mail is not hotmail or gmail dot com");
	}
	
	
}

