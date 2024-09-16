package Noumber_System;

//WAJP TO TAKE A INTEGER INPUT AND REPLACE ALL '5' BY '4'
//IP -: 345785
//O/P -:344784
import java.util.Scanner;

public class Replace5_To_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No ");
		int n = sc.nextInt();
		System.out.println(" New No Is " + replace(n));

	}

	public static int replace(int n) {
		if (n == 5) {
			System.out.println(" The Resultant Noumber Is :5 ");
			return 5;
		} else {
			int result = 0;
			int tenMultples = 1;
			while (n > 0) {
				int rem = n % 10;
				if (rem == 5) {
					result = tenMultples * 4 + result;

				} else {
					result = tenMultples * rem + result;
				}
				tenMultples = tenMultples * 10;

				n = n / 10;

			}
			return result;
		}

	}
}
