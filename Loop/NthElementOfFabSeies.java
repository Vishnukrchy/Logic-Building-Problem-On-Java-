package Loop;

import java.util.Scanner;

public class NthElementOfFabSeies {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter The Nth Term");
	int n=scanner.nextInt();
	getNthElements(n);
}
public static void getNthElements(int n) {
	int a=0,b=1,c=0;
	for (int i = 3; i <=n; i++) {
		c=a+b;
		a=b;
		b=c;
	}
	System.out.println(n+"  Term Elements Is : "+c);
}
}
