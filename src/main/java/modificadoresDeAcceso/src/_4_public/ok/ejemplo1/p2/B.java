//Programa Java para ilustrar el modificador protected
package modificadoresDeAcceso.src._4_public.ok.ejemplo1.p2;

import modificadoresDeAcceso.src._4_public.ok.ejemplo1.p1.*;

public class B extends A {
	public static void main(String[] args) {
		A obj = new A();
		obj.mostrar();
	}
}