package palabraSuper._3_SuperEnConstructores;

class Person {
	Person() {
		System.out.println("Soy el constructor de la clase Person");
	}
}

/*--------------------------------------------------------------------------*/
class Student extends Person {
	Student() {
		super(); // invoca al constructor de la clase padre
		System.out.println("Soy el constructor de la clase Student");
	}
}

/*--------------------------------------------------------------------------*/
class Test {
	public static void main(String[] args) {
		Student s = new Student();
	}
}

/*
 * En el ejemplo hemos llamado al constructor de la superclase usando la palabra
 * clave 'super' a través del constructor de la subclase.
 */