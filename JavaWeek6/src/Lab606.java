import java.util.*;
import javax.swing.*;

public class Lab606 {

	public static void main(String[] args) {
		
		int[] nums = { 25, 78, 41, 22, 36, 85, 37 };		
		int inputIndex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while(!checkIndex(nums,inputIndex)) {
			inputIndex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
		}
		JOptionPane.showMessageDialog(null, "Current data,nums[" + inputIndex + "] is " + currentData(nums,inputIndex) 
									+"\n"+(inputIndex-1!=-1?"Previous data,nums["+(inputIndex-1)+"] is "+prevData(nums,inputIndex):"No previous data")
									+"\n"+(inputIndex+1!=7?"Next data,nums["+(inputIndex+1)+"] is "+nextData(nums,inputIndex):"No next data"));
		
		prevData(nums,inputIndex);
		nextData(nums,inputIndex);
	}
	private static boolean checkIndex(int[] nums, int index) {
		
		return (index >=0 && index <7);			
		
					
	}
	private static int currentData(int[] nums, int index) {
		int value = nums[index];
		return value;
		
		

	}

	private static int prevData(int[] nums, int index) {
		
		return (index >= 0 && index <= 6) ? nums[index - 1] : -1;
	}

	private static int nextData(int[] nums, int index) {
		
		return (index >= 0 && index <= 6) ? nums[index + 1] : -1;
	}

	
}
	
		

