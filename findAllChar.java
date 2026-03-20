package practice;

public class findAllChar {
	public static int findAstring(String s, char ch) {
		int n= s.length();
		int sum=0;
		for(int i=0; i<n; i++ ) {
			if(s.charAt(i)== ch) {
				sum=sum+1;
			}
	}
		return sum;
	}
	
	
	public static void main(String args[]) {
		String s="banana";
		char ch= 'a';
		System.out.print(findAstring(s,ch));
	}

}
