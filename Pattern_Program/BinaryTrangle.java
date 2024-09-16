package Pattern_Program;

import java.util.Scanner;
/*
 * 6
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 
1 0 1 0 1 0 
 */
public class BinaryTrangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The No. Row");
		int n = sc.nextInt();
		pritnPattern(n);

	}

	public static void pritnPattern(int n) {
		int x=1;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <=i; j++) {
				System.out.print(j%2+" ");
				
			}
			System.out.println();
		}
	}
}
