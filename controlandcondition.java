package controlflow;

import java.util.Scanner;

public class controlandcondition {
public static void course(String a,int b) {
	switch(a) {
	case "cse":
		if(b==1) {
			System.out.println("Subjects user need to study are English,Maths,Science");
		}else if(b==2) {
			System.out.println("Subjects user need to study are Operating System,Java,Data Structure");
		}else if(b==3) {
			System.out.println("Subjects user need to study are Computer Organization,MultiMedia");
		}else if(b==4){
			System.out.println("Subjects user need to study are Data Communication and Networks,MultiMedia");}
		break;
	case "ece":
		if(b==1) {
			System.out.println("Subjects user need to study are English,Maths,Science");
		}else if(b==2) {
			System.out.println("Subjects user need to study are Micro Processors,Logic Swictching Theory ");
		}else if(b==3) {
			System.out.println("Subjects user need to study are Fundamentals of Logic Design,Microelectronics");
		}else if(b==4) {
			System.out.println("Subjects user need to study are Embedded system,Image Processing");}
	break;
	case "mec":
	if(b==1) {
		System.out.println("Subjects user need to study are English,Maths,Science ");
	}else if(b==2) {
		System.out.println("Subjects user need to study are Drawing,Manufacturing Machines");
	}else if(b==3) {
		System.out.println("Subjects user need to study are Internal Combustion Engines,Mechanical Vibration");
	}else if(b==4) {
		System.out.println("Subjects user need to study are Production Technology,Thermal Engineering");
	}
	break;
	default:
		System.out.println("Invalid Input");
		break;
}
}
public static void main(String[]aargs) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter branch name of COURSE");
	String a=sc.nextLine();
	System.out.println("Enter year of Course");
	int b=sc.nextInt();
	course(a,b);
}
}
