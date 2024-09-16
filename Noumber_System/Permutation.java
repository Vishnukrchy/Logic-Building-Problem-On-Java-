package Noumber_System;

import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The N ");
		int n = sc.nextInt();
		System.out.println(" Enter The r : ");
		int r = sc.nextInt();
		if (n >= r) {
			System.out.println(" Tota; Ways are to Arrange : " + getPermutation(n, r));
		} else {
			System.out.println("Permutation is Not Possible !!!");
		}

	}

	public static int getPermutation(int n, int r) {

		int perm = 1;
		for (int i = 0; i < r; i++) {
			perm = perm * (n - i);
		}
		return perm;

	}
}
