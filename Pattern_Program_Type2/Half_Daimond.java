package Pattern_Program_Type2;

import java.util.Scanner;

public class Half_Daimond {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No. Row");
		int n = sc.nextInt();
		printPattern(n);

	}
	public static void printPattern(int n) {
		int space =n-1;
		int star=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*   ");
			}
			space--;
			star++;
			
			System.out.println();
		}
	}
	
}
