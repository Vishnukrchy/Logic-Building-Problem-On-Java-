package Method;

import java.util.Scanner;

public class Fact_Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();
	    while (n>0) {
			int digit =n%10;
			findFact(digit);
			n=n/10;
		}
	}
	public static void findFact(int k) {
		int fact=1;
		for(int i=1;i<=k;i++) {
		  fact =fact*i;
		}
		System.out.println(" Factorial Of "+k+"! "+fact);
	}
}
