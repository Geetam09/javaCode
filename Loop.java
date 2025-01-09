/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- Explain How loops works. 
*/ 


class Loop{
public static void main(String args[]){
 /*for(int i=0;true;i++){
//	System.out.print("Geetam");
//	}

//while(true){
//	System.out.print("Geetam");
//}

for(int i =0;i<100;i++){
	if(i % 2 == 1){
	System.out.print(" "+i);
}else{
	continue;
}

}
*/
//for loop
for(int i=1;i<=10;i++){
 	System.out.println(i);
}
//infinite 
for(int i=0;true;i++){
	System.out.print(i);
}

//infinite 
for(; ;){
	System.out.print(i);

}

//loop flow excution
int i=0;
for(System.out.print("Start");i<5;System.out.print("Increment")){
	System.out.print("hello");
	i++;
}



}
}
//for loop 


/*
control statement
1.decision making statement
if
simple if
if else
if else ladder
nasted loop 
switch
int char string (7+version) enum
default (optional) not default null
Breck use for break the case after a true case


2.loops/looping statement
for
	for(initilisation; condition; inc/dec){}

while
	while(true/false){
	}
when to use:

and diff while and do while :

unreachable code:


do while
	do{}while();
when to use


while each 
3.jump statements
break continues return

*/