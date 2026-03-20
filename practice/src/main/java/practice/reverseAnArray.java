package practice.practice.src.main.java.practice;

public class reverseAnArray {
	public static String reverseArray(String a) {
		int n=a.length();
		String res="";
		for(int i=n-1; i>=0; i--) {
		res=res +a.charAt(i);
		}
		return res;
		
	}
	public static void main(String args[]) {
		String a="automation";
		System.out.println(reverseArray(a));
		
	}

}
