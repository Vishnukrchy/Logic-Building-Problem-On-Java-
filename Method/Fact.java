package Method;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();
	    for(int i=1;i<=n;i++) {
	    	if (i%3==0) {
				findFact(i);
			}
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
