
import javax.swing.*;

public class Lab605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i + 1) + " : "));
		}
		showEven(numbers);
		showOdd(numbers);

	}

	private static void showEven(int[] num) {
		String Evennums = "";
		for (int _num : num) {
			if (_num % 2 == 0) {
				Evennums = Evennums + _num + " ";
			}

		}
		JOptionPane.showMessageDialog(null, "List of even number: \n" + Evennums);
	}

	private static void showOdd(int[] num) {
		String Oddnums = "";
		for (int _num : num) {
			if (_num % 2 != 0) {
				Oddnums = Oddnums + _num + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number: \n" + Oddnums);
	}

}
