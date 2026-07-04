package Assignment_day_3;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			
			if(n % 2 == 0) 
				System.out.println("Even Number");
				else
					System.out.println("Odd Number");
			
	       sc.close();
		

	}

}
