import java.util.Scanner;
public class Pro3_2_150118504 {

	public static void main(String[] args) {
		//create scan
		Scanner scan = new Scanner(System.in);
		
		//Variables
		int size;
		char letter;
		int exit = 0;
		int exit2 = 0;
		char yOrN;
		
		
		//codes
		System.out.println("Welcome to letter printer program.");
		do {
			System.out.print("Please enter the size: ");
			size = scan.nextInt();
			do {
				if(size < 5 || size % 2 == 0) {
					System.out.print("Invalid size. Enter the size again: ");
					size = scan.nextInt();
					}
				}while(size < 5 || size % 2 == 0);
			System.out.print("Please enter the letter: ");
			letter = scan.next().charAt(0);
			do {
				if('X' == Character.toUpperCase(letter) || 'Y' == Character.toUpperCase(letter) || 'Z' == Character.toUpperCase(letter) || 'W' == Character.toUpperCase(letter))
					exit += 1;
				else {
					System.out.print("Invalid letter. Enter the letter again: ");
					letter = scan.next().charAt(0);
					exit = 0;
				}
			}while(exit == 0);
			
			//for "x" letter
			if('X' == Character.toUpperCase(letter)) {
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					if(j == i || j == size - i -1)
						System.out.print("*");
					else
						System.out.print(" ");
					}
				System.out.println();
				}
			}
			
			//for "z" letter
			if('Z' == Character.toUpperCase(letter)) {
			for(int i = 0; i <= size - 1; i++) {
				for(int j = 1; j <= size; j++) {
					if(i == 0 || i == size - 1)
						System.out.print("*");
					else if(i < size - j || i > size - j)
						System.out.print(" ");
					else
						System.out.print("*");
					}
				System.out.println();
				}
			}
			
			//for "y" letter
			if('Y' == Character.toUpperCase(letter)){
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					if((i < size / 2) && (j == i || j == size - i -1))
						System.out.print("*");
					else if(j == size / 2 && i >= size / 2)
						System.out.print("*");
					else
						System.out.print(" ");
					}
				System.out.println();
				}
			}
			
			//for "w" letter
			if('W' == Character.toUpperCase(letter)){
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < 4 * size - 3; j++) {
					if(j == i || (i == 0 && j == (4 * size - 3) / 2) ||(i == 0 && j == 4 * size - 4)) 
						System.out.print("*");
					else if(j == (4 * size - 3) / 2 - i || j == (4 * size - 3) / 2 + i)
						System.out.print("*");
					else if(j == 4 * size - 4 - i)
						System.out.print("*");
					else
						System.out.print(" ");
					}
				System.out.println();
				}
			}
		System.out.print("Would you like to continue? (Y or N) :");
		yOrN = scan.next().charAt(0);
		if('N' == Character.toUpperCase(yOrN))
			exit2 += 1;
		
		}while(exit2 == 0);
	}

}
