package Pattern_Program;

import java.util.Scanner;

public class important {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
    System.out.println(" Enter The No. Row");
    int n=sc.nextInt();
    pritnPattern(n);
    
}
public static void pritnPattern(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print("("+i+","+j+")");
		}
		System.out.println();
	}
}
}
