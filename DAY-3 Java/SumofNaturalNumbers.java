package Assignment_day_3;

import java.util.Scanner;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			
		}
		System.out.println("Sum = " + sum);
		sc.close();
	}

}
