package Method;

import java.util.Scanner;

public class Palandrome_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();
		chekPalandrome_Number(n);
	}
	public static  void chekPalandrome_Number(int n) {
		int reverse =0;
		int no=n;
	    while (n>0) {
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
	    System.out.println("Reverse of  "+no+" "+ reverse);
	    if (no==reverse) {
			System.out.println(no+" Is Palandrom No");
		}else {
			System.out.println(no+" Is Not Palandrom No");
		}
	    
	}

}
