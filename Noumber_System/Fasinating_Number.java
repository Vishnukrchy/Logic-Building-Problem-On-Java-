package Noumber_System;

import java.util.Scanner;

public class Fasinating_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No ");
		int n = sc.nextInt();
		if (isFasinating_Number(n)) {
			System.out.println(n + " Fascinating  No !!");
		} else {
			System.out.println(" Bekar h Bhaiya mai tut gya ");
		}
	}

	public static boolean isFasinating_Number(int n) {
		if (n<99) {
			System.out.println(" You r Enter Two Digit No ANd Two digit No Never an Fascinating No");
			return false;
		} 
		String result = n + "" + n * 2 + n * 3;
		for (char c = '1'; c <= '9'; c++) {
			int count = 0;
			for (int i = 0; i < result.length(); i++) {
				char c1 = result.charAt(i);
				if (c == c1) {
					count++;
				}
			}
			if (count > 1 || count == 0) {
				return false;
			}

		}

		return true;
	}
}
