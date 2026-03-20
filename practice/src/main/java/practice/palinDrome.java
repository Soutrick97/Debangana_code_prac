package practice.practice.src.main.java.practice;

public class palinDrome {
	public static boolean palindromeCheck(int n) {
		int check= n;
		int rev=0;
		while(n>0) {
			int sum= n%10;
			n=n/10;
			rev=(rev*10)+ sum;
		}
		
		if(rev==check) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 123;
		System.out.println( palindromeCheck(n));

	}

}
