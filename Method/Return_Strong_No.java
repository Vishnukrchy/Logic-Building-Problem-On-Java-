package Method;

import java.util.Scanner;

public class Return_Strong_No {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();//1-1000
	    int count=0;
	    for(int i=1;i<=n;i++) {
	    	 if (getSumOf_Factorial_Digit(i)==i) {
	 			System.out.println(i+" Is Strong No");
	 			count++;
	 		}
	    	
	    }
	    System.out.println(" Total Strong No Is : "+count);
	    
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
		
		return sum;
	}
	
}
