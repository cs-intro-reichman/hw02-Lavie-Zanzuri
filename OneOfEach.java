
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		boolean girl = false;
		boolean boy = false;
		int count = 0;
		while(girl == false || boy == false) {
			num1 = Math.random();
			if(num1 >= 0.5) {
				System.out.print("g ");
				girl = true;
				count = count + 1;
			}
			if(num1 < 0.5) {
				System.out.print("b ");
				boy = true;
				count = count + 1;
			}
		}
		System.out.println();
		System.out.println("You made it... and now you have " + count +" children.");	
	}
}
