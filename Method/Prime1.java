package Method;

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();//1-100
	    for(int i=1;i<=n;i++) {
	    	if (prime_No(i)) {
				System.out.println( i+ " Is Prime NO");
			}
		    else {
		    	System.out.println(i+" Not Is Prime NO");
			}
		}
	    }
	public static boolean prime_No(int n) {
		for(int i=2; i<=n/2;i++) {
			if (n%i==0) {
				return false;
			}
		
//			return true;
	}
		return true;
		

}
}
