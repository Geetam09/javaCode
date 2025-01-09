/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- 1) Explain How Array Works and make multiple array with different dataType .


*/ 





/*

//Arrays-->
1.its a collection of similar(homogenous) datatypes elements.
2.contagious memory
3.index:- (position of elements) start from 0
	use:- direct access to elements 
4.static memory allocations(limited momery we can assign )-->dynamic size growths not possible...
5.array is non-premitive data type 
6.java 5 and + foreach loop (we use for iterate a array element)syntex:- for(type localElement : arrayName){sop(localElement)}
7.multi-dimension array (array within array) 3x3
8.jacked array (length of array defined MxN(3x4) value not same )(asymmetric multidimensional array)
9.length():= is data members of array class use to find the length of array
10.we can create a class object's array also.. using type as a class name class student s1[] = new student[5];   
 															
*/

class Array{
public static void main(String args[]){
//using int dataType 

	int[] array = new int[5];//we can also use: (int[] array /int array[] / int []array)
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	array[4]=50;

	//OR
	
//	int array[] = {10,20,30,40,50};		

System.out.println(array[3]);//display a single element with position

	for(int i=0;i<array.length; i++){       
		System.out.println(array[i]);
	}						//for loop use to display all elements

	for(int i : array){
		System.out.println(i);		//for each loop 
	}
					
System.out.println("________________________________");
//using boolean dataType:-

	boolean arrayBool[]={true,false,true,false,true};

	System.out.println(arrayBool[2]);

	for(int i=0;i< arrayBool.length; i++){       
		System.out.println( arrayBool[i]);
	}
	
	for(boolean i : arrayBool){
		System.out.println(i);
	}					
System.out.println("________________________________");
//using byte dataType:-

	byte[] arrayByte = new byte[5];
	arrayByte[0] = 1;
	arrayByte[1] = 2;
	arrayByte[2] = 3;
	arrayByte[3] = 4;
	arrayByte[4] = 5;

	System.out.println(arrayByte[1]);

	for(int i=0;i< arrayByte.length; i++){       
		System.out.println( arrayByte[i]);
	}					

System.out.println("________________________________");
//using short dataType:-

short arrayShort[] ={11,12,13,14,15};

	System.out.println(arrayShort[3]);

	for(int i=0;i< arrayShort.length; i++){       
		System.out.println( arrayShort[i]);
	}
	for(short ele : arrayShort ){System.out.println(ele);}					

System.out.println("________________________________");
//using float dataType:-

float arrayfloat[] = {11.1f,12.2f,13.2f,14.5f,16.4f}; 

	System.out.println(arrayfloat[0]);

	for(int i=0;i< arrayfloat.length; i++){       
		System.out.println( arrayfloat[i]);
	}

	for(float ele : arrayfloat ){System.out.println(ele);}

System.out.println("________________________________");
//using char dataType:-

char arrayChar[] = {'a','b','c','d','e'}; 

	System.out.println(arrayChar[3]);

	for(int i=0;i< arrayChar.length; i++){       
		System.out.println( arrayChar[i]);
	}

	for(char ele : arrayChar ){System.out.println(ele);}

System.out.println("________________________________");
//using String dataType:-

String arrayString[] = {"apple","banana","gava","mango","pineapple"}; 

	System.out.println(arrayChar[4]);

	for(int i=0;i< arrayString.length; i++){       
		System.out.println( arrayString[i]);
	}
	
for(String ele : arrayString){System.out.println(ele);}	

System.out.println("________________________________");

//using long dataType:-

long arraylong[] = {123455l,63732l,23455l,111111111l,3333333333l}; 

	System.out.println(arraylong[4]);

	for(int i=0;i<  arraylong.length; i++){       
		System.out.println( arraylong[i]);
	}
	
for(long ele : arraylong){System.out.println(ele);}	

System.out.println("________________________________");

//using Double dataType:-

double arraydouble[] = {1.23,63.73,23.45,11.11,33.33}; 

	System.out.println(arraydouble[4]);

	for(int i=0;i<arraydouble.length; i++){       
		System.out.println( arraydouble[i]);
	}
	
for(double ele : arraydouble){System.out.println(ele);}	

System.out.println("________________________________");

					
//multi-dimension array

int arrayMD[][] = {{1,2,3},
		   {4,5,6},
		   {6,7,8}};//allow:- int[] arrayMD | int []arrayMD[] | int [][]array
// OR

int[][] arrayMD2 = new int[3][3];
arrayMD2[0][0]=1;
arrayMD2[0][1]=2;
arrayMD2[0][2]=3;
arrayMD2[1][0]=10;
arrayMD2[1][1]=20;
arrayMD2[1][2]=30;
arrayMD2[2][0]=100;
arrayMD2[2][1]=200;
arrayMD2[2][2]=300;

//OR
int a[]={1,2,3};
int b[]={3,4,5};
int c[]={5,6,7};

int arrayMD3[][]={a,b,c};

 

System.out.println(arrayMD[1].length);//3
System.out.println(arrayMD[1][1]);//5

//how to print all array at once ?

for(int i = 0; i<arrayMD2.length;i++){
	for(int j = 0;j<arrayMD2[i].length;j++){
		System.out.print(arrayMD2[i][j]+" ");

	}
	  System.out.println();

 }

System.out.println("________________________________");
//jacked array (unsymmetrical array )

int arrayJk[][] = {{1,2,3,4},{10,20,40},{4,3,6,7,7}};//index 1 : 4 length index 2 : 3 length (diff size of array in MD)

for(int i = 0; i<arrayJk.length;i++){
	for(int j = 0;j<arrayJk[i].length;j++){
		System.out.print(arrayJk[i][j]+" ");

	}
	  System.out.println();

 }
 
 int arrayJKQ[][] = {{1},{1,2},{1,2,3}};
 
  
 for (int i=0;i<arrayJKQ.length;i++){
	 for(int j = 0;j<arrayJKQ[i].length;j++){
		 System.out.print(arrayJKQ[i][j]+" ");
	 }
	System.out.println();
 }
 

 } 

}