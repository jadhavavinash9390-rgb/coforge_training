package Assignment_day_3;

import java.util.Scanner;

public class GradeCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks : ");
		
		int Marks = sc.nextInt();
		
		   if (Marks >= 90)
	            System.out.println("Grade A");
	        else if (Marks >= 80)
	            System.out.println("Grade B");
	        else if (Marks >= 70)
	            System.out.println("Grade C");
	        else if (Marks >= 60)
	            System.out.println("Grade D");
	        else
	            System.out.println("Grade F");
		sc.close();
		

	}

}
