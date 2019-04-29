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
	}
}