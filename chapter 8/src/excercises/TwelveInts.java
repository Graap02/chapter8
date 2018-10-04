package excercises;

import java.util.Scanner;

public class TwelveInts 
{

	public static void main(String[] args) 
	{
		double[] arrayNums = new double [13];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < arrayNums.length; i++) 
		{
			System.out.println("Enter a number >> ");
			arrayNums[i] = input.nextDouble(); 
		}
		System.out.println("The output is: ");
		for(int j=12; j>=0; j--) 
		{
			System.out.println(arrayNums[j]);
		}
		
		for(int j=0; j<=12; j++) 
		{
			System.out.println(arrayNums[j]);
		}

	}

}
