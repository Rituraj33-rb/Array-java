package array;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[2][2];
	int b[][]=new int[2][2];
	int c[][]=new int[2][2];
	System.out.println("Enter the valus of 1st matrix=");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the valus of 2nd matrix=");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			b[i][j]=sc.nextInt();
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	System.out.println("Resulten matrix is=");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(c[i][j]+"\t");
		}
		System.out.println();
		sc.close();
	}
		
	}
}