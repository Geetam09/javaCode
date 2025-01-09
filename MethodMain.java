make a custom error as method level and constractor level

/* Exception propagation */

class MethodMain{
	public static void main(String args[]){
	
	//System.err.println("Welcome in Main ");
	//MethodMain m1 = new MethodMain();
	
	//m1.method1();
			try{
				
			}
			finally{
				System.out.println("This is Finally");
			}
		
	}
	
	
	
	public void method1(){
		System.out.println("Welcome in Method1");
		try{
			this.method2();
		}
		catch(ArithmeticException e){
			System.err.println("happy error Day  " + e);
		
			}
	}
	public void method2(){
		System.out.println("Welcome in Method2");
		try{
			this.method3();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("happy error Day  ");
		}
	}
	public void method3(){
		System.out.println("Welcome in Method3");
		try{
			this.method4();
		}
		catch(NullPointerException e){
			System.err.println("happy error Day" + e);
		}
	}
	public void method4(){
		System.out.println("Welcome in Method4");
		int a = 1/0;
		
	}
	
	
	
	
}