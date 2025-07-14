//Sum of all prime numbers between 1 to N
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the N nos:");
		int n=sc.nextInt();
		int sum=0;
		for(int num=2;num<=n;num++){
			boolean isPrime=true;
			for(int i=2;i<=Math.sqrt(num);i++){
				if(num%i==0){
				        isPrime=false;
				        break;
				}
			}
			if(isPrime)
			    sum+=num;
		}
		   System.out.println("Sum of all prime numbers:"+sum);
	}
}
