package com.demo.add;

public class calculator {
	
	private int a;
	protected int b;
	public int c;
	int d;
	
	 public int addNumbers(int a, int b ,int c,int d){
			this.a=a;
			this.b=a;
			this.c=a;
			this.d=a;
			return a+b+c+d;
			
		   }
	 
	 protected int mulNumbers(int a, int b){
			this.a=a;
			this.b=b;
			return a*b;
			
		   }
	 
	  private int addTwoNumbers(int a, int b ){
		  this.a=a;
			this.b=a;
			return a+b;
			
		   }
	 
    int addThreeNumbers(int a, int b, int c){
    	this.a=a;
		this.b=a;
		this.c=a;
			return a+b+c;
			
		   }
    
    /*
	  *Usage of Private,protected, public and default 
	   variable and methods are allowed in Subclass class.
	   
	  */
    class subClasscalc extends calculator{
    	void display()
    	{
    		System.out.println(addNumbers(10,20,30,40));
    		System.out.println(mulNumbers(10,20));
    		System.out.println(addTwoNumbers(10,20));
    		System.out.println(addThreeNumbers(10,20,30));
    	}
    }

	 
	 /*
	  *Usage of Private,protected, public and default 
	   variable and methods are allowed in same class.
	   
	  */
	 public static void main(String[] args) {
		calculator a=new calculator();
		a.a=20;
		System.out.println(a.addNumbers(10,20,30,40));
		System.out.println(a.mulNumbers(10,20));
		System.out.println(a.addTwoNumbers(10,20));
		System.out.println(a.addThreeNumbers(10,20,30));
	}
}
