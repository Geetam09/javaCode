/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Explain StringBuilder.


*/

/*
""note :- anonymous object(object not have ref. name ) eg. new StringBuilder() / and its only for single use.



>> class StringBuilder java 1.5
>> package java.lang.StringBuilder
>> interface implementation:- serialization appendable charSequence 
>> resolve immutable // feature mutable 
>> declre with litrals than error because its create on scp memory 
>> declare using "new" keyword always
:: constractr:-
>> StringBuilder()
>> StringBuilder(String str)
>> StringBuilder(CharSequance sc) (CharSequance :- interface object references use for child object)(eg parant p1 = new child())
//eg .  StringBuilder s1 = new StringBuilder("hello");
//      StringBuilder s2 = new StringBuilder(s1);

method :-

 1)StringBuilder append():- its appends/add a value in StringBuilder
 
 2)StringBuilder replace(int start , int end , String str):- replace a character or word in StringBuilder 

 3)StringBuilder reverse() :- reverse  a string 

*/


class StringBuilder1{
public static void main(String args[]){
	//reverse()
	String str = "ye desh mera";
	
	
		StringBuilder s1 = new StringBuilder(str);
		String str1=s1.reverse().toString();
		System.out.println(str1);
	
	
	//also we use:-
	System.out.println(new StringBuilder(str).reverse());
	
	//append()
	StringBuilder s2 = new StringBuilder(str);
	System.out.println(s2.append(" ok"));

	//or

	System.out.println(new StringBuilder(str).append(" samjha"));	

	//replace()
	StringBuilder s3 = new StringBuilder(str);
	System.out.println(s3.replace(3,7,"India"));
	
	//or

	System.out.println(new StringBuilder(str).replace(3,7,"World"));// single  use only 

	/*
	error :  String cannot be converted to StringBuilder
	StringBuilder str3 = "hello";
	System.out.println(str3);
	*/
	
	//objet of SB inside object of new SB
	System.out.println(new StringBuilder(new StringBuilder("geetam")));
   
   
   }
}











