package ar.edu.ort.p1.extra.examenes._2021c1._recu1.reclamos_infracciones.src;

public class Main {

	public static void main(String[] args) {

		Reclamo r1 = new Reclamo("30520147", true, new ExcesoVelocidad(15, new Fecha(5, Mes.FEBRERO, 2021)));
		Reclamo r2 = new Reclamo("32669870", true, new ExcesoVelocidad(28, new Fecha(5, Mes.ENERO, 2021)));
		Reclamo r3 = new Reclamo("32669870", true, new MalEstacionamiento(30, new Fecha(4, Mes.JULIO, 2020)));

		/*----------------------------------------------------------------------------*/

		DireccionGeneralTransito dgt = new DireccionGeneralTransito();
		dgt.agregarReclamo(r2);
		dgt.agregarReclamo(r1);
		dgt.agregarReclamo(r3);

		/*----------------------------------------------------------------------------*/

		/**
		 * B) El metodo informeReclamadasPorMesTipo() que debe devolver (no mostrar por
		 * consola) la cantidad de infracciones reclamadas por tipo de infraccion y mes.
		 */

		dgt.mostrarInformeReclamadasPorMesTipo();

		/*----------------------------------------------------------------------------*/

		/**
		 * D) El metodo cantidadMalEstacionamientoCaducadas() que debe devolver (no
		 * mostrar por consola) la cantidad de infracciones reclamadas del tipo Mal
		 * Estacionamiento que resultaron caducadas.
		 */

		dgt.mostrarCantidadMalEstacionamientoCaducados();

		/*----------------------------------------------------------------------------*/

		/**
		 * E) El metodo infraccionesReclamadasPorImporte() que debe devolver (no mostrar
		 * por consola) un listado de infracciones reclamadas ordenadas de forma
		 * ascendente por el importe.
		 */

		dgt.mostrarInfraccionesReclamadasPorImporte();
	}

}
