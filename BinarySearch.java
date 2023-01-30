package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
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
	public static int binarySearch(int[] arr, int x)
	{
		int s=0;
		int e=arr.length-1;
		
		while(s<=e)
		{
			int mid=(s+e)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]<x)
				s=mid+1;
			else
				e=mid-1;
			
		}
		return -1;
		
		
			
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		int x=Integer.parseInt(br.readLine().trim());
		int ans=binarySearch(arr,x);
		System.out.println(ans);
		
		

	}


}
