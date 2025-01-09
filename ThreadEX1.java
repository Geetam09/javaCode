/*
Author:- Geetam Dupare 
Batch:- J-56
Title:-write a program for MultiThreading ans use function sleep() , notify() and wait() function .

*/

class ThreadEX1 extends Thread{
	public static void main(String args[]){
			ThreadEX1 t1 = new ThreadEX1();
			ThreadEX1 t2 = new ThreadEX1();
			t1.start();
			t2.start();
			t1.setName("Omkar");
			t2.setName("ragav");
			
	}
		public void run(){
			
			for(int i = 0; i<10; i++){
				System.out.println(i + " "+this.getName()+ " : - hi ");
				
				synchronized(this){
				
				try{
					this.sleep(1000);
				
				if(this.getName().equals("Omkar")){
							this.wait();
						
					} 
				if(this.getName().equals("ragav") && Thread.currentThread().isAlive() == false ){
						
							 this.notifyAll();
					}
				
					
				}
				catch(Exception e){
					System.out.println(e);
				}
				}
					
			}
				
				
			}
			
		}
	

