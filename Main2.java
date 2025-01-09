/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for adhar no(validte).
*/
//indian (display info)

class Main3{
public static void main(String args[]){

Address p1 = new Address("maharastra","pune","KFC store",411044);

Indian i1 = new Indian("Geetam",686669567649L,p1);
i1.isValid();
i1.displayInfo();

System.out.println(i1.getClass());// return class name of obj its a method from object class(root class);
System.out.println(i1.getClass().getName());
System.out.println(i1.getClass().getSimpleName());

System.out.println("**************************************");
System.out.println(i1);// it means = i1.toString()



}	

}


//person
class Person{
 
	String name;

} 

//Address class
class Address {
 String state;
 String city;
 String landMark;
 int Pin;

	Address(String state,String city,String landMark,int Pin){
		this.state=state;
		this.city=city;
		this.landMark=landMark;
		this.Pin=Pin;
	


	}
}



//Indian class
class Indian extends Person {
long adharNo;
Address addr;

	Indian(String name,long adharNo,Address addr){
		this.name=name;
		this.addr=addr;
		this.adharNo=adharNo;	
		
		
}

public void isValid(){
	if(adharNo>=100000000000L && adharNo<=999999999999L){
		System.out.println("vaild adhar");	
	}else{	
		adharNo=0;
		System.out.println("vaild adhar");
	}
}

public String toString(){
	return name+" "+adharNo;
}

public void displayInfo(){
	System.out.println("Person name:-"+name);
	System.out.println("Person adhar No.:-"+adharNo);
	System.out.println("Person Landmark:-"+addr.landMark);
	System.out.println("Person city:-"+addr.city);
	System.out.println("Person state:-"+addr.state);
	System.out.println("Person Pin  number:-"+addr.Pin);
	
}
}






