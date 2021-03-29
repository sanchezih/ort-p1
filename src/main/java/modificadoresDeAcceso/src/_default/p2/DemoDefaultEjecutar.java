//Programa Java para ilustrar el error
//al usar la clase de un paquete diferente con
//modificador default
package modificadoresDeAcceso.src._default.p2;

import modificadoresDeAcceso.src._default.p1.*;

//Esta clase tiene un modificador de acceso predeterminado
public class DemoDefaultEjecutar {
	public static void main(String args[]) {
		// accessing class Geek from package p1
		DemoDefault obj = new DemoDefault();
		obj.mostrar();
	}
}