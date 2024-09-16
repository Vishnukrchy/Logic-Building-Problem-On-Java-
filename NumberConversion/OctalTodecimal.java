package NumberConversion;
// Octal To Decimal 
import java.util.Scanner;

public class OctalTodecimal {
	public static void main(String[] args) {
		 System.out.println(" Enter The Noumber Is ");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
			getDecimal(n);
	}
	public static void getDecimal(int n) {

		int eightMultiple=1;
		int sum=0;
		
		while (n>0) {
			int rem=n%10;
			if (rem>=0||rem<=7) {
				sum=sum+rem*eightMultiple;
			}else {
				System.out.println(" Number IS Not OCTAL No ");
				return;
			}
			eightMultiple=eightMultiple*8;
			n=n/10;
		}
		System.out.println(" Decimal No Is "+sum);
	}
}
