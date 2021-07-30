package ar.edu.ort.p1.u1.practico01.ej08_ortparking.src;

import java.util.ArrayList;

public class Garage {

	public String codigo;
	public Tablero tablero;
	public ArrayList<Vehiculo> retirados;
	public ArrayList<Vehiculo> estacionados;

	public Garage(String codigo, Tablero tablero) {
		this.codigo = codigo;
		this.tablero = tablero;
		this.retirados = new ArrayList<Vehiculo>();
		this.estacionados = new ArrayList<Vehiculo>();
	}

	/**
	 * Ejercicio B: El metodo estacionarVehiculo de la clase Garaje que recibe como
	 * parametros la patente del vehiculo a ingresar. El metodo debe devolver alguno
	 * de los siguientes resultados: VEHICULO_NO_HABILITADO: cuando no se encuentra
	 * al vehiculo en el registro. VEHICULO_YA_ESTACIONADO: cuando ya figura
	 * previamente estacionado. NO_ESTACIONA_ADEUDA: si el vehiculo tiene mas de
	 * tres (3) meses adeudados. INGRESO_OK: cuando se cumplen todos los requisitos
	 * para ingresar al vehiculo, habiendo hecho los cambios correspondientes.
	 * 
	 * @param patente
	 * @return
	 */
	public Resultado estacionarVehiculo(String patente) {
		final int MAX_MESES_DEUDA = 3;
		Resultado res = Resultado.INGRESO_OK;
		Vehiculo ve;

		ve = buscarVehiculo(patente, this.estacionados);
		if (ve != null) {
			res = Resultado.VEHICULO_YA_ESTACIONADO;
		} else {
			ve = buscarVehiculo(patente, this.retirados);
			if (ve == null) {
				res = Resultado.VEHICULO_NO_HABILITADO;
			} else {
				if (ve.getMesesAdeudados() > MAX_MESES_DEUDA) {
					res = Resultado.NO_ESTACIONA_ADEUDA;
				}
			}
		}

		return res;
	}

	private Vehiculo buscarVehiculo(String patente, ArrayList<Vehiculo> lista) {

		int i = 0;
		Vehiculo vehEncontrado = null;
		Vehiculo aux;

		while (i < lista.size() && vehEncontrado == null) {
			aux = lista.get(i);
			if (aux.getPatente() == patente) {
				vehEncontrado = aux;
			} else {
				i++;
			}
		}
		return vehEncontrado;
	}
	
	/*----------------------------------------------------------------------------*/

	/* Metodos complementarios */
	
	

}
