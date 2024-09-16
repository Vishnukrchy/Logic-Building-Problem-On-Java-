package NumberConversion;

import java.util.Scanner;

public class HexaDecimal_To_Decimal {
	public static void main(String[] args) {
		System.out.println(" Enter The Hexa                     Decimal Noumber Is ");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		getDecimal(n);
	}

	public static void getDecimal(String s1) {
		int dec = 0;
		int multolpleOf16 = 1;
		for (int i = s1.length() - 1; i >= 0; i--) {
			char c = s1.charAt(i);
			if (c >= '0' && c <= '9') {
				dec = dec + (c - 48) * multolpleOf16;
			} else if (c >= 'A' && c <= 'F') {
				dec = dec + (c - 55) * multolpleOf16;
			} else if (c >= 'a' && c <= 'c') {
				dec = dec + (c - 87) * multolpleOf16;
			} else {
				System.out.println(" Invaild HexaDecimal Value");
				return;
			}
			multolpleOf16 = multolpleOf16 * 16;
		}
		System.out.println(" Decimal No Is " + dec);

	}
}
