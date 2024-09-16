package Method;

import java.util.Scanner;

public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();//1000
	    int i=50;// 50-1000
	    for(i=50; i<=n;i++) {
	    	revese_Number(i);
	    }
	    
	}
	public static  void revese_Number(int n) {
		int reverse =0;
		int no=n;
	    while (n>0) {
			int rev=n%10;
			reverse=reverse*10+rev;
			n=n/10;
		}
	    System.out.println("Reverse of  "+no+" "+ reverse);
	}

}
