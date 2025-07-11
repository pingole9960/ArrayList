import java.util.*;
public class Main {
	public static void main(String[] args) {
	   //Static arrays
     ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(5,7,8));
     System.out.println(arr);
     
     ArrayList<Integer>list=new ArrayList<>();
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     
     for(int i=0;i<n;i++){
     	int num=scn.nextInt();
     	list.add(num);
     }
     System.out.println(list);
     
	}
}
