package Method;

public class Test {
public static void main(String[] args) {
	 String string="783dshfer34";
	 
	 int sum=0;
	 for (int i = 0; i < string.length(); i++) {
		char digit=string.charAt(i);
		if (digit>='0' && digit<='9') {
			sum=sum+(digit-48);
			
		}
	
	}
		System.out.println(sum);
	 
	 
}
}
