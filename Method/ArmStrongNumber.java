package Method;

import java.util.Scanner;

public class ArmStrongNumber {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	    System.out.println(" Enter the Number ");
	    int n =sc.nextInt();
	    if (getPowerSum(n)==n) {
			System.out.println(n+" Is Armstrong No");
		}else {
			System.out.println(n+" Is Not Armstrong No");
		}
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
