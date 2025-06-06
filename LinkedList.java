package abc;

import java.util.HashSet;
import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {
		HashSet<String>Student=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 5 students names");
	
	    for(int i=1;i<=5;i++){
		    System.out.println("enter name of 5 students"+i+":");
		    String name=sc.nextLine();
		   Student.add(name);
		
	}
	   System.out.println("students name are:");
	   for(String student:Student) {
		  System.out.println(student);
	}
	sc.close();

}
	
}



