package InheritanceConcepts;

import java.util.Scanner;

class Parent
{
	private double sal;
	 public String name;
	protected int age;
    int accno;
	public void input() {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter salary");
		sal=sc.nextInt();
		System.out.println("Enter Accno");
		accno=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
	}
	public void printSal() {
		System.out.println("Salary="+sal);
	}
}
class Child extends Parent{ //dependent class

	void display() {
		//System.out.println("sal ="+sal); //private not accesseble
		System.out.println("Name="+name);
		System.out.println("age="+age);
		System.out.println("accno="+accno);
	}

}



public class MainClass {

	public static void main(String[] args) {

		Child ob=new Child();
		ob.input();
		ob.display();
		ob.printSal();


	}

}
