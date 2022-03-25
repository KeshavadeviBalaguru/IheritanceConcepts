package SecondPack;

import java.util.Scanner;

import Firstpack.Parent;
class Child extends Parent{ //dependent class

	void display() {
		//System.out.println("sal ="+sal); //private not accesseble
		System.out.println("Name="+name);
		System.out.println("age="+age);
		//System.out.println("accno="+accno);
	}







	
		

	public static void main(String[] args) {

		Child ob=new Child();
		ob.input();
		ob.display();
		ob.printSal();
		Parent ob1=new Parent();
		System.out.println("Name="+ob1.name);

	}
		// TODO Auto-generated method stub

	}
