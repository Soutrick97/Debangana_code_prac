package practice.practice.src.main.java.practice;

import java.util.Arrays;

public class practice {
	public static void secondLar(int[] a) {
		Arrays.sort(a);
		int n= a.length;
		
		 System.out.print(a[n-2]);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2, 8, 9, 10, 12, 15, 1,6};
		secondLar(a);

	}

}
