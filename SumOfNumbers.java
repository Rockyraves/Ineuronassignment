package Assignment1;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length");
		int length=sc.nextInt();
		double sum=0;
		
		for(int i=1;i<=length;i++)
		{
			System.out.println("Enter the"+" "+i+" "+"value");
			double num=sc.nextDouble();
			sum=num+sum;	
		}
		System.out.println("Total sum is"+" "+sum);
		

	}

}
