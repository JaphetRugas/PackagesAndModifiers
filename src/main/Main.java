package main;

import mathematics.*;

public class Main {
	public static void main(String[] args) {
		// Arithmetic a = new Arithmetic();
		// Constants c = new Constants(); 
		
		// int sum = a.add(1, 22);
		
		// approach if the class is set to static (add method)
		int sum = Arithmetic.add(1, 22);
		System.out.println(sum);
		 
		System.out.println(Constants.pi);
	} 

}
