package com.demo.main;

import com.demo.add.*;

/*
 * In class display, we can access public and protected methods but not the private and default
 * methods
 * 
 */


class display extends calculator{
	
	void disp()
	{
		System.out.println(addNumbers(10,20,30,40));
		System.out.println(mulNumbers(10,20));
		//System.out.println(addTwoNumbers(10,20));
		//System.out.println(addThreeNumbers(10,20,30));
	}
	
}

/*
 * In Subclass subClassdisp, we can access public and protected methods but not the private and default
 * methods
 * 
 */

class subClassdisp extends display
{
	void disp1()
	{
		System.out.println(addNumbers(10,20,30,40));
		System.out.println(mulNumbers(10,20));
		//System.out.println(addTwoNumbers(10,20));
		//System.out.println(addThreeNumbers(10,20,30));
	}
}

public class Test2 extends calculator {
	public static void main(String[] args) {
		
		display d=new display();
		d.disp();
		
		/*
		 
		 * Cannot make a static reference to the 
		 *non-static method addNumbers(int, int, int, int) from the class calculator
		 *
		 */
		
	//	System.out.println(addNumbers(10,20,30,40));
	
		
	}

}
