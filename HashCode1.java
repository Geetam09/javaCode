/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for Hash Code.

*/

/*
hashCode object:- 
1) its logical address 
2) allocted by jvm
3) maybe uniq
4) numbric
5) non tangable

address object :-
1) its physical address
2) allocted by jvm
3) uniq always
4) alpha numbric
5) tangable

*/

class HashCode1{
	public static void main(String args[]){
		HashCode1 h1 = new HashCode1();
		
		System.out.println(h1); //HashCode1@46238e3f// return memory address
		System.out.println(h1.hashCode()); // 1176735295 // return hashCode
		System.out.println("----------------");
		
		// array of multiple object and check wheter duplcate hashCode or not....
		int[] array = new int[4];
		
		for(int i = 0 ; i <4; i++ ){
			array[i] = new HashCode1().hashCode();
		}
		
		for(int i : array ){
			System.out.println(i);
		}
		
		for(int i =0; i< array.length; i++){
			for(int j = i+1; j< array.length; j++){
				if(array[i]==array[j]){
					System.out.println("equals:= "+ array[i] + " "+ array[j] );
				}
			}
		
		}
	
	
	
	
	}
	
}