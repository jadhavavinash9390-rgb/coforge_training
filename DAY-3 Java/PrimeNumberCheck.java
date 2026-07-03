package Assignment_day_3;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		 if (n <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime)
	            System.out.println("Prime Number");
	        else
	            System.out.println("Not Prime Number");

	        sc.close();

	}

}
