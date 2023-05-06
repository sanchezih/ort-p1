package ar.edu.ort.p1.examenes.ds.estadisticas_reclamos_infracciones.src;

import ar.edu.ort.p1.util.Fecha;

public class Main {

	public static void main(String[] args) {

		DireccionGeneralTransito dgt = new DireccionGeneralTransito();
		dgt.agregarReclamo(
				new Reclamo("32669870", true, new ExcesoVelocidad(28, new Fecha(5, Mes.ENERO.ordinal() + 1, 2021))));
		dgt.agregarReclamo(
				new Reclamo("30520147", true, new ExcesoVelocidad(15, new Fecha(5, Mes.FEBRERO.ordinal() + 1, 2021))));
		dgt.agregarReclamo(
				new Reclamo("32669870", true, new MalEstacionamiento(30, new Fecha(4, Mes.JULIO.ordinal() + 1, 2020))));

		// Test ejercicio B
		dgt.mostrarInformeReclamadasPorMesTipo();

		// Test ejercicio D
		dgt.mostrarCantidadMalEstacionamientoCaducados();

		// Test ejercicio E
		dgt.mostrarInfraccionesReclamadasPorImporte();
	}

}
