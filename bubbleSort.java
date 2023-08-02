package july;
import java.util.*;

public class bubbleSort 
{
	public static void printbubbleSort(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String []args)
	{
		int arr[]= {7,1,4,8,9,5};
		// bubble sort algorithm	
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					
				}
			}
		}
		printbubbleSort(arr);
	}
	

}
