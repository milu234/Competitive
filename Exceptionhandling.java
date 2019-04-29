/* An exception is an event that disrupts the normal flow of the program. EH is a mechanism to handle the runtime ,IO ClassNotFound, SQL, Remote etc.
Problrm occurs --> Create Exception --> Throw Exception --> Handle Exception

Error
1. Impossible to recover from the error.
2. Errors are unchecked type 
3. HAppens at Runtime 
4. Caused by the environment on which the application is running


1. Possible to recover from the error.
2. Errors are unchecked type and checked type. 
3. Happens at Runtime as well as Compile time. 
4. Application is running

Exceptions 

Checked
-- An exception is checked by the compiler at compilation-time.
-- These exceptions cannot simply be ignored, the programmer should handle these exceptions

Unchecked
-- An exceptions that occurs during execution
-- These are also called Run-Time Exceptions.
-- Runtime execeptions are ingored at the time of exceptions. 

Exception Syntax

class Exception{
	public static void main(String args[]){
	try{
		//Code that may raise exception
	}
	catch(Exception e){
	//rest of the program
	}
	}
}

Built in Exceptions

ArithmeticException	
ArrayIndexOutOfBoundException
ClassNotFoundException
IOException
InterruptedException
NoSuchFieldException
NoSuchMethodException
NumberFormatException
RuntmeException
StringIndexOutOfBoundException

Methods of Exception

***************************************************************************************
try
-Used to specify a block where we should place exception code.
-Synatx:
		try{
			//Code that throws exception
		}catch(ExcdptioClassName e){
	
		}
********************************************************************************************


*******************************************************************************************
catch
- Use to handle the exception
- Syntax:
		try{
	//Code that is prtected
		} catch(Excetion e){
	//catch block
		}
***********************************************************************************************



**************************************************************************************************
finally
- This code is always executed irrespective of the exception is handled or not
-Syntax:
		try{
	//the broken code
		}
		catch(Exception e){
	//the handled code
		}
		finally{
	//Will execute irrespective of the exception
		}
		
**************************************************************************************************



**************************************************************************************************
throw
- Used to throw an exception
- Checked Exceptions cannot be propogated using throw only
- Followed by an instance
- Used within a method
- Cannot throw multiple exceptions
- Syntax:
		void a(){
	throw new ArithmeticException("Demo");
		}
**************************************************************************************************



**************************************************************************************************
throws
 - use to declare Exceptions
 - Checked Exceptions can be propogated 
 - Followed by a class
 - Used with a method signature
 - Can declare multiple Exceptions 
 Syntax:
 		void a() throws ArithmeticException {}
**************************************************************************************************






**************************************************************************************************
final 
- Keyword
- Applies restriction on class, method and variable.
- final class can be inherited, method can't be ovveridden.
**************************************************************************************************




**************************************************************************************************
finallly
- block
- used to place an important code
- It will be executed whether theexception is handled or not 
**************************************************************************************************




**************************************************************************************************
finalize
- Method
- Used to perform clean-up processing just before the object garbage is collected
************************************************************************************************** 

*/

import java.util.*;
public class Exceptionhandling{


//Built in Exception
	static void add() throws ArithmeticException{
		System.out.println("Inside add function");
		throw new ArithmeticException("Demo");


	}

	static void avg(){

		try{
			add();
		}catch(ArithmeticException e){
			System.out.println("Caught");
		}
		try{
			throw new ArithmeticException("Demo");
		}catch(ArithmeticException e){
			System.out.println("Exception Caught");
		}
	}
//built an exception

		static void validateInput(int number) throws InvalidInputException{
			if(number > 100){
				throw new InvalidInputException("Exception");
			}
			System.out.println("Valid Input");
		}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number less than 100 : ");
		int num1 = sc.nextInt();
		try{
			validateInput(num1);
		}catch(InvalidInputException e){
			System.out.println("Caught Exception - Input is greater than 100");
		}

	//Built in Exception		
		avg();
		String str = null;
		try {
			int a  = 30;
			int b = 0;
			System.out.println(a/b);
		}
		catch (ArithmeticException e){
			System.out.println("Number is not divsble by 0");
		}

		try {
			int num = Integer.parseInt("Milan");
			System.out.println(num);
		}
		catch(NumberFormatException e){
			System.out.println("There is some format issue");
		}

		try{
			int a[] = new int[5];
			a[7] = 9;


		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The array is out of bounds");

		}

		try{
			try{
				int a = 1;
				int b = 0;
				int c = a/b;

				System.out.println(c);

			}catch(ArithmeticException e){
				System.out.println("Dividing by zero is not allowed at first try" );
			}

			try{
				int a = 1;
				int b = 0;
				int c = a/b;

				System.out.println(c);
			}catch(ArithmeticException e){
					System.out.println("Dividing by zero is not allowed at second try" );	
			}
		}catch(Exception e){
			System.out.println("Both the errors  handled");
		}

		finally{
			System.out.println("The finally block is always executed");
		}//built in Exception


//***********************************************************************************************************
// User Defined Exception


		try{
			throw new MyException(5);
		}catch(Exception e){
			System.out.println(e);
		}


	}
}

class MyException extends Exception{
	int a;
	MyException(int b){
		a=b;
	}
	public String toString() {
		return("Exception Number + "+ a);
	}
}

class InvalidInputException extends Exception{
	InvalidInputException(String exceptionText){
		super(exceptionText);
	}
}



/*Output
D:\Competitive>java Exceptionhandling
Enter the number less than 100 :
100
Valid Input
Inside add function
Caught
Exception Caught
Number is not divsble by 0
There is some format issue
The array is out of bounds
Dividing by zero is not allowed at first try
Dividing by zero is not allowed at second try
The finally block is always executed
Exception Number + 5
*/