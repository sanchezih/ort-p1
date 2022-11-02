package ar.edu.ort.p1.unidades.u2.ejemplos._03_modificadores_de_acceso._2_default.ok.src;

public class UnaClaseDeEjemplo {

	public static int getColorDeLaBicicleta() {
		return Bicicleta.contador; // Accedemos directamente al contador desde otra clase
	}

}