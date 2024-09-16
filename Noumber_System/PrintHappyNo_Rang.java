package Noumber_System;

import java.util.Scanner;

public class PrintHappyNo_Rang {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter The No Of Range");
	int n=sc.nextInt();
	System.out.println(" Enter The No ");
	int count=0;
	for (int i = 1; i <=n; i++) {
		if (HappyNo.isHappy(i)) {
			count++;
			System.out.println(i+" Happy No !!");
		} 
	}
	System.err.println(" Total Happy No Is : "+count);
}
}
