package practice;

public class Two_dimentional_userio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2,3,4},{4,3,1}};
		int r=arr.length;
		int c=arr[0].length;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
