package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindDuplicate {

static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput() throws NumberFormatException, IOException
	{
		int n=Integer.parseInt(br.readLine());
		int input[]=new int[n];
		if(n==0)
			return input;
		String strNums[];
		strNums=br.readLine().split(" ");
		for(int i=0;i<input.length;i++)
		{
			input[i]=Integer.parseInt(strNums[i]);
		}
		return input;
			
	}

	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int findDuplicate(int[] arr)
	{
		int n=arr.length-1;
		int sum1=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		int diff=sum1-sum;
		if(n>diff)
			return n-diff;
		return diff-n;
		
			
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		int u=findDuplicate(arr);
		System.out.println(u);
		

	}

}
