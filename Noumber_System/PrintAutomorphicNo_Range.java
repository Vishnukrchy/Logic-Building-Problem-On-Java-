package Noumber_System;

import java.util.Scanner;

public class PrintAutomorphicNo_Range {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter The No Of Range");
	int n=sc.nextInt();
	int count=0;
	for (int i = 1; i <=n; i++) {
		if (Q15_Automorphic_Number.isAutomorphicNo(i)) {
			count++;
			System.out.println(i+" is an AutomorphicNo  !!");
		} 
	}
	System.err.println(" Total AutomorphicNo No Is : "+count);
}
}
