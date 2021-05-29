package array;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		int temp=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("How many number do you want to enter?");
	int n=sc.nextInt();
	int box[]=new int[n];
	System.out.println("Enter" +n +"numbers=");
	for(int i=0;i<n;i++)
	{
		box[i]=sc.nextInt();
	}
	System.out.println("enter the number you want to find form the box=");
	int x=sc.nextInt();
	sc.close();
	for(int i=0;i<n;i++)
	{
		if(x==box[i])
		{
			System.out.println("number is found"+ i +"index position");
			temp=temp+1;
		}
	}
	if(temp==0)
	{
		System.out.println("not found");
	}


	}

}
