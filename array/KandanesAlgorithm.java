//we use this algorithm to find the longest sum contiguous subarray
package array; 
class Longeatsum{
 void maxSubArraySum(int a[]) 
{ 
    int size = a.length; 
    int max_so_far = Integer.MIN_VALUE;
    int max_ending_here = 0; 

    for (int i = 0; i < size; i++) 
    { 
        max_ending_here = max_ending_here + a[i]; 
        if (max_so_far < max_ending_here) 
            max_so_far = max_ending_here; 
        if (max_ending_here < 0) 
            max_ending_here = 0; 
    } 
   
    System.out.println("Maximum contigious sum is="+max_so_far);
} 

} 
public class KandanesAlgorithm {

	public static void main(String[] args) {
		Longeatsum a1=new Longeatsum();
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
	
   a1.maxSubArraySum(a);

	}

}
