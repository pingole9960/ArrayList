//Correct Java Code to Print Prime Numbers from 1 to 500:

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		for(int num=2;num<=n;num++){	
		boolean isPrime=true;
		for(int j=2;j<=Math.sqrt(num);j++){
			if(num%j==0){
				isPrime=false;
			}
		}
			if(isPrime){
		   System.out.println(num);
			}
		}
	
		
			
	}
}
