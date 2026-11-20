package Task;

public class Sort_anArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,5,1,6,8,3};
		int l=a.length;
		int temp=0;
		for (int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<l;i++)
		{
			System.out.println(a[i]);
		}

	}

}
