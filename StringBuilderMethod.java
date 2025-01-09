/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Explain StringBuilder with 5 method.


*/


class StringBuilderMethod{
	public static void main(String args[]){
		//03 :- 5 StringBuilder mathod:-
		//1) public String substring(int start){} //return substring from string
		
		StringBuilder str1 = new StringBuilder("this is substring");
		System.out.println(str1.substring(8)); // substring
		System.out.println(new StringBuilder("this is substring").substring(8)); // substring
		
		//2) int capacity() // return capacity of string
		
		StringBuilder str2 = new StringBuilder("this is Capacity"); //32
		System.out.println(str2.capacity());
		System.out.println(new StringBuilder("this is Capacity"	).capacity()); //32
		
	   //3) StringBuilder delete(int start, int end) // delete a substring from string
	   
	   	StringBuilder str3 = new StringBuilder("this is delete");
		System.out.println(str3.delete(0, 7));  // delete
		System.out.println(new StringBuilder("this is delete").delete(0, 5)); // is delete 
		
		//4) StringBuilder deleteCharAt(int index) // remove specific char into string
		
	   	StringBuilder str4 = new StringBuilder("this is deleteCharAt");
		System.out.println(str4.deleteCharAt(18));//this is deleteChart
		System.out.println(new StringBuilder("this is deleteCharAt").deleteCharAt(13)); // this is deletCharAt
		
		//5)int indexOf(String str) // return index of string with first occurrence in substring 
		
	   	StringBuilder str5 = new StringBuilder("this is indexOf");
		System.out.println(str5.indexOf("O")); // 13
		System.out.println(new StringBuilder("this is indexOf").indexOf("d")); 
		
	}
	
}