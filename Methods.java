
import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<Integer>arr=new ArrayList<>(Arrays.asList(3, 1, 4, 7,1, 5));
		int n=arr.size();
		
		//Sort array
		Collections.sort(arr);
		System.out.println(arr+" ");
		
		//descending 
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr+" ");	
		
		//Reverse 
		Collections.reverse(arr);
		System.out.println(arr);
		
		 // Shuffle randomly
		Collections.shuffle(arr);
		System.out.println(arr);
		
		// Swap 1st and 2nd element
		Collections.swap(arr,0,1);
		System.out.println(arr);
		
		// Max element
		int maxno=Collections.max(arr);
		System.out.println(maxno);
		
		// Min element
		int minno=Collections.min(arr);
		System.out.println(minno);
		
		//Count frequency
		int freq=Collections.frequency(arr,1);
		System.out.println(freq);
		
		//fill with 9
		Collections.fill(arr,9);
		System.out.print(arr);
		
	}
}
