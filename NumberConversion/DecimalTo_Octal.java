package NumberConversion;

import java.util.Scanner;

public class DecimalTo_Octal {
public static void main(String[] args) {
	System.out.println(" Enter The Decimal Noumber Is ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println(" Octal No Is : " + getOctal(n));
}

public static String getOctal(int n) {
	String oct = "";
	while (n > 0) {
		int rem = n % 8;
		oct = rem+oct;

		n = n / 8;
	}
	return oct;
}
}

