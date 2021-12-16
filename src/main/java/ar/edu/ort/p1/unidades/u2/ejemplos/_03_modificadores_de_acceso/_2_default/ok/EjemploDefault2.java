package ar.edu.ort.p1.unidades.u2.ejemplos._03_modificadores_de_acceso._2_default.ok;

public class EjemploDefault2 {

	public static int getContador() {
		return EjemploDefault1.contador;// Accedemos directamente al contador desde otra clase
	}

}