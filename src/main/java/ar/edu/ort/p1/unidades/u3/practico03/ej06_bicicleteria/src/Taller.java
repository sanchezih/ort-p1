package ar.edu.ort.p1.unidades.u3.practico03.ej06_bicicleteria.src;

import java.util.ArrayList;

public class Taller {

	/**
	 * Ejercicio B: La explotacion del metodo cantServiciosPosibles que reciba como
	 * parametro una lista de bicicletas y retorne a cuantas de ellas se le podra
	 * prestar servicio segun las condiciones planteadas por el taller.
	 * 
	 * Ejercicio C: Refactorea el metodo cantServiciosPosibles teniendo en cuentas
	 * las nuevas reglas puestas por el taller para las bicicletas electricas: "Solo
	 * se tomaran aquellas de 250w de potencia o menos y que tengan menos de 2000
	 * kms, como el resto de las bicicletas".
	 * 
	 * @param bicicletas
	 * @return
	 */

	/* Implementacion correcta con polimorfismo */
	public int cantServiciosPosibles(ArrayList<Bicicleta> bicicletas) {
		int cant = 0;
		for (Bicicleta b : bicicletas) {
			if (b.isReparable()) {
				cant++;
			}
		}
		return cant;
	}

	/* Implementacion incorrecta con instanceof */
//	public int cantServiciosPosibles(ArrayList<Bicicleta> bicicletas) {
//		int cant = 0;
//		for (Bicicleta b : bicicletas) {
//			if (b.getKilometraje() < 2000) {
//				if ((b instanceof BicicletaElectrica)) {
//					if (((BicicletaElectrica) b).getPotencia() <= 250) {
//						cant++;
//					}
//				} else {
//					cant++;
//				}
//			}
//		}
//		return cant;
//	}

}