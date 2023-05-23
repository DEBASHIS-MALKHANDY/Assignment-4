package Assignment4;

public class program3 {
	public static void main(String[] args) {
		int num=2552;
		int temp=num;
		int rem;
		int sum=0;
		
		if(num>0) {
			rem=num%10;
			num=num/10;
			sum=(num*10)+rem;			
		}
		if(temp==sum) {
			System.out.println("This Num Is Palindrome");
		}
		else {
			System.out.println("This Number is Not Palindrome");
		}
	}

}
