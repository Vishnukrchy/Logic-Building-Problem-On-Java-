package Method;

import java.util.Scanner;

public class Prime_No_Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();
	    if (prime_No(n)) {
			System.out.println(" No Is Prime NO");
		}
	    else {
	    	System.out.println(" No Not Is Prime NO");
		}
	}
	public static boolean prime_No(int n) {
		int count =0;
		for(int i=2; i<=n/2;i++) {
			if (n%i==0) {
				count++;
			}
		}
		if (count!=0) {
			return false;
		}else {
			return true;
		}
	}

}
