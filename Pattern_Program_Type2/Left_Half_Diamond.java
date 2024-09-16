package Pattern_Program_Type2;

import java.util.Scanner;

public class Left_Half_Diamond {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No. Row");
		int n = sc.nextInt();
		printPattern(n);

	}
	public static void printPattern(int n) {
//		int space =0;
		int star = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			if (i < (n + 1) / 2) {
				star++;
			} else {
				star--;
			}
		}

		System.out.println();
	}
}
