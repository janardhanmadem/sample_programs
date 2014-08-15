package sample_programes;

import java.util.Scanner;

public class calculator_program {
	public static void main(String arg[]){
		int a;
		int b;
		int c;
		System.out.println("Enter your option");
		System.out.println("Enter Value a :");
		System.out.println("Enter Value b :");
		Scanner scan=new Scanner(System.in);
		String option=scan.nextLine();
		a=scan.nextInt();
		b=scan.nextInt(); 
		System.out.println("option is :"+option);
		System.out.println("Value of a is:"+a);
		System.out.println("Value of b is:"+b);
		if(option.equals("1")){
			c=a+b;
			System.out.println("Additon Operation");
			System.out.println("sum of two numbers is :"+c);
		}
			else if(option.equals("2")){
				c=a-b;
				System.out.println("Substraction Operation");
				System.out.println("subtraction of two numbers is :"+c);
			}else if(option.equals("3")){
				c=a*b;
				System.out.println("Multiplication Operation");
				System.out.println("mutliplication of two numbers is :"+c);
			}
			else if(option.equals("4")){
				c=a/b;
				System.out.println("Division Operation");
				System.out.println("division of two numbers is :"+c);
		}
			else{
				System.out.println("Undefined Operation");
				System.out.println("you entered wrong option :");
			}
	}

}
