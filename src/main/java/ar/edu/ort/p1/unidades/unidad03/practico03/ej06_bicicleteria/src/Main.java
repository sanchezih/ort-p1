package ar.edu.ort.p1.unidades.unidad03.practico03.ej06_bicicleteria.src;

import java.util.ArrayList;
import java.util.List;

/**
 * Nota: Este ejercicio, tal como esta planteado, no indica la necesidad de
 * tener clases abstractas. El taller no tiene la necesidad de conocer a las
 * bicicletas electricas, por tal motivo las recibe como parametro en vez de
 * tener que tener una lista de bicicletas.
 * 
 */
public class Main {

	public static void main(String[] args) {

		List<Bicicleta> bicicletas = new ArrayList<>();

		bicicletas.add(new Bicicleta("Trek", "T-001", 1999));
		bicicletas.add(new Bicicleta("Trek", "T-002", 1999));

		bicicletas.add(new BicicletaElectrica("Lion", "L-10", 1999, 250));
		bicicletas.add(new BicicletaElectrica("Lion", "L-10", 1999, 251));
		bicicletas.add(new BicicletaElectrica("Lion", "L-10", 2000, 180));

		/*----------------------------------------------------------------------------*/

		Taller taller = new Taller();

		// Test ejercicios B y C
		System.out.println(
				"El taller le podra prestar servicio a " + taller.cantServiciosPosibles(bicicletas) + " bicicletas.");
	}

}
