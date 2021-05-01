package edu.ort.ejemplo_instanceof.ejemplo03.src;

// Java Program to check if an object of the subclass is also an instance of the superclass

// Superclass
class Animal {
}

// Subclass
class Dog extends Animal {
}

class Main {
	public static void main(String[] args) {

		// create an object of the subclass
		Dog d1 = new Dog();

		// checks if d1 is an instance of the subclass
		System.out.println(d1 instanceof Dog); // prints true

		// checks if d1 is an instance of the superclass
		System.out.println(d1 instanceof Animal); // prints true
	}
}