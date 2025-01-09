class Employee1{
int empId;
String name;
int salary;

public void join(){
	System.out.println("new employee join ");
}

public void salaryInfo(int s){
	if(s>0){
		if(s>50000){
			System.out.println("high");
		}else {
			System.out.println("low");
		}
	}else{
		System.out.println("Invalid ");	
	}
}

public void display(Employee1 e){

	System.out.println("employee ID : "+e.name+" employee name : "+e.name+" salary : "+e.salary);

}

public static void main(String args[]){
	Employee1 e1 = new Employee1();

e1.empId=101;
e1.name="geetam";
e1.salary=53000;
e1.join();
e1.salaryInfo(e1.salary);
e1.display(e1);

/*
//access specifier 
public 
defult
private
protected
//method
1.access specifier
2.static /final keyword (optional)
3.return type void /other datatype
4.method name 
5.parameter name 
6.mathod body{}

*/


	

}


}


