package Noumber_System;

import java.util.Scanner;

public class Q15_Automorphic_Number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter The No ");
	int n=sc.nextInt();
	if (isAutomorphicNo(n)) {
		System.out.println(n+" Automorphic No !!");
	} else {
		System.out.println(" Bekar h Bhaiya mai tut gya ");
	}
	
}
public static boolean isAutomorphicNo(int n) {
	int square =n*n;
	while (n>0) {
		if (n%10!=square%10) {
			return false;
		}
		n=n/10;
		square=square/10;
	}
	return true;
}
}
