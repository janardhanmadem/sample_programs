package sample_programes;

import java.util.Scanner;

public class find_letter_in_string {
	
	public static void main(String arg[]){
		int count=0;
		String r="This is janardhan";
		String[] splits=r.split("");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the search letter :");
		String l=scan.nextLine();
		System.out.println("Searched letter is :"+l);
		for(String s:splits){
			//System.out.println(s);
			if(s.equals(l)){
				count++;	
			}else{
				System.out.println("letter not found");
				break;
			}
			
		}
		System.out.println("total no of "+ l +" are: "+count++);
	}

}
