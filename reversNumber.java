package DSA;

public class reversNumber 
{
	public static void main(String []vishal)
	{
		int number=12345;
		int reverse=0;
		while(number!=0)
		{
			int reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}
		System.out.println("Revres number  " +reverse);
	}

}
