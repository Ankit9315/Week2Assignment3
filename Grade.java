package controlflow;

import java.util.Scanner;

public class Grade {
public static String Grademethod(int a){
	String b;
	if(a>=90 && a<=100) {
		b="A+";
	}else 
		if(a>=80 && a<90) {
			b="A";
		
	}else 
		if(a>=70 && a<80) {
			b="B";
		
	}else 
		if(a>=60 && a<70) {
			b="C";
		
	}else 
		if(a>=50 && a<60) {
			b="D";
		
	}else {
		b="fail";
	} return b;
} public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks :" );
	int a=sc.nextInt();
	String b=Grademethod(a);
	System.out.println("Grade :"+b);
}
}
