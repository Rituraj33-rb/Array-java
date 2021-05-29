package array;
// using sum of array
public class Missingnumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6};
		int exceptednumber=a.length+1;
		
		int exceptedsum=exceptednumber*(exceptednumber+1)/2;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Missing number is="+(exceptedsum-sum));

}
}
