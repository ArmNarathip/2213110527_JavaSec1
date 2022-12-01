import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String Upword = message.toUpperCase();
		if (Upword.contains("NICHI")) {
			System.out.println("Nichi is sentence");
			
		}
		else {
			System.out.print(message);
		}
	}

}
