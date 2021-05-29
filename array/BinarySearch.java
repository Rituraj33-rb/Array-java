package array;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {2,8,12,15,17,25,28,33};
		int lb=0;
		int ub=a.length-1;
		int search=33;
		int mid=(lb+ub)/2;
		while(lb<=ub)
		{
		if(a[mid]==search)
		{
			System.out.println("number is found at"+ mid +"position");
			break;
		}
		else if(a[mid]<search)
		{
			lb=mid+1;
		}
		else
		{
			ub=mid-1;
		}
		mid=(lb+ub)/2;
		}
		if(lb>ub)
		{
			System.out.println("number is not found");
		}
		

	}

}
