/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String str = args[0];
		String reverse = "";
		int length;
		char ch;
		char middle = str.charAt(0);	
		length = str.length();
		for(int i = 0;i<length;i ++)	{
			ch = str.charAt(length - 1 -i);
			reverse = reverse + ch;
		}
		if(length % 2 != 0)	{
			middle = str.charAt((int)(length / 2));
		}
		if(length % 2 == 0)	{
			middle = str.charAt((length / 2) - 1);
		}
		System.out.println(reverse);
		System.out.println("The middle character is "+middle);
	}
}
