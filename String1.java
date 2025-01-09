/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Explain string class.


*/


class String1{
	public static void main(String args[]){
		char array[]={'H','e','l','l','o',' ','w','o','r','l','d'};
		for(char i : array){
			System.out.print(i);
			}
		String str = new String();
		String str1 = new String(array);//String(char[]  value)
	
	System.out.println(str+" "+str1);

String s1 = "Hello";// store into SCP //value assign with litrals 
String s2 = new String("hello");//store asa object in heap
String s3 = "Hello";
	
	
	System.out.println(s1.charAt(1));// e
	
	System.out.println(s1.compareTo(s3)); // 0 (return int)
	System.out.println(s1.compareTo("Hello"));// 0 
	
	System.out.println(s1.concat(s3));// HelloHello
	
	System.out.println(s1.contains("ll"));// true
	
	System.out.println(s1.equals("Hello"));//true



//reverse string using charAt function.

 String name = "JSPM COLLAGE";	
 int count = name.length()-1;
 for(int i = count; i >= 0; i--){
	System.out.print(name.charAt(i));
  }

String name1 = "Mr.geetam";
int count1 = name1.indexOf('g');

System.out.print(count1);

for(int i = 0; i < name1.length(); i++ ){
	if(name1.indexOf('.')){
	
	}
}



		
	}
}

/*String 

:# String is a set of characters or sequence of characters.
:# from java.lang.String package.

constractor:-
:1)String() //constractor return empty value.
:2)String(char[]  value) : return array set of char type.

:# SCP---> string constant pool (heep) special type of memory arragement in heap storage.(no reference than remove from 	scp by GC ) (on heap after version 7)

:method:-

1) char charAt(int index): returns the index value of staring. 

2) int  compareTo(String str) : compare two string lexicographically. --> 0 if true 

3) String concat(String str): cancadinate two strings 

4) boolean cantains(String str) : return true if it cantains the char in string else false

5)boolean equals(String str ) :  return true value equal as declare

6)boolean equalsIgnoreCase(String str) : case are ignore while chaking 

7) int length(string str) : return length of string.

8) int indexOff(char ch ): return index value of given character from string else return -1 if no one.......












** "==" :- it check address if it is equal return true else false.
** equals() :- it check value : if address is diff but value is same return true else false.
*/