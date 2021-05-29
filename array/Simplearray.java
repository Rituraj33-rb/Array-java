//initialization declearation & display the values of an array
package array;
import java.util.Scanner;
public class Simplearray {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the range of the array=");
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 System.out.println("Enter" +n +"values");
	 for(int i=0;i<n;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 sc.close();
	 System.out.print("values are=");
	 for(int i=0;i<n;i++)
	 {
		 System.out.print( " "+a[i]);
	 }

	}

}
