package Method;

import java.util.Iterator;
import java.util.Scanner;

public class Return_PalandroNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();//1000-5000
		for(int i=1000;i<=n;i++) {
			if (chekPalandrome_Number(i)==i) {
				System.out.println(" Palandrome No is : "+i);
			}
			
		}
	}
	public static  int chekPalandrome_Number(int n) {
		int reverse =0;
		int no=n;
	    while (n>0) {
			int rev=n%10;
			reverse=reverse*10+rev;
			n=n/10;
		}
	   return reverse;
	}
}
