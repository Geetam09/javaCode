/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Explain MultiThreading write a program for MultiThreading .

*/
/* 
MultiThreading :- multiple task run at a time
 level- thread level and process level
 
in java achive Thread and Process
Thread:- is lightweight | smallest part of excution |
	state of thread:- wait,run,Start,stop,sleep,
	method:- wait(),notify(),notifyAll(),start(),run()
			start() method explicitly call run() method
			int setProirty() ;- to set proity numits beetween 1 to 10 defulat one is 5
			int getProirty() - to get proity num
			
			long getId()
			
			static void sleep(int millisecond):- currently excution thread are stop/sleep  | always in try{}
			static int MAX_PRIORITY(10)
			static int NORM_PRIORITY(5)
			static int MIN_PRIORITY(1)
			
			type of thread:-
			Daemon thread:- low proity | background run | lightweight
			
			lock - for lock the resources			
			relase - for relase the resources
			
			deadlock:- its a situvation arise when excution of thread are stop becouse another thread holding a same resources which first thread needed
				
			sleep();- delay	the thread
			wait(); stop until notify 
			wait(millisecond); stop until millisecond 
			
			yield(); temprory stop pause
			notify(); notify the one thread
			notifyAll(); notify All thread who in wait 
			isAlive(); return true if thread is alive
			interrupt(); stop the thread
			setName(); set a name of thread
			getName(); get the name of seted thread
			isDaemon(); return true if thread is running in background | low priorty | long run 
			setDaemon(boolean b); set a  Daemon for any thread
			join():-
			
			synchronized{
				//allows one thread at time 
			}
			
			Thread and Runnable
			>Runnable having only run method 
			>its need to implement
			>we can make a thread using Runnable
			
			thread life cycle :-
			1.new born
			2.Runnable
			3.running
			4.waiting
			5.sleep
			6.awake
			7.Blocked/completed
			
Process:- is heavy weight | having multiple thread

 */


class MultiThread{
public static void main(String args[]){
	MyThread t1 = new MyThread();
	MyThread t2 = new MyThread();
	
	t1.setPriority(Thread.MAX_PRIORITY);
	t1.start();
	t2.start();
	
	}	
}

class MyThread extends Thread{
		public void run(){
		for(int i=0;i<10;i++){
		System.out.println(i +" : "+this.getClass()+":-   hi");
		
		try{
			this.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
		}
	}
	
}