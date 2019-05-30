
public class Fibonacci {
	public static void main(String[] args) {	
int sum=0; 
int add=1;
int swap=1;
swap=sum;
sum=add;
add=swap;
int up= 0;
System.out.println("0");
for(int i=0; i<12; i++) {
			up=sum+add;
			System.out.println(up);
			sum=add;
			add=up;
		}
		
		
	}
}
