package practice.practice.src.main.java.practice;

public class splitString {
	public static void splitAStr(String a) {
		String[] str= a.split(" ", 3);
		
		int n= str.length;
		for(int i=n-1; i>=0;i--) {
		   System.out.print(str[i]+ " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="i love automation";
		splitAStr(a);

	}

}
