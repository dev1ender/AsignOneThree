
import java.util.Scanner;
public class AsignOneThree {

	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		
		//a values in take
		System.out.println("enter the vlaue of a:");
		int a = sc.nextInt();
		
		
		//b value in take
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		
		//initial values print
		System.out.println("initial a:"+a);
		System.out.println("intial b:"+b);
		
		//computation
		a = a+b;
		b=a-b;
		a= a-b;
		
		//final values print
		System.out.println("now a:"+a);
		System.out.println("now b:"+b);
		

	}

}
