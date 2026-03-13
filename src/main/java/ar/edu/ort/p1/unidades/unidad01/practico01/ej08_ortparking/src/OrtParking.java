package ar.edu.ort.p1.unidades.unidad01.practico01.ej08_ortparking.src;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ihsanch
 *
 */
public class OrtParking {

	private List<Garage> garages;

	/*----------------------------------------------------------------------------*/

	public OrtParking() {
		this.garages = new ArrayList<>();

	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: El metodo obtenerInformeEstadoGarajes que debe devolver una
	 * lista detallando, para cada garaje, su codigo y la cantidad de vehiculos
	 * estacionados
	 * 
	 * @return
	 */
	public List<InformeGarage> obtenerInformeEstadoGarages() {

		List<InformeGarage> lista = new ArrayList<>();

		for (Garage garage : this.garages) {
			lista.add(garage.getInforme());
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: El metodo mostrarVehiculosSinLlave que debe mostrar por
	 * pantalla, de todos los garajes, el codigo del garaje y las patentes de
	 * aquellos vehiculos estacionados en el cuya llave no este guardada en el
	 * tablero.
	 */
	public void mostrarVehiculosSinLlave() {
		for (Garage garage : this.garages) {
			garage.mostrarVehiculosSinLlave();
		}
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarGarage(Garage garage) {
		this.garages.add(garage);
	}

}
