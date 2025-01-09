/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- make a custom error as method level and constractor level.

*/
/* */

class MainExecption{
	public static void main(String args[]){
		try{
		Person p1 = new Person("Geetam",21);
		Person p2 = new Person("Yash",16);
		
		
			//Person.isElegible(p1);
			//Person.isElegible(p2);
		}
		catch(MinorAgeException e ){
			System.out.println(e);
		}
	
	}
}

class MinorAgeException extends Exception {
		MinorAgeException(String massage){
			super(massage);
		}
	
}

class Person {
	private String name;
	private int age;
	
	// throws as a constractor lavel
	Person(String name,int age) throws MinorAgeException{
		this.name = name;
		this.age = age;
		if(this.age>18 && this.age!=0){
			System.out.println(this.name = name+" "+ " YOU ARE ELEGIBLE FOR VOTE  ");
			}else{
			throw new MinorAgeException("Sorry,You Are Not Elegible ! try next Year");
		}
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	/*
	// throws as a method level
	
	
	public static void isElegible(Person p) throws Exception{
		if(p.getAge()>18 && p.getAge()!=0){
			System.out.println(p.getName()+" "+ " YOU ARE ELEGIBLE FOR VOTE  ");
			}else{
			throw new MinorAgeException("Sorry,You Are Not Elegible ! try next Year");
		}
	}
	*/
	
}


