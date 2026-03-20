package practice.practice.src.main.java.practice;
class findChar{
	public static int findAstring(String s, char ch) {
		int n= s.length();
		
		for(int i=0; i<n; i++ ) {
			if(s.charAt(i)== ch) {
				return i;
			}
	}
		return -1;
	}
	
	
	public static void main(String args[]) {
		String s="banana";
		char ch= 'a';
		System.out.print(findAstring(s,ch));
	}
}