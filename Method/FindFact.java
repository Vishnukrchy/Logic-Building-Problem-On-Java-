package Method;

import java.util.Scanner;

public class FindFact {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the Number ");
    int n =sc.nextInt();
    int k=0;
    for(int i=1;i<=n;i++) {
    	
    	k=i;
    	findFact(k);
    }
    
}
public static void findFact(int k) {
	int fact=1;
	for(int i=1;i<=k;i++) {
	  fact =fact*i;
	}
	System.out.println(" Factorial Of "+k+"! "+fact);
}
}
