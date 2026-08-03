package javacoding2026;

public class _1_Employee {

	{
		System.out.print("Instance Block");
	}

	{
		System.out.println("Static Block");
	}

	public _1_Employee() {
		System.out.println("Contructor");

	}

}
Execution flow:
---------------	
1.The static block executes first because it runs when the Employee class 
is loaded into memory
2.During the object creation,the instance block executes 1st,
followed by contructor

What if we had two Employee Objects:
------------------------------------
	Static Block
	Instance Block
	Constructor Block
	Constructor

Why didn't static block execute again:
--------------------------------------
static Blocks belong to the class not to the object.The Employee
class was already loaded when the 1st object was created so the static block
has already executed.
