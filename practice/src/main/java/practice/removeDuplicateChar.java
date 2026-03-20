package practice.practice.src.main.java.practice;

import java.util.Arrays;

public class removeDuplicateChar {
	public static String removeDuplicate(String s) {
		String res=" ";
		int n= s.length();
		int freq[]= new int[26];
		//find duplicate letter
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			if(freq[ch-'a']==0) {
				res=res+ch;
				freq[ch-'a']++;
				
			}
			
		}
		return res;
	}
	public static void main(String args[]) {
		String a="programming";
		System.out.print(removeDuplicate(a));
	}

}
