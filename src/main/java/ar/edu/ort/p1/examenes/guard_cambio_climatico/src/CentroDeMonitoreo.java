package ar.edu.ort.p1.examenes.guard_cambio_climatico.src;

import ar.edu.ort.p1.util.Matematica;

public class CentroDeMonitoreo {
	private static final int CANT_MESES = 12;
	private static final int CANT_DIAS_X_MES = 28;
	private PilaDeZonas zonas;

	public CentroDeMonitoreo() {
		this.zonas = new PilaDeZonas();
	}

	/**
	 * Ejercicio B: El método porcentajeDeZonasEnRiesgo, que debe devolver (no
	 * mostrar por consola) el porcentaje de todas las zonas que tiene el centro de
	 * monitoreo que estén en riesgo.
	 * 
	 * @return
	 */
	public double porcentajeDeZonasEnRiesgo() {
		PilaDeZonas pilaAux;
		Zona zona;
		int cantZonasRiesgosas = 0;
		int cantZonas = 0;

		pilaAux = new PilaDeZonas();

		while (!this.zonas.isEmpty()) {
			zona = this.zonas.pop();
			pilaAux.push(zona);
			
			if (zona.enRiesgo()) {
				cantZonasRiesgosas++;
			}
			cantZonas++;
		}

		while (!pilaAux.isEmpty()) {
			this.zonas.push(pilaAux.pop());
		}

		return Matematica.porcentaje(cantZonasRiesgosas, cantZonas);
	}

	/**
	 * Ejercicio C: El metodo zonasInferioresSegunMesYTemp que recibe un numero de
	 * mes (ya validado entre 1 y 12) y una temperatura. Debe devolver (no mostrar
	 * por consola) una lista de zonas, ordenada por elevación descendente, en cuyo
	 * mes indicado haya alguna temperatura inferior a la recibida.
	 */

	public ListaZonasPorElevacion zonasInferioresSegunMesYTemp(int mes, double temp) {

		PilaDeZonas pilaAux = new PilaDeZonas(); // se hace?
		Zona zona;
		ListaZonasPorElevacion lista;
		lista = new ListaZonasPorElevacion();
		
		while (!this.zonas.isEmpty()) {
			zona = this.zonas.pop();
			pilaAux.push(zona);
			
			if (zona.algunaInferiorA(temp, mes)) {
				lista.add(zona);
			}
		}
		return lista;
	}

}
