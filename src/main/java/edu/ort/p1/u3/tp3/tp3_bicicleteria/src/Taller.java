package edu.ort.p1.u3.tp3.tp3_bicicleteria.src;

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
	 * B) La explotaci�n del m�todo cantServiciosPosibles que reciba como par�metro
	 * una lista de bicicletas y retorne a cu�ntas de ellas se le podr� prestar
	 * servicio seg�n las condiciones planteadas por el taller. C) Refactore� el
	 * m�todo cantServiciosPosibles teniendo en cuentas las nuevas reglas puestas
	 * por el taller para las bicicletas el�ctricas: �Solo se tomar�n aquellas de
	 * 250w de potencia o menos y que tengan menos de 2000 kms, como el resto de las
	 * bicicletas�.
	 */
	
	// Con polimorfismo
	public int cantServiciosPosibles(ArrayList<Bicicleta> listaDeBicicletas) {
		int cant = 0;
		for (Bicicleta b : listaDeBicicletas) {
			if(b.isReparable()) {
				cant++;
			}
		}
		return cant;
	}	
	
	// Con instanceof
	//	public int cantServiciosPosibles(ArrayList<Bicicleta> listaDeBicicletas) {
	//		int cant = 0;
	//		for (Bicicleta b : listaDeBicicletas) {
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