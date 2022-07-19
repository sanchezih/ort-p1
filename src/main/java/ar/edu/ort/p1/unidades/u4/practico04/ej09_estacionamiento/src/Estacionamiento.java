package ar.edu.ort.p1.unidades.u4.practico04.ej09_estacionamiento.src;

import java.util.ArrayList;

import ar.edu.ort.p1.util.Fecha;

public class Estacionamiento {

	private static int CANT_PISOS = 8;
	private static int CANT_LUGARES = 6;

	private ArrayList<Registro> registros;
	private Auto autos[][];

	// Constructor
	public Estacionamiento() {
		this.registros = new ArrayList<Registro>();
		this.autos = new Auto[CANT_PISOS][CANT_LUGARES];
		inicializarEstacionamiento();
	}

	public ArrayList<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(ArrayList<Registro> registros) {
		this.registros = registros;
	}

	public Auto[][] getAutos() {
		return autos;
	}

	public void setAutos(Auto[][] autos) {
		this.autos = autos;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: La explotacion del metodo retirar, que permita resolver lo
	 * enunciado. Retorna el auto indicado o null, segun corresponda.
	 * 
	 * @param espacioNivel
	 * @return
	 */
	public Auto retirar(int espacioNivel) {
		Auto autoBuscado = null;
		int nivel;
		int espacio;
		nivel = espacioNivel / 10;
		espacio = espacioNivel % 10;

		// Hago las validaciones pedidas
		if (existeUbicacion(nivel, espacio) && // Que la ubicacion exista
				this.autos[nivel][espacio] != null && // Que el auto no se haya ya retirado
				condicionAprobada(this.autos[nivel][espacio]) // Pagos
		) {
			autoBuscado = this.autos[nivel][espacio];
			this.autos[nivel][espacio] = null;
			this.registros.add(new Registro(autoBuscado.getPatente(), Fecha.hoy()));
		}

		return autoBuscado;
	}

	private boolean existeUbicacion(int nivel, int espacio) {
		return nivel >= 0 && nivel < CANT_PISOS && espacio >= 0 && espacio < CANT_LUGARES;
	}

	private boolean condicionAprobada(Auto auto) {
		boolean condiAprobada = true;
		int mesInicio = calcularMesInicio(auto.getFechaIngreso()) - 1;
		int mesActual = Fecha.hoy().getMes() - 1;

		
		
		while (auto.getPagos()[mesActual] != null && auto.getPagos()[mesActual].getMonto() > 0
				&& mesActual >= mesInicio) {
			mesActual--;
		}

		if (mesActual >= mesInicio) {
			condiAprobada = false;
		}

		return condiAprobada;
	}

	private int calcularMesInicio(Fecha fecha) {
		int mesInicio = 1;
		
		if (fecha.getAnio() < Fecha.hoy().getAnio()) {
			mesInicio = 1;
		}
		
		if (fecha.getAnio() == Fecha.hoy().getAnio()) {
			mesInicio = fecha.getMes();
		}
		return mesInicio;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio C: La explotacion del metodo autosMasMorososPorPiso que devuelva
	 * (no muestre por consola) de cada piso, el auto con mayor cantidad de pagos no
	 * efectuados durante este anio (se supone unico por piso).
	 * 
	 * @return
	 */
	public Auto[] autosMasMorososPorPiso() {

		Auto[] autosMasMorosos = new Auto[CANT_PISOS];
		Auto autoMoroso;

		for (int f = 0; f < CANT_PISOS; f++) {
			System.out.println("Entro a ver los autos del piso " + f);
			autoMoroso = autoMasMorosoPorPiso(autos[f]);
			// autosMasMorosos[f] = autoMoroso;
		}
		return autosMasMorosos;
	}

	private Auto autoMasMorosoPorPiso(Auto[] autosMorosos) {
		Auto autoMayor = null;
		int max = 0;

		for (int i = 0; i < autosMorosos.length; i++) {
			int mesesImpagos = autosMorosos[i].getMesesImpagos();
			if (mesesImpagos > max) {
				autoMayor = autosMorosos[i];
				max = mesesImpagos;
			}
		}
		return autoMayor;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	private void inicializarEstacionamiento() {

		Pago[] pagosIHH062 = { //
				new Pago(90, "12110899"), // Ene
				new Pago(90, "12110899"), // Feb
				new Pago(90, "12110899"), // Mar
				new Pago(90, "12110899"), // Abr
				new Pago(90, "12110899"), // May
				new Pago(90, "12110899"), // Jun
				new Pago(90, "12110899"), // Jul
				new Pago(90, "12110899"), // Ago
				new Pago(90, "12110899"), // Sep
				new Pago(90, "12110899"), // Oct
				new Pago(90, "12110899"), // Nov
				new Pago(90, "12110899") // Dic
		};

		Pago[] pagosNIF512 = { //
				new Pago(90, "39867181"), // Feb
				new Pago(90, "39867181"), // Feb
				new Pago(90, "39867181"), // Feb
				new Pago(90, "39867181"), // Feb
				new Pago(90, "39867181"), // Feb
				new Pago(90, "39867181"), // Mar
				new Pago(90, "39867181"), // Abr
				null, // Ago
				null, // Sep
				null, // Oct
				null, // Nov
				null // Dic
		};

		// this.autos[0][0] = new Auto("IHH062", pagosIHH062, new Fecha(10, 1, 2021));
		this.autos[0][1] = new Auto("NIF512", pagosNIF512, new Fecha(10, 9, 2021));

	}
}
