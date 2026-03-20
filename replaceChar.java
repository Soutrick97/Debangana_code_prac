package practice;

public class replaceChar {
	public static String replaceC(String s, char ch1, char ch2) {
		int n=s.length();
		String results="";
		for(int i=0; i<n; i++) {
			if(s.charAt(i)==ch1) {
				results= results+ ch2;
			}
			else {
				results= results+ s.charAt(i);
			}
		}
		return results;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "apple";
		char ch1= 'p';
		char ch2='b';
		System.out.print(replaceC(s,ch1, ch2));

	}

}
