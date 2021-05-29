package array;
// i am going to follow 3 steps to rotate the array.
//1. Store the elements in a temp[] array 
// 2. move the rest elements towards left.
//3. marge the arrays
//4. print the rotate array
class Rotation{
	public void store(int arr[],int temp[],int d)
	{
		for(int i=0;i<d;i++)
		{
			temp[i]=arr[i];
		}
	}
		public void move(int arr[],int d)
		{
		for(int i=0;i<arr.length-d;i++)	
		{
			arr[i]=arr[i+d];
		}
		
	}
		public void storeback(int arr[],int temp[],int d)
		{
			
			for(int i=arr.length-d, j=0;i<(arr.length);i++,j++)
			{
				arr[i]=temp[j];
			}
		}
		public void print(int arr[])
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("arr["+i+"]"+"=" +arr[i]);
			}
		}
}
public class Rotatrarray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7};
		int d=2;
		int temp[]=new int[d];
	Rotation approach =new Rotation();	
	approach.store(array, temp, d);
	approach.move(array, d);
	approach.storeback(array, temp, d);
	approach.print(array);
	}

}
