
public class ForLoopGauntlet {
	public static void main(String[] args) {
//#1. display all numbers form 0 to 100
int or = 0;
for(int i=0; i<101; i++) {
System.out.println(i);	
}
//#2.Display all numbers from 100 to 0
for(int i=100; i>0; i--)	{
	System.out.println(i);
}
//#3.Display all even numbers from 2 to 100
for(int i=2; i<102; i++) {
	if(i%2==0) {
		System.out.println(i);
	}
}

//#4.Display all odd numbers from 1 to 99
for(int i=1; i<101; i++) {
if(i%2!=0) {
	System.out.println(i);
}
}		
//#5.Display all numbers from 1 to 500. If the number is odd, print "odd"
  //next to the number. If the number is even, print "even" next to the number.
for(int i=1; i<501; i++) {
	if(i%2==0) {
		System.out.println(i+" is even");
	}
	else if(i%2!=0) {
		System.out.println(i+" is odd");
	}
}
//#6.Display all multiples of 7 from 0 to 777
for(int i=7; i<778; i++) {
	if(i%7==0) {
		System.out.println(i);
	}
}
//#7.Print all the years you were alive and how old you were in each	
for(int i=2005; i<2019; i++) {
System.out.println(i-2005+","+ i);	
}
	}
}