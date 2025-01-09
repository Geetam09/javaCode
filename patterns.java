/*
Author:- Geetam Dupare 
Batch:- J-56
Title:- explain patterns.

*/



class patterns{
public static void main(String args[]){
 // first
/*
for(int i=1;i<=5;i++){
	for(int j=1;j<=5;j++){
		if(i>=j){
			System.out.print("*");
		}else{
			System.out.print("");
		}
	}
	System.out.println();

   }


//2

for(int i=1;i<=5;i++){
	for(int j=i;j<=4;j++){
		System.out.print(" ");
	
	}
	for(int k=1;k<=i;k++){
		System.out.print("* ");
	
	}
	System.out.println();
}

//

int row=8;
int column=9;
int startRow=3;
int endRow=6;
int startColumn=3;
int endColumn=7;



for(int i=1;i<=row;i++){
	for(int j=1;j<=column;j++){
		if((i>=startRow && i<=endRow) && (j>=startColumn && j<=endColumn)){
			System.out.print("  ");
		}else{
			System.out.print("* ");
		}
	}
	System.out.println("");

  }*/
/* 

  0 1 2 3 4 5 6 7 8 9 1011121314
i 1 * _ _ _ _ _ * _ _ _ _ _ *
i 2 _ * _ _ _ * _ * _ _ _ * _
i 3 _ _ * _ * _ _ _ * _ * _ _
i 4 _ _ _ * _ _ _ _ _ * _ _ _

*/
int r=20,col=4;
int formula=(col*2);
for(int i=0;i<=col;i++){
	for(int j=1;j<=r;j++){
			if(i==j%(col*2) || (j%(col*2))-i ==formula){
			System.out.print("*");	
			}else{
			System.out.print(" ");				
			}
			}// inner
			formula=formula-2;
		System.out.println();
		}// outer
	}// main()
}// class
