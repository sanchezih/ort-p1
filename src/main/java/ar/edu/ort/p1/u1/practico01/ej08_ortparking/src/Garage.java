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

	public String getCodigo() {
		return codigo;
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

	public InformeGarage dameInforme() {
		return new InformeGarage(this.getCodigo(), dameCantEstacionados());
	}

	private int dameCantEstacionados() {
		return this.estacionados.size();
	}

	/**
	 * Ejercicio D: El metodo mostrarVehiculosSinLlave que debe mostrar por
	 * pantalla, de todos los garajes, el codigo del garaje y las patentes de
	 * aquellos vehiculos estacionados en el cuya llave no este guardada en el
	 * tablero.
	 */
	public void mostrarVehiculosSinLlave() {
		boolean existe;
		System.out.println(this.codigo);
		for (Vehiculo v : this.estacionados) {
			existe = this.tablero.existeLlave(v.getPatente());
			if (!existe) {
				v.getPatente();
			}
		}
	}

	/**
	 * Ejercicio E: El metodo esPersonaAutorizada, que recibe el DNI de una persona
	 * y verifica si la misma esta autorizada para retirar algun vehiculo
	 * estacionado en el garaje. Devuelve un boolean.
	 * 
	 * @param dni
	 * @return
	 */
	public boolean esPersonaAutorizada(String dni) {
		int i = 0;
		boolean estaAutorizada = false;
		Vehiculo aux;

		while (i < this.estacionados.size() && !estaAutorizada) {
			aux = this.estacionados.get(i);
			estaAutorizada = aux.esPersonaAutorizada(dni);
			i++;
		}
		return estaAutorizada;
	}

	/*----------------------------------------------------------------------------*/

	/* Metodos complementarios */

	/**
	 * Registra un vehiculo en el arraylist para validar la condicion
	 * VEHICULO_NO_HABILITADO
	 * 
	 * @param vehiculo
	 */
	public void registrarVehiculo(Vehiculo vehiculo) {
		if (!this.retirados.contains(vehiculo)) {
			this.retirados.add(vehiculo);
		}
	}

}
