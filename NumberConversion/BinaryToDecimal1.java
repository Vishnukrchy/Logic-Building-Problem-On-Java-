package NumberConversion;

import java.util.Scanner;

public class BinaryToDecimal1 {
	public static void main(String[] args) {
		System.out.println(" Enter The Noumber Is ");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		getDecimal(num);
	}

	public static void getDecimal(String n) {
		int sum=0;
		int twoMult=1;
		
		for (int i = n.length()-1; i>=0; i--) {
			char c=n.charAt(i);
			if (c=='0' || c=='1') {
				sum=sum+(c-48)*twoMult;
			}else {
				System.out.println(" The Given No Is Not Binary No");
				return;
			}
			twoMult=twoMult*2;
			
		}
		System.out.println(" Decimal No Is :"+sum);

	}
}
