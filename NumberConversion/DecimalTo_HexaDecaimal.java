package NumberConversion;

import java.util.Scanner;
 
public class DecimalTo_HexaDecaimal {
	public static void main(String[] args) {
		System.out.println(" Enter The Decimal Noumber Is ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		getHexdecimalNo(n);

	}

	public static void getHexdecimalNo(int n) {
		String hex = "";
		while (n>0) {
			int rem = n % 16;
			if (rem<=9) {
				hex=rem+hex;
			} else {
	          hex=(char)(rem+87)+hex;
			}
			n=n/10;
		}
		System.out.println(" HexaDecimal No is  is "+hex);

	}
}
