//Programa Java para ilustrar el error al usar la clase desde un mismo paquete con modificador private
package edu.ort.p1.u2.modificadoresDeAcceso.src._1_private.nok.p1;

class B {
	public static void main(String[] args) {
		A obj = new A();
		// tratando de acceder al metodo privado de otra clase
	//	obj.mostrar(); DESCOMENTAR
	}
}