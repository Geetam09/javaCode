/*
Author:- Geetam Dupare 
Batch:- J-56
Title:-write a program for MultiThreading ans use function sleep() , notify() and wait() function .

*/

class ThreadEX2 extends Thread{
	public static void main(String args[]){
			ThreadEX2 t1 = new ThreadEX2();
			ThreadEX2 t2 = new ThreadEX2();
			
			t1.setName("Omkar");
			t2.setName("ragav");
			
			t1.start();
			
			
			/*try{
				t1.join();
			}catch(Exception e){
				System.out.println(e);
			}
			
			t2.start();
			*/
			synchronized(t1){
				
				try{
					t1.wait();
				}catch(Exception e){
					System.out.println(e);
				}	
			
				try{
					t1.notify();
				}catch(Exception e){
					System.out.println(e);
				}
			
			}
			t2.start();
			
			
			
	}
		public void run(){
			
			for(int i = 0; i<10; i++){
				System.out.println(i + " "+this.getName()+ " : - hi ");
			}
		}
}