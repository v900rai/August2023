package target200qQQQTTOOnnSS;

public class stringProgram 
{
	public static void main(String []args)
	{
		String str="vishal";
		String rev="";
		char ch;
		for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        rev= ch+rev; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ rev);
	}
}
