package Pattern_Program;

import java.util.Scanner;

public class Swastiks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No. Row");
		int n = sc.nextInt();
		printSwastiks(n);

	}
	public static void printSwastiks(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if (i==(n+1)/2||j==(n+1)/2||(i==1&&j>(n+1)/2)||(i==n&&j<(n+1)/2)||(j==1&&i<(n+1)/2)||(j==n&&i>(n+1)/2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
