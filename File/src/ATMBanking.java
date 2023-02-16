import java.util.*;
import java.text.*;
public class ATMBanking {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter account number : ");
		String AccNum = scan.next();
		while(AccNum.length()!=14) {
			System.out.print("Input wrong type, Enter account number : ");
			AccNum = scan.next();
			
		}
		System.out.print("Enter password : ");
		String pass = scan.next();
		while(pass.length() != 4) {
			System.out.print("Enter password : ");
			pass = scan.next();
		}
		System.out.print("Enter money : ");
		int money = scan.nextInt();
		while(money <=0) {
			System.out.print("Enter money : ");
			money = scan.nextInt();
	}
		ATMChecking bank = new ATMChecking(AccNum,pass,money);
		bank.show();

}
