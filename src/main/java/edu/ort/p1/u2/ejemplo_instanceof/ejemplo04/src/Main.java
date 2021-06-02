package edu.ort.p1.u2.ejemplo_instanceof.ejemplo04.src;
//Java program to check if an object of a class is also an instance of the interface implemented by the class

interface Animal {
}

class Dog implements Animal {
}

class Main {
	public static void main(String[] args) {

// create an object of the Dog class
		Dog d1 = new Dog();

// checks if the object of Dog
// is also an instance of Animal
		System.out.println(d1 instanceof Animal); // returns true
	}
}