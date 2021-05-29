package array;

import java.util.Scanner;

public class Avgofstudentmark {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of student=");
	int n= sc.nextInt();
	int[]student=new int[n];
	System.out.println("Enter the marks of student=");
    for(int i=0;i<n;i++)
    {
     student[i]=sc.nextInt();
    }
    sc.close();
    int sum=0;
    for(int i=0;i<n;i++)
    {
    	sum=sum+student[i];
    }
    int avg;
    avg=sum/n;
    
    System.out.println("Average marks of all the students are="+avg);
    
	}

}
