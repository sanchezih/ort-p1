package ar.edu.ort.p1.u2.ejemplos._04_constructores.src;

/**
 * In this example, we are creating the no-arg constructor in the Bike class. It
 * will be invoked at the time of object creation.
 */

//Java Program to create and call a default constructor  
class Bike1 {

//creating a default constructor  
	Bike1() {
		System.out.println("Bike is created");
	}

//main method  
	public static void main(String args[]) {

//calling a default constructor  
		Bike1 b = new Bike1();
	}
}