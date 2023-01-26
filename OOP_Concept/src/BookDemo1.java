import java.util.*;
public class BookDemo1 {
static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input author name	   :");
		String name = scan.nextLine();
		System.out.print("InPut author email   :");
		String email = scan.next();
		
		Author1 narathip = new Author1(name,email);
		System.out.println(narathip);
		
		System.out.print("Input book title     :");
		scan.nextLine();
		String title = scan.nextLine();
		int page =scan.nextInt();
		
		System.out.println();
		Book1 book = new Book1(title,narathip,page);
		System.out.println(book);
	}

}
