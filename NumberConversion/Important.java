package NumberConversion;
// Take User Input And convert that no  into for Base k
// ex num=(13)base 10;  converted no base k= ?

import java.util.Scanner;

public class Important {
	public static void main(String[] args) {
		System.out.println(" Enter The Decimal Noumber Is ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(" Enter The Base No Is ");
		int base=sc.nextInt();
		System.out.println("The Base " + base + " Canverted No Is " + convertdBaseK_Number(n, base));
	}
	public static String convertdBaseK_Number( int num ,int base) {
		String result="";
		while (num>0) {
			int rem=num%base;
			if (rem<=9) {
				result=rem+result;
			} else {
              result=(char)(rem+87)+result;
			}
			
			num=num/base;
		}
		return result;
	}
	
}
