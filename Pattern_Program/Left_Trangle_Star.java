package Pattern_Program;

import java.util.Scanner;

public class Left_Trangle_Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No. Row");
		int n = sc.nextInt();
		pritnPattern(n);

	}

	public static void pritnPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
