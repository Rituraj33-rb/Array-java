package array;

import java.util.Scanner;

public class BinarysearchUserinput {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the Siz of the array=");
	int n=sc.nextInt();
	int box[]=new int[n];
	System.out.println("Enter the numbers=");
	for(int i=0;i<n;i++)
	{
		box[i]=sc.nextInt();
	}
	System.out.println("Enter the number you want to search=");
	int s=sc.nextInt();
	sc.close();
	int l=0;
	int u=n-1;
	int mid=(l+u)/2;
	while(l<=u)
	{
		if(box[mid]==s)
		{
			System.out.println("number is found in" +" "+mid +" "+"position");
			break;
		}
		else if(box[mid]<s)
		{
			l=mid+1;
		}
		else
		{
			u=mid-1;
		}
		mid=(l+u)/2;
	}
	if(l>u)
	{
		System.out.println("Number is not found");
	}

	}

}
