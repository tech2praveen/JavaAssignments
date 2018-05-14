package com.demo.firstPackage;

/*
 * In class display, we can access public,protected and default methods but not the private
 * method i.e. addTwoNumbers(10,20)
 * 
 */


class display extends calculator{
	
	
	void disp()
	{
		System.out.println(addNumbers(10,20,30,40));
		System.out.println(mulNumbers(10,20));
		//System.out.println(addTwoNumbers(10,20));
		System.out.println(addThreeNumbers(10,20,30));
	}
	
}

/*
 * In subclass subClassdisp, we can access public,protected and default methods but not the private
 * method i.e. addTwoNumbers(10,20)
 * 
 */


class subClassdisp extends display
{	
	void disp1()
	{
		System.out.println(addNumbers(10,20,30,40));
		System.out.println(mulNumbers(10,20));
		//System.out.println(addTwoNumbers(10,20));
		System.out.println(addThreeNumbers(10,20,30));
	}
}

public class SamePackageTest {
	public static void main(String[] args) {
		
		display d=new display();
		subClassdisp d1=new subClassdisp();
		d.disp();
		d1.disp1();
		
		d.d=10;
		d.c=90;
		d.b=80;
	//	d.a=10;  cannot access private in different class.
		
		
		
	}

}
