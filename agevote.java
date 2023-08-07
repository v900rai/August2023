package DSA;

import java.util.Scanner;
public class agevote 
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the user name");
		int age=sc.nextInt();
		if(age>=50)
		{
			System.out.println("You are eligible for voting");
			
		}
		else
		{
			System.out.println("You are not eligible for voting ");
		}
		
	}

}
