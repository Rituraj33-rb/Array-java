package array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows & colums in the 1st matrix=");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		
		System.out.println("Enter the values of 1st matrix");
		for(int i=0;i<m;i++)
		{
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
		}
		System.out.println("Enter the number of rows & colums in the 2nd matrix=");
		int o=sc.nextInt();
		int p=sc.nextInt();
		int b[][]=new int[o][p];
		int c[][]=new int[8][9];
		
		System.out.println("Enter the values of 1st matrix");
		for(int i=0;i<o;i++)
		{
		for(int j=0;j<p;j++)
		{
			b[i][j]=sc.nextInt();
			
		}
		}
		if(m!=p)
		{
			System.out.println("we can't multiply this two matrix");
		}
		else
		{
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=0;
				for(int k=0;k<m;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
					
				}
					
			}
		}
		System.out.println("resulten matrix is=");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		}

sc.close();
	}

}
