//Programa Java para ilustrar el modificador protected
package modificadoresDeAcceso.src._public.p2;

//importar todas las clases en el paquete p1
import modificadoresDeAcceso.src._public.p1.*;

public class B extends A {
	public static void main(String[] args) {
		A obj = new A();
		obj.mostrar();
	}
}