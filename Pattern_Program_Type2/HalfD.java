package Pattern_Program_Type2;

import java.util.Scanner;

public class HalfD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No. Row");
		int n = sc.nextInt();
		printPattern(n);

	}
	public static void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if (i+j>=n+1) {
					System.out.print("*   ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
}
