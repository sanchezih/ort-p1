package ar.edu.ort.p1.unidades.unidad02.ejemplos._03_modificadores_de_acceso._2_default._01_ejemplo_ok.src.paquete1;

public class UnaClaseDeEjemplo {

	public static int getColorDeLaBicicleta() {
		return Bicicleta.contador; // Accedemos directamente al contador desde otra clase
	}

}