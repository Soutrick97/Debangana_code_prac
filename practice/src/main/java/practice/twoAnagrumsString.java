package practice.practice.src.main.java.practice;

import java.util.Arrays;

public class twoAnagrumsString {
	public static boolean anagrumCheck(String a, String b) {
		char[] arr1= a.toCharArray();
		char[] arr2= b.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		 return Arrays.equals(arr1,  arr2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "listen";
		String b="netsil";
		System.out.print(anagrumCheck(a,b));

	}

}
