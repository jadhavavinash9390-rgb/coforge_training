package Assignment_day_3;

import java.util.Scanner;

public class LargestofThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a >= b & a >= c)
			System.out.println("Largest = " + a);
		if(b >= a & b >= c)
			System.out.println("Largest = " + b);
		if(c >= a & c >= b)
			System.out.println("Largest = " + c);
		sc.close();

	}

}
