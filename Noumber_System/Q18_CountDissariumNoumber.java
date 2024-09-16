package Noumber_System;

import java.util.Scanner;

public class Q18_CountDissariumNoumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the  Range");
		int number = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (checkDissarium_Noumber(i)) {
				System.out.println("Disarium No  Is  : " + i);
				count++;
			}
		}
		System.out.println(" Total No Of Dissarium No  Is : " + count);

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
