//check given array is sorted or not
import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(6,1,2,3));
		System.out.println(arr);
		
		boolean s=checkSorted(arr);
		System.out.println(s);
	}
	static boolean checkSorted(ArrayList<Integer>arr){
		for(int i=1;i<arr.size();i++){
			if(arr.get(i-1)>arr.get(i)){
				return false;
			}
		}
		return true;
    }
}
