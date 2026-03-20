package practice;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a= sc.nextInt();
		System.out.print("Enter another number: ");
		int b= sc.nextInt();
		System.out.println("Enter any operator: ");
		char s= sc.next().charAt(0);
		
		int sum;
	
		if(s == '+') {
			sum= a+b;
			System.out.println(sum);
			
		}
		else if(s== '-') {
			 sum= a-b;
			 System.out.println(sum);
			
		}
		else if(s=='/') {
		 sum= a/b;
		 System.out.println(sum);
			
		}
		else if(s== '*') {
			 sum= a*b;
			 System.out.print(sum);
			
		}
		else {
			System.out.print("It is not a valid operator");
			
		}
		
		

	}
	

}
