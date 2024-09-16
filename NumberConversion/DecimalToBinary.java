package NumberConversion;

import java.util.Scanner;

public class DecimalToBinary{
	public static void main(String[] args) {
		System.out.println(" Enter The Decimal Noumber Is ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(" Binary No Is : " + getBinary(n));
	}

	public static String getBinary(int n) {
		String bin = "";
		while (n > 0) {
			int rem = n % 2;
			bin = rem+bin;

			n = n / 2;
		}
		return bin;
	}
}
