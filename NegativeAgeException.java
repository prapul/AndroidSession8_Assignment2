package prapul;

import java.util.Scanner;

public class NegativeAgeException extends Exception{
	public static void main(String args[]) throws NegativeAgeException{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter you age: ");
		int age = inp.nextInt();
		if(age<0){
			throw new NegativeAgeException();
		}
	}
	NegativeAgeException(){
		
	}
	NegativeAgeException(int age){
		super();
	}
}
