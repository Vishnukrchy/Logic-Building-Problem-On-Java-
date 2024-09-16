package Method;

import java.util.Scanner;

public class ReturnArmstrongNoumber {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    System.out.println(" Enter the Number ");
		    int n =sc.nextInt();//1-1000
		    int count =0;
		   for(int i=1;i<=n;i++) {
			   if (getPowerSum(i)==i) {
					System.out.println(i+" Is Armstrong No");
					count++;
				}
		   }
		   System.out.println(" Total Armstrong No Is : "+count);
		   
	}
	  public static int getPowerSum(int n) {
		int powerSum=0;
		int noOfDigit=getCountOfDigit(n);
		while (n>0) {
			int digit =n%10;
			powerSum=powerSum+getPower(digit, noOfDigit);
			n=n/10;
		}
		
		return powerSum;
	}
	  public static int getCountOfDigit(int n) {
			int count=0;
			while (n>0) {
				n=n/10;
				count++;
			}
			return count;
		}
	  public static int getPower(int a,int b) {
			int power=1;
			for(int i=1;i<=b;i++) {
				power=power*a;
			}
			return power;
		}
}
