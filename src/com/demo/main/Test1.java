package com.demo.main;

import com.demo.add.*;


/*
 * we can use access public and protected methods of calculation class in different package subclass
 * 
 */

class t1 extends calculator{
	void display()
	{
		System.out.println(addNumbers(10,20,30,40));
		System.out.println(mulNumbers(10,20));
		//System.out.println(addTwoNumbers(10,20));
		//System.out.println(addThreeNumbers(10,20,30));
		
		
	}
	
}

class t2 extends t1
{
	t1 t=new t1();
	//int s=t.mulNumbers(10,20);
	// Here we cannot use protected method by creating object since its scope changes to 
	//private
	
	void display1()
	{
		System.out.println(mulNumbers(10,20));
		System.out.println("from here");
		
	}
}

class t3 extends t2
{
	void display2()
	{
		System.out.println(mulNumbers(10,20));
	}
}



public class Test1{
	public static void main(String[] args) {
		calculator c=new calculator();
		System.out.println(c.addNumbers(10, 20, 30, 40));
		//c.mulNumbers(10,20);     protected method
		//c.addTwoNumbers(10,20);    Private method
		//c.addThreeNumbers(10,20,30);  Default method
		
		
	t3 ob=new t3();
	ob.display();
	ob.display1();
	ob.display2();
			
	
	}
	

}
