//Programa Java para ilustrar el modificador protected
package modificadoresDeAcceso.src._protected.p2;

//importar todas las clases en el paquete p1
import modificadoresDeAcceso.src._protected.p1.*;

public class B extends A {
	public static void main(String[] args) {
		B obj = new B();
		obj.mostrar();
	}
}