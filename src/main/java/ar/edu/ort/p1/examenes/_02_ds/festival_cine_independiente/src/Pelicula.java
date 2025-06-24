package ar.edu.ort.p1.examenes._02_ds.festival_cine_independiente.src;

public class Pelicula {

	private static final int CANT_BUTACAS = 2;

	private String nombre;
	private Nomina[] nominas;

	/*----------------------------------------------------------------------------*/

	public Pelicula(String nombre) {
		this.nombre = nombre;
		this.nominas = new Nomina[TipoDeFuncion.values().length];
		this.nominas[0] = new NominaPorDNI(CANT_BUTACAS);
		this.nominas[1] = new NominaPorDNI(CANT_BUTACAS);
		this.nominas[2] = new NominaPorOrdenDeLlegada();
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 * @return
	 */
	public boolean mismoNombre(String nombre) {
		return this.nombre.equals(nombre);
	}

	/**
	 * 
	 * @param registracion
	 * @param esParticipanteVip
	 */
	public void acreditar(Registracion registracion, boolean esParticipanteVip) {

		Acreditacion acreditacion = registracion.generarAcreditacion();

		if (esParticipanteVip) {
			asignarAcreditacionVip(acreditacion);
		} else {
			this.nominas[TipoDeFuncion.GENERAL.ordinal()].agregarAcreditacion(acreditacion);
		}
	}

	/**
	 * 
	 * @param acreditacion
	 */
	private void asignarAcreditacionVip(Acreditacion acreditacion) {
		boolean asignada = false;
		int index = 0;
		Nomina nomina = null;

		while (!asignada && index < TipoDeFuncion.values().length) {
			nomina = this.nominas[index];

			if (nomina.hayDisponibilidad()) {
				nomina.agregarAcreditacion(acreditacion);
				asignada = true;
			} else {
				index++;
			}
		}
	}

	/**
	 * 
	 * @return
	 */
	public int[] getAcreditadosPorTipoDeFuncion() {
		int[] acreditadosPorTipoDeFuncion = new int[TipoDeFuncion.values().length];

		for (int i = 0; i < this.nominas.length; i++) {
			acreditadosPorTipoDeFuncion[i] = this.nominas[i].getCantidadDeAcreditaciones();
		}
		return acreditadosPorTipoDeFuncion;
	}

	/**
	 * 
	 * @param dni
	 * @return
	 */
	public Acreditacion obtenerAcreditacion(int dni) {
		int index = 0;
		Acreditacion acreditacion = null;
		Acreditacion acreditacionAEvaluar = null;
		Nomina nomina = null;

		while (acreditacion == null && index < TipoDeFuncion.values().length) {
			nomina = this.nominas[index];
			acreditacionAEvaluar = nomina.obtenerAcreditacion(dni);
			if (acreditacionAEvaluar != null) {
				acreditacion = acreditacionAEvaluar;
			} else {
				index++;
			}
		}
		return acreditacion;
	}

}
