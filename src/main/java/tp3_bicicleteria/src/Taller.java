package tp3_bicicleteria.src;

import java.util.ArrayList;

public class Taller {

	public ArrayList<Bicicleta> listaDeBicicletas = new ArrayList<Bicicleta>();

	public ArrayList<Bicicleta> getListaDeBicicletas() {
		return listaDeBicicletas;
	}

	public void setListaDeBicicletas(ArrayList<Bicicleta> listaDeBicicletas) {
		this.listaDeBicicletas = listaDeBicicletas;
	}

	/*
	 * B) La explotación del método cantServiciosPosibles que reciba como parámetro
	 * una lista de bicicletas y retorne a cuántas de ellas se le podrá prestar
	 * servicio según las condiciones planteadas por el taller. C) Refactoreá el
	 * método cantServiciosPosibles teniendo en cuentas las nuevas reglas puestas
	 * por el taller para las bicicletas eléctricas: “Solo se tomarán aquellas de
	 * 250w de potencia o menos y que tengan menos de 2000 kms, como el resto de las
	 * bicicletas”.
	 */
	public int cantServiciosPosibles(ArrayList<Bicicleta> listaDeBicicletas) {
		int cant = 0;
		for (Bicicleta b : listaDeBicicletas) {
			if (b.getKilometraje() < 2000) {
				if ((b instanceof BicicletaElectrica)) {
					if (((BicicletaElectrica) b).getPotencia() <= 250) {
						cant++;
					}
				} else {
					cant++;
				}
			}
		}
		return cant;
	}
}