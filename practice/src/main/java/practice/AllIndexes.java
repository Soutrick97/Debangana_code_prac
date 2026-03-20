package practice;

public class AllIndexes {
	static void finAllIndexes(String s, char ch) {
		int n= s.length();
		
		for(int i=0; i<n; i++) {
			if(s.charAt(i)==ch) 
				
				System.out.print(i+ " " );
				
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "banana";
		char ch='a';
		finAllIndexes(s,ch);

	}

}
