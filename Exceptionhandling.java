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
*/

public class Exceptionhandling{
	public static void main(String args[]){
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
		}
	}
}