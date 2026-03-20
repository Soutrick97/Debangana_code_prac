package practice.practice.src.main.java.practice;

public class removeAllOccurance {
	public static String removeOcc(String s, char ch) {
		String results= " ";
		String str= String.valueOf(ch);
		return results= s.replace(str, "");
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "banana";
		char ch='a';
		System.out.print(removeOcc(s,ch));

	}

}
