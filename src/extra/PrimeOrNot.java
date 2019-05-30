package extra;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
	String prime = JOptionPane.showInputDialog("Pick a number between 1-100");
	int odd=Integer.parseInt(prime);
	boolean isprime = true;
	for(int i=2;i<odd;i++) {
		if(odd%i==0) {
isprime=false;		
		}
	}
if(isprime==true) {
	JOptionPane.showMessageDialog(null, odd+" is prime");
}
else {
	JOptionPane.showMessageDialog(null, odd+ " is not prime");
}
	}
}