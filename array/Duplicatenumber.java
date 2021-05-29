//nested loop
package array;

public class Duplicatenumber {

	public static void main(String[] args) {
		int temp=0;
		int a[]= {2,3,4,5,6,7,8,7,10};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					temp=temp+1;
					System.out.println("duplicat number is"+a[j]);
				}
			}
		}
		if(temp==0)
		{
			System.out.println("there is no duplicat number");
		}

	}

}
