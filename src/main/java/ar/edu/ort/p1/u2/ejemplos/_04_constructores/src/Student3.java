package ar.edu.ort.p1.u2.ejemplos._04_constructores.src;

/**
 * Q) What is the purpose of a default constructor? The default constructor is
 * used to provide the default values to the object like 0, null, etc.,
 * depending on the type.
 * 
 * @author ihsanch
 *
 */

//Let us see another example of default constructor which displays the default values  
class Student3 {
	int id;
	String name;

	//method to display the value of id and name  
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {

		// creating objects
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();

		// displaying values of the object
		s1.display();
		s2.display();
	}

	/**
	 * Explanation:In the above class,you are not creating any constructor so
	 * compiler provides you a default constructor. Here 0 and null values are
	 * provided by default constructor.
	 */
}