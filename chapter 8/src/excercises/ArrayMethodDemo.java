package excercises;

import java.util.Scanner;

public class ArrayMethodDemo 
{

	public static void main(String[] args) 
	{
		double[] arrayNums = new double [10];
		Scanner input = new Scanner(System.in);
		double sum = 0;
		for(int i = 0; i < arrayNums.length; i++) 
		{
			System.out.println("Enter a number >> ");
			arrayNums[i] = input.nextDouble(); 
		}
		System.out.println("The output is: ");
		for(int j=9; j>=0; j--) 
		{
			System.out.println(arrayNums[j]);
		}
		System.out.println("The output backwards is: ");
		for(int j=0; j<=9; j++) 
		{
			System.out.println(arrayNums[j]);
		}
	}
	
	 
	
	
	
}