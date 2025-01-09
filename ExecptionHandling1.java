/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Explain Exception and handle multiple Expectations in try and catch .

*/


/*
Execption Handling :- (distruption of normal exuction flow )
	>camplie time exception (checked):- exception occurs at camplie time 
	>runtime exception (unchecked) :- exception occurs at run time 

1.keyword (reserved word)

	1) try{} -  code write inside try block 
	2) catch(){} - predifine, Exception (parameter), single try multiple catch
	3) finally{} - (optional) exception rise or not finally block always run. continus multiple finally(not allowed)
	4) throw :- direct throw the exception object (order for catch block) (jump statement) its throw userDifind and predifine exception
	5) throws :- USE IN METHOD ALLOW TO THROW THE EXCEPTION. without using try and catch block


2.class diagram 
					Object class
						|
					Throwable class
						|
			---------------------------------------------
			|					    |
		Exception class					Error class
			|						
	-------------------------------
	|				|
checked Exception		unchecked exception
	|				|
 I/O class			RunTime exception class
	or				or
camplietime exception 		Nullpointer exception class
	class

**Nullpointer:-
	String a = null;
	System.out.println(a.length());
	
>> Custom Exception:- (user defind exception)
 **(refer MainExecption file )

>> exception override hierarchy 
in java 8 
In methed override :-
//checked exception : - parant and child throw same exception (allowed)
//checked exception : - parant (Broad/parant type) and child(narrow/child type) throw exception (allowed)
--checked exception : - parant (narrow/child type) and child (Broad/parant type) throw exception (not allowed)
//checked exception : - parant  throw exception and child does't throw exception (allowed)
--checked exception : - parant  does't throw exception and child throw exception (not allowed)



//un-checked exception : - parant and child throw same exception (allowed)
//un-checked exception : - parant (Broad/parant type) and child (narrow/child type) throw exception (allowed)
//un-checked exception : - parant (narrow/child type) and child (Broad/parant type) throw exception (allowed)
//un-checked exception : - parant  throw exception and child does't throw exception (allowed)
//un-checked exception : - parant  does't throw exception and child throw exception (allowed)

//checked exception at parant & un-checked exception at child [allowed]  
--checked exception at child & un-checked exception at parant [not allowed]  

*/
class ExecptionHandling1{
	
		
	public static void main(String args[]){
		// ArithmeticException : / by zero
		try{
			System.out.println(1/0);
		}
		catch(Exception e){
			System.out.println("ArithmeticException..");
		}
		System.out.println("__________________________________");
		
		
		
		// NullPointException : 
		try{
			
			String str = null;
			System.out.println(str.length());
		}
		catch(Exception e){
			System.out.println("nullPointException..");
		}
		System.out.println("__________________________________");
		
		
		
		try{
			
			// ArrayIndexOutOfBoundsException
			int a[] = new int[2];
			 a[0] = 1;
			 a[1] = 2;
			 int[] b = new int[-1];
			
			
			// NegativeArraySizeException
			 System.out.println(a[2]);
			
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException  ");
		}
		catch(NegativeArraySizeException e){
			System.out.println("NegativeArraySizeException ");
		}
		System.out.println("__________________________________");
		
		
		
		// StringIndexOutOfBoundsException
		try{
			
			String str = "Geetam";
			System.out.println(str.charAt(6));
			
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("String Index Out Of Bounds Exception ");
		}
		System.out.println("__________________________________");
		
		
		// ClassCastException 
		try{
		Animal a1 =  new Animal();
		Dog d = (Dog) a1;
		}
		catch(ClassCastException e ){
			System.out.println("ClassCastException");
		}
		System.out.println("__________________________________");
		
		
		
		// NumberFormatException
		try{
			System.out.println(Integer.parseInt("abc"));
		}
		catch(NumberFormatException e){
			System.out.println("NumberFormatException");
		}
		System.out.println("__________________________________");
		
		
		
	}
	
}

class Animal{
	
}
class Dog extends Animal{
	
}

