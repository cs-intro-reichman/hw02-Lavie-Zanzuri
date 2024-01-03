/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			if(i!=0) {
				System.out.println();
			}				
			for(int j=0; j<n;j++) {
				if(i % 2 == 1) {
					System.out.print(" *");
				}
				if(i % 2 == 0) {
					System.out.print("* ");
				}
			}
		}
		
	}
}
