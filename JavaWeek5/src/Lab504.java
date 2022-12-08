import java.util.*;
public class Lab504 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fullName ;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Plase enter your name, separated by a space."+"\n:");
		fullName = scan.nextLine();
		String firstName = fullName.substring(0,fullName.indexOf(' '));
		System.out.println(abbreviatName(fullName)+firstName);
	}

	public static String abbreviatName(String fullname) {
		
		String initialLetter = "";
		for(int i=0 ; i<fullname.length() ; i++) {
			if(fullname.charAt(i)==' ') {
				initialLetter = (initialLetter + fullname.charAt(i+1)).toUpperCase();
				initialLetter = initialLetter +".";
			}
		}
		return initialLetter;
	}
	
}
