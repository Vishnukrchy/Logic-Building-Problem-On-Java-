package Pattern_Program;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter The No. Row");
        int n=sc.nextInt();
        pritnPattern(n);
        
	}
	public static void pritnPattern(int n) {
		//1st for loop are for the no of row want to print
		for(int i=1;i<=n;i++) {
			//2nd for loop are for the no of column want to print
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
