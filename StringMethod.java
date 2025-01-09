/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Explain String 5 mathod.


*/


class StringMethod{
	public static void main(String args[]){
		// 03 : - 5 String method :-
		//1) int hashCode()  :- return a hash code for  this String

			String str1 = "this is hash";
			System.out.println(str1.hashCode()); //990493378
			
		//2) char charAt(int index) :- return a char value at that position index
		
			String str2 = "this is hash";
			System.out.println(str2.charAt(3)); // s
		
		//3) boolean endsWith(String suffix) :- return true if specified suffix is match

			String str3 = "this is endsWith";
			System.out.println(str3.endsWith("h")); // true 
			System.out.println(str3.endsWith("endsWith")); // true 
			
		//4) 
			
	}
	
}