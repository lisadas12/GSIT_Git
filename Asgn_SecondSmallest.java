package weeklyassignment;

import java.util.Arrays;
import java.util.*;

public class Asgn_SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2, 100, 99, 4, 1, 2, 7, 2, 9, 1};
		
		
		//Arrays.sort(arr);
		//System.out.println(arr[1]);
		
		int smallest=Integer.MAX_VALUE;
		int secSmallest=Integer.MAX_VALUE;
	
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<smallest)
			{
				//secSmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]>smallest && arr[i]<secSmallest)
			{
				secSmallest=arr[i];
			}
						
		}
		System.out.println("smallest:"+smallest);
		System.out.println("secSmallest:"+secSmallest);
		
	}

	}	
		
		
		
		
		
		/*for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<secSmallest && arr[i]>smallest)
				secSmallest=arr[i];
			
		}
			System.out.println(secSmallest);*/

	
