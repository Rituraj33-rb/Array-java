package array;


 class Calculation{
	 
	 public void result(int arr[],int k)
	 {
		int siz=arr.length;
		k=k%siz;
		revers(arr,0,siz-1);
		revers(arr,0,k-1);
		revers(arr,k,siz-1);
		
	 }
	  void display(int arr[],int siz)
	 {
		for(int i=0;i<siz;i++)
			System.out.println(arr[i]);
	 }
	 
	 public void revers(int arr[], int start, int end)
	 {
		 start=0;
		  end=arr.length-1;
		 while(start<end)
		 {
			 int temp=arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 start++;
			 end--;
		 }
	 }
	
}
public class Rotate {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int k=3;
		Calculation c1=new Calculation();
		
		c1.result(a, k);
		c1.display(a,6);
		
		
		

	}

}
