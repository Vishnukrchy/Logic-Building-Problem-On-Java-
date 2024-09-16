package Method;

import java.util.Scanner;

public class Strong_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();
	    if (getSumOf_Factorial_Digit(n)==n) {
			System.out.println(n+" Is Strong No");
		}
	    else {
	    	System.out.println(n+" Is Not Strong No");
		}
	}
	public static int getFactorial(int  n) {
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		
		return fact;
	}
	public static int getSumOf_Factorial_Digit(int  n) {
		int sum=0;
		while (n>0) {
			
			int digit=n%10;
			sum =sum+getFactorial(digit);
			n=n/10;
			
		}
		System.out.println("Sum is "+ sum);
		return sum;
	}
	

}
