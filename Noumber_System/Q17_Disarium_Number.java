package Noumber_System;
// WAJP TO TAKE USER INPUT AND PRINT Whether the noumber is DISSARIUM NUMBER OR NOT

// Q -2 WAJP TO PRINT AND COUNT THE ALL DISSARIUM NUMBER
/*
 * dISSARIUM nO - N=234
 * SUM=2
 */

import java.util.Iterator;
import java.util.Scanner;

public class Q17_Disarium_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number");
		int number = sc.nextInt();
		if (checkDissarium_Noumber(number)) {
			System.out.println("Disarium No");
		} else {
			System.out.println(" Not ");
		}

	}

	public static int countDigitOf_Number(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;

		}
		return count;
	}

	public static boolean checkDissarium_Noumber(int num) {
		int countOfNoumber = countDigitOf_Number(num);
		int sum = 0;
		int a = num;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + getPower(rem, countOfNoumber);
			countOfNoumber--;
			num = num / 10;
		}
		if (a == sum) {
			return true;
		} else {
			return false;
		}

	}

	public static int getPower(int a, int b) {
		int power = 1;
		for (int i = 1; i <= b; i++) {
			power = power * a;

		}
		return power;
	}
}
