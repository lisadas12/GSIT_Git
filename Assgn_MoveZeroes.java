package weeklyassignment;

public class Assgn_MoveZeroes {
	
	static void moveZeroes(int arr[])
	{
		int pos=0;
		for(int i=0; i<=arr.length-1;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
				pos++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,0,2,0,3};
		moveZeroes(arr);
		for(int num:arr)
			System.out.print(num+" ");
		
		
	}

}
 