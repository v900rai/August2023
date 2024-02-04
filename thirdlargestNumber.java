package target200qQQQTTOOnnSS;

import java.util.Scanner;

public class thirdlargestNumber 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+"  3rd largest NUmber");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+"3rd largest NUmber");
		}
		else
		{
			System.out.println(c+"3rd largest number");
		}
	}

}
