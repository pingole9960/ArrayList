//get unique element of Array
import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(6,1,2,3,2,3,8,9,1));
		System.out.println(arr);
		  
		  isDuplicate(arr);
	}
	static void isDuplicate(ArrayList<Integer>arr){
		HashSet<Integer>st=new HashSet<>(arr);
		System.out.println(st);		
    }
}
//Original: [6, 1, 2, 3, 2, 3, 8, 9, 1]
//Unique elements: [1, 2, 3, 6, 8, 9]
