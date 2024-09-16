package Pattern_Program_Type2;

import java.util.Scanner;

public class Interviwie {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the row");
	int n=sc.nextInt();
	
	for (int i = 1; i <=n; i++) {
		int p=1;
		int space=n-1; int numer=1;
		for (int j = 1; j <=space; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=numer; j++) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		space--;
		numer=+2;	
	}
}
}
