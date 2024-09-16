package Method;

import java.util.Scanner;

public class Fact_Even_Digit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the Number ");
    int n =sc.nextInt();
    find_Even_Digit_Fact(n);
}
public static void find_Even_Digit_Fact(int number) {
	int fact=1;
	while (number>0) {
		int digit =number%10;
		if (digit%2==0) {
			for(int i=1;i<=digit;i++) {
				fact =fact*i;
			}
			System.out.println(" Factorial Of Even Digit : "+digit+"! "+fact);
		}
		number=number/10;
	}
}
}
