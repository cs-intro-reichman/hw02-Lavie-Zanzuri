/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int t = Integer.parseInt(args[0]);
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int sum = 0;
		double average;
		for(int i=0; i < t;i++) {
			boolean girl = false;
			boolean boy = false;
			int count = 0;
			while(girl == false || boy == false) {
				double num1 = Math.random();
				if(num1 >= 0.5) {
					girl = true;
					count = count + 1;
					sum = sum + 1;
				}
				if(num1 < 0.5) {
					boy = true;
					count = count + 1;
					sum = sum + 1;
				}
			}
			if(count == 2) {
				count2 = count2 + 1;
			}
			if(count == 3) {
				count3 = count3 + 1;
			}
			if(count >= 4) {
				count4 = count4 + 1;
			}
		}
		average = (double)sum / t;
		System.out.println("Average: "+ average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + count2);
		System.out.println("Number of families with 3 children: " + count3);
		System.out.println("Number of families with 4 children or more: " + count4);
		if(count2 > count3 && count2 > count4) {
			System.out.println("The most common number of children is 2.");
		}
		if(count3 > count2 && count3 > count4) {
			System.out.println("The most common number of children is 3.");
		}
		if(count4 > count2 && count4 > count2) {
			System.out.println("The most common number of children is 4 or more.");
		}
	}		
}
