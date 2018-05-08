package com.demo.main;

import com.demo.add.*;


/*
 * 
 * Checking the visibility of methods of com.demo.add.calculator by creating the object of calculator
 * addNumbers() is a public method, hence can be used in this class.
 * addTwoNumbers() is a protected method, is not visible in different package 
 * 
 */


public class Test1 {
	public static void main(String[] args) {
		calculator c=new calculator();
		c.addNumbers(10, 20, 30, 40);
		//c.mulNumbers(10,20);     protected method
		//c.addTwoNumbers(10,20);    Private method
		//c.addThreeNumbers(10,20,30);  Default method
	}
	

}
