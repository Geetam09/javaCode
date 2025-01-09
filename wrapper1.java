/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Explain Wapper Class.


*/



/*	 class
>> class which wrapper around primitive data type and convert into object 
>> java 1.5 & +

>> boxing (doing wrapper) primitive type to non primitive
>> auto boxing (auto wrapper) automatic primitive type to non primitive
>> unboxing (remove wrapper) non primitive to primitive 

>> static type valueOf() : use to assign  a value to object
>> typeValue() : provide value of object


*/
class wrapper1{
	public static void main(String args[]){
boolean b = true;
byte by = 1;
char ch = 'a';
short s = 11;
int i = 101;
float f = 31.4f;
long l = 1234;
double d = 123.4;

//Boolean type
Boolean bool1 = Boolean.valueOf(b); //boxing
Boolean bool2 = b; //auto-boxing

boolean flag = bool2.booleanValue(); // unboxing
boolean flag1 = bool2; // auto-unboxing

System.out.println(bool1.getClass());
System.out.println(bool1);
System.out.println(bool2);
System.out.println(flag);
System.out.println(flag1);


//byte type
Byte byte1 = Byte.valueOf(by);
Byte byte2 =  by;

byte g = byte1.value();
byte h = byte1;

//short type
Short sh1 = Short.valueOf(s);
Short sh2 = s;

short q = sh1.value();
short s = sh1;

//int type
Integer int1 = Integer.valueOf(i); //boxing
Integer int2 = i; //auto-boxing

int j = int1.intValue(); // unboxing
int y = int1; // auto-unboxing

//float type
Float float1 = Float.valueOf(f);
Float float2 = f;

float k = float1.floatValue();
float m = float1;

//char type
Character ch1 = Character.valueOf(ch);
Character ch2 = ch;

char a = ch1.charValue(); // unboxing
char b = ch1;


//Double type
Double double1 = Double.valueOf(d);
Double double1 = d;

double z = double1.value();
double w = double1;




	}
}




