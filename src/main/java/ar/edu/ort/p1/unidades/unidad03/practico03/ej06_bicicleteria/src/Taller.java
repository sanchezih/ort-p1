package ar.edu.ort.p1.unidades.unidad03.practico03.ej06_bicicleteria.src;

import java.util.List;

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
	public int cantServiciosPosibles(List<Bicicleta> bicicletas) {
		int cantidad = 0;
		for (Bicicleta bicicleta : bicicletas) {
			if (bicicleta.isReparable()) {
				cantidad++;
			}
		}
		return cantidad;
	}

	/**
	 * Implementacion incorrecta utilizando instanceof
	 * 
	 * @param bicicletas
	 * @return
	 */
	public int cantServiciosPosiblesIncorrecto(List<Bicicleta> bicicletas) {
	
		int cantidad = 0;
		
		for (Bicicleta bicicleta : bicicletas) {
			if (bicicleta.getKilometraje() < 2000) {
				if ((bicicleta instanceof BicicletaElectrica)) {
					if (((BicicletaElectrica) bicicleta).getPotencia() <= 250) {
						cantidad++;
					}
				} else {
					cantidad++;
				}
			}
		}
		return cantidad;
	}

}