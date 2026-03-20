package practice.practice.src.main.java.practice;

public class countOcc {
	public static void frequency(String s) {
	 int n= s.length();
	 //code to count the frequency
	 int freq[] = new int [26];
		 for(int i=0; i<n; i++) {
		 char ch= s.charAt(i);
		 freq[ch-'a']++;
		 
	 }
		 //code to print the output and it's number of occurrence
		 for(int i=0; i<26; i++) {
			 if(freq[i]>0) {
				 char ch= (char)(i+'a');
				 System.out.print(ch +"="+ freq[i]+ " ");
			 }
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="debaaangaaannaaa";
		frequency(s);

	}

}
