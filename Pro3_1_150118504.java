import java.util.Scanner;
public class Pro3_1_150118504 {
	public static void main(String[] args) {
		//create scan
		Scanner scan = new Scanner(System.in);
		
		//variables
		String str;
		
		//codes 
		System.out.println("Welcome to image printer program.");
		System.out.print("Please enter your squence :");
		str = scan.next();
		
		//for loops
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) - '0' > 0 && str.charAt(i) - '0' <= 9) {
				for(int j = 1; j < str.charAt(i) - '0'; j++) {
					if(str.charAt(i+1) == 'b')
						System.out.print(" ");
					else if(str.charAt(i+1) == 's')
						System.out.print("*");
					else if(str.charAt(i+1) == 'n')
						System.out.println();
					
				}
			}
			else if(str.charAt(i) == 'b')
				System.out.print(" ");
			else if(str.charAt(i) == 's')
				System.out.print("*");
			else if(str.charAt(i) == 'n')
				System.out.println();
		}
	}
}
