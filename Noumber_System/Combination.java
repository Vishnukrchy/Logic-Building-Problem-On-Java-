package Noumber_System;

import java.util.Iterator;
import java.util.Scanner;

public class Combination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The N ");
		int n = sc.nextInt();
		System.out.println(" Enter The r : ");
		int r = sc.nextInt();
		if (n >= r) {
			System.out.println(" Tota; Ways are to Arrange : " + getCombination(n, r));
		} else {
			System.out.println("Permutation is Not Possible !!!");
		}

	}
	public static int getCombination(int n,int r) {
		int comb=1;
		for (int i = 0; i <r; i++) {
			comb=comb*((n-i)/(i+1));
					
				
		}
		return comb;
	}
}
