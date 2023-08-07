package DSA;
import java.util.Scanner;
public class UserInput 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("Result" +c);
		
		
	}

}
