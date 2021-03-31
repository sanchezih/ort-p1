package palabraSuper._3_SuperEnConstructores;

/* superclase Person */
class Person {
	Person() {
		System.out.println("Constructor de la clase Person");
	}
}

/*--------------------------------------------------------------------------*/
/* subclase Student extiende de la clase Person */
class Student extends Person {
	Student() {
		// invoca o llama al constructor de la clase padre
		super();

		System.out.println("Constructor de la clase Student");
	}
}

/*--------------------------------------------------------------------------*/
/* Programa Controlador Test */
class Test {
	public static void main(String[] args) {
		Student s = new Student();
	}
}

/*
 * En el ejemplo anterior hemos llamado al constructor de la superclase usando
 * la palabra clave ‘super‘ a través del constructor de la subclase.
 */
