//Check if a number is a twin prime

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the N nos:");
		int n=sc.nextInt();
		if(isPrime(n) && isPrime(n+2) || isPrime(n-2))
		System.out.println(n + " is a Twin Prime.");
         else 
            System.out.println(n + " is NOT a Twin Prime.");
	}
	public static boolean isPrime(int num){
		for(int j=2;j<=Math.sqrt(num);j++){
			if(num%j==0)
				return false;
			}
			return true;
	}
}

/*Enter a number to check if it is a twin prime: 11
11 is a Twin Prime.
Enter a number to check if it is a twin prime: 13
23 is not a Twin Prime.*/
