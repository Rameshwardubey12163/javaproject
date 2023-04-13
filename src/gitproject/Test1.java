package gitproject;

import java.util.Scanner;
 class Abc {
	public void newClass() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the value");
	int e=sc.nextInt();
    int f=sc.nextInt();
    int g= e-f;
    System.out.println(g);

	}
}

public class Test1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=a+b;
	    int d= a-b;
	    System.out.println(c);
Abc abj=new Abc();
abj.newClass();

	}

}
