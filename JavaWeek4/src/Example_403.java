import javax.swing.*;
//import java.util.*;
public class Example_403 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int countofspace = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				countofspace++;
			}
		}
		System.out.println("This sentence has "+countofspace+" spacebar.");
		System.out.println("This sentence has "+ (countofspace+1) + " spacebar.");*/
		String sentence = JOptionPane.showInputDialog("In put a sentence:");
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence, again : ");
			
		}
		int countofspace = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				countofspace++;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has "+countofspace+" spacebar.");
	}
	
	


}
