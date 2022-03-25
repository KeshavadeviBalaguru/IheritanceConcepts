package Firstpack;

import java.util.Scanner;

public class Parent
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



