/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- write a program for Movie class and there multiple opration. 


*/

class Movies{

Movies(){
	System.out.println("non-parameterized");
}

Movies(String movieName,float rating,boolean isHit,short ticketPrize,int totalCollection,char sensorCertificate){
	System.out.println("parameterized");

	this.movieName=movieName;
	this.rating=rating;
	this.isHit=isHit;
	this.ticketPrize=ticketPrize;
	this.totalCollection=totalCollection;
	this.sensorCertificate=sensorCertificate;


	
}

Movies(String movieName,float rating,boolean isHit){
	System.out.println("parameterized");

	this.movieName=movieName;
	this.rating=rating;
	this.isHit=isHit;
	}


private String movieName;
private float rating;
private boolean isHit;
private  short ticketPrize;
private int totalCollection;
private char sensorCertificate;
 

public void SetMovies(String movieName){
	this.movieName=movieName;
}

public void setRating(float rating){
	this.rating=rating;
}

public String getMovies(){
	return this.movieName;
}

public float getRating(){
	return this.rating;
}

public void setisHit1(Boolean isHit){
	this.isHit=isHit;
}

public boolean getisHit1(){
	return this.isHit;
}

public void setticketPrize(short ticketPrize){
	this.ticketPrize=ticketPrize;
}

public short getticketPrize(){
	return this.ticketPrize;
}

public void settotalCollection(int totalCollection){
	this.totalCollection=totalCollection;
}

public int gettotalCollection(){
	return this.totalCollection;
}

public void setsensorCertificate(char sensorCertificate){
	this.sensorCertificate=sensorCertificate;
}

public char getsensorCertificate(){
	return this.sensorCertificate;
}



public static void main(String args[]){

Movies movie1 =new Movies();
	System.out.println(movie1.getMovies());
	System.out.println(movie1.getRating());
	System.out.println(movie1.getisHit1());
	System.out.println(movie1.getticketPrize());
	System.out.println(movie1.gettotalCollection());
	System.out.println(movie1.getsensorCertificate());


Movies movie2 =new Movies("Leo",5.5f,true,(short)1,10000000,'A');
	System.out.println(movie2.getMovies());
	System.out.println(movie2.getRating());
	System.out.println(movie2.getisHit1());
	System.out.println(movie2.getticketPrize());
	System.out.println(movie2.gettotalCollection());
	System.out.println(movie2.getsensorCertificate());

Movies movie3 =new Movies("Dhoom",5.5f,true);
	System.out.println(movie3.getMovies());
	System.out.println(movie3.getRating());
	System.out.println(movie3.getisHit1());

}
}