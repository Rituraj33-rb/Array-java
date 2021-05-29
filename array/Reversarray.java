package array;

public class Reversarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int start=0;
		int end=a.length-1;
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
			
		}
		System.out.println("The elements of the array is in revers order=");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}

	}

}
