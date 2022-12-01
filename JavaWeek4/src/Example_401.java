import java.util.*;

public class Example_401 {

	public static void main(String[] args) {
		Scanner Kb = new Scanner(System.in);
		String InputText ="";
		String wordtodisplay="";
		while (true) {
			System.out.print("Enter word: ");
			InputText = Kb.next();
			if(InputText.equalsIgnoreCase("stop")) {
				break;
			}
			wordtodisplay = wordtodisplay+InputText+" "; 
		}
		System.out.print(wordtodisplay.toUpperCase());
	}

}
