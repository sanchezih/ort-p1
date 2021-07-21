package ar.edu.ort.p1.u2.modificadoresDeAcceso.src._2_default.ok;

public class EjemploDefault2 {
	public static int getContador() {
		return EjemploDefault1.contador;// Accedemos directamente al contador desde otra clase
	}
}