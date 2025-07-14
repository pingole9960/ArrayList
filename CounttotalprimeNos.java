//Count total prime numbers between 1 to N

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the N nos:");
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
			  cnt++;
			}
			   
		}
		System.out.println("Count the Prime no:"+cnt);
	}
}
