package ar.edu.ort.p1.unidades.unidad01.practico01.ej08_ortparking.src;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private String codigo;
	private Tablero tablero;
	private List<Vehiculo> retirados;
	private List<Vehiculo> estacionados;

	/*----------------------------------------------------------------------------*/

	public Garage(String codigo, Tablero tablero) {
		this.codigo = codigo;
		this.tablero = tablero;
		this.retirados = new ArrayList<>();
		this.estacionados = new ArrayList<>();
		inicializar();
	}

	/*----------------------------------------------------------------------------*/

	public String getCodigo() {
		return codigo;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: El metodo estacionarVehiculo de la clase Garage que recibe como
	 * parametros la patente del vehiculo a ingresar. El metodo debe devolver alguno
	 * de los siguientes resultados:
	 * 
	 * VEHICULO_NO_HABILITADO: cuando no se encuentra al vehiculo en el registro.
	 * 
	 * VEHICULO_YA_ESTACIONADO: cuando ya figura previamente estacionado.
	 * 
	 * NO_ESTACIONA_ADEUDA: si el vehiculo tiene mas de tres (3) meses adeudados.
	 * 
	 * INGRESO_OK: cuando se cumplen todos los requisitos para ingresar al vehiculo,
	 * habiendo hecho los cambios correspondientes.
	 * 
	 * @param patente
	 * @return
	 */
	public Resultado estacionarVehiculo(String patente) {

		final int MAX_MESES_DEUDA = 3;
		Resultado resultado = Resultado.INGRESO_OK;

		// Se busca si el vehiculo esta actualmente
		Vehiculo vehiculo = buscarVehiculo(patente, this.estacionados);

		if (vehiculo != null) {
			resultado = Resultado.VEHICULO_YA_ESTACIONADO;
		} else {

			vehiculo = buscarVehiculo(patente, this.retirados);

			if (vehiculo == null) {
				resultado = Resultado.VEHICULO_NO_HABILITADO;
			} else {
				if (vehiculo.getMesesAdeudados() > MAX_MESES_DEUDA) {
					resultado = Resultado.NO_ESTACIONA_ADEUDA;
				}
			}
		}
		return resultado;
	}

	/**
	 * 
	 * @param patente
	 * @param lista
	 * @return
	 */
	private Vehiculo buscarVehiculo(String patente, List<Vehiculo> lista) {

		int i = 0;
		Vehiculo vehEncontrado = null;
		Vehiculo vehiculoAux;

		while (i < lista.size() && vehEncontrado == null) {
			vehiculoAux = lista.get(i);
			if (vehiculoAux.getPatente() == patente) {
				vehEncontrado = vehiculoAux;
			} else {
				i++;
			}
		}
		return vehEncontrado;
	}

	/*----------------------------------------------------------------------------*/

	public InformeGarage getInforme() {
		return new InformeGarage(this.getCodigo(), getCantEstacionados());
	}

	private int getCantEstacionados() {
		return this.estacionados.size();
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio D: El metodo mostrarVehiculosSinLlave que debe mostrar por
	 * pantalla, de todos los garajes, el codigo del garaje y las patentes de
	 * aquellos vehiculos estacionados en el cuya llave no este guardada en el
	 * tablero.
	 */
	public void mostrarVehiculosSinLlave() {

		boolean existe;
		System.out.println(this.codigo);

		for (Vehiculo vehiculo : this.estacionados) {
			existe = this.tablero.existeLlave(vehiculo.getPatente());
			if (!existe) {
				vehiculo.getPatente();
			}
		}
	}

	/*----------------------------------------------------------------------------*/

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
		Vehiculo vehiculoAux;

		while (i < this.estacionados.size() && !estaAutorizada) {
			vehiculoAux = this.estacionados.get(i);
			estaAutorizada = vehiculoAux.esPersonaAutorizada(dni);
			i++;
		}
		return estaAutorizada;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializar() {

		this.retirados.add(new Vehiculo("CXE882"));
		this.retirados.add(new Vehiculo("AJQ503"));
		this.retirados.add(new Vehiculo("IHW061"));

		this.estacionados.add(new Vehiculo("EBS222"));

	}

}
