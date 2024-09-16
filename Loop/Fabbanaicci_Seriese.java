package Loop;

import java.util.Scanner;

public class Fabbanaicci_Seriese {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Nth Term term Of Fabonaicci_Seriese  ");
	    int n =sc.nextInt();
	    int a=0,b=1,c=0;
	    for(int i=1;i<=n;i++) {
	    	
	    	System.out.print(a);
	    	if(i<n){
	    		System.out.print(",");
	    	}
	    	c=a+b;
	    	a=b;
	    	b=c;
	    }
	    fabseris(n);
	    System.out.println(" ===========> : "+ nthFabSeries(n));
	}
	public static void fabseris(int n) {
		System.out.println("=================================");
		int a=0,b=1,c=0;
		for (int i = 1; i <=n; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static int nthFabSeries(int n) {
		int a=0,b=1,c=0;
		for(int i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			
		}
		return c;
	}
}
