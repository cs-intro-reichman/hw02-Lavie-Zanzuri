/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args)	{
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		int count = 0;
		int j = 1;
		for(int i = 1;i < num;i ++) {
			if(num%i==0) { 
				count = count + i;
			}
		}
		if(count == num) {
			System.out.print(num +" is a perfect number since "+ num +" =");
			while(j < num) {
				if(num % j == 0) {
					if(j == 1) {
						System.out.print(" "+ j);
					}
					else {
						System.out.print(" + "+ j);
					}
					
				}
				j = j + 1;
			}
		}
		else {
			System.out.print(num +" is not a perfect number" );
		}

	}
}
