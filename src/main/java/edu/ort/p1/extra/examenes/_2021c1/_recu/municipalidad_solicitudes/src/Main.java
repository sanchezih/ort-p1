package edu.ort.p1.extra.examenes._2021c1._recu.municipalidad_solicitudes.src;

public class Main {

	public static void main(String[] args) {

		Contacto c1 = new Contacto("001", false, new Poda(20.0, new Fecha(1, Mes.JULIO, 2021)));
		Contacto c2 = new Contacto("003", false, new ReparacionVereda(25.0, new Fecha(18, Mes.MARZO, 2021)));
		Contacto c3 = new Contacto("002", false, new Poda(35.0, new Fecha(5, Mes.ENERO, 2021)));

		/*----------------------------------------------------------------------------*/

		Municipalidad municipalidad = new Municipalidad();
		municipalidad.agregarContacto(c1);
		municipalidad.agregarContacto(c2);
		municipalidad.agregarContacto(c3);

		/*----------------------------------------------------------------------------*/

		/**
		 * El metodo informeCostoAcumPorMesTipo() que debe devolver (no mostrar por
		 * consola) el costo acumulado de todas las solicitudes agrupadas por mes de
		 * solicitud y tipo.
		 */

	//	municipalidad.mostrarInformeCostoAcumPorMesTipo();

		/*----------------------------------------------------------------------------*/

		/**
		 * El metodo cantidadPodaNoVencida() que debe devolver (no mostrar por consola)
		 * la cantidad de solicitudes que tuvieron contactos del tipo poda que aun no
		 * vencieron.
		 */

	//	municipalidad.mostrarCantidadPodaNoVencida();

		/*----------------------------------------------------------------------------*/

		/**
		 * El metodo contactosPorDocumento() que debe devolver (no mostrar por consola)
		 * un listado de contactos ordenados por el documento de quien se contacto.
		 */

		municipalidad.mostrarContactosPorDocumento();
	}

}
