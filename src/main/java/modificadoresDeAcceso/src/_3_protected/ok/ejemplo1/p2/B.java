//Programa Java para ilustrar el modificador protected
package modificadoresDeAcceso.src._3_protected.ok.ejemplo1.p2;

import modificadoresDeAcceso.src._3_protected.ok.ejemplo1.p1.*;

public class B extends A {
	public static void main(String[] args) {
		B obj = new B();
		obj.mostrar();
	}
}