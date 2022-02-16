package ar.edu.ort.p1.examenes.ortcapital.src;

public class Main {
	public static void main(String[] args) {

		Persona personaSolicitante01 = new Persona("Estefania", "Perez", "29668401");
		Persona personaSolicitante02 = new Persona("Marcos", "Perez", "29668401");
		Persona personaSolicitante03 = new Persona("Diego", "Perez", "29668401");
		Persona personaSolicitante04 = new Persona("Angelica", "Perez", "29668401");

		/*----------------------------------------------------------------------------*/

		Titulo al29 = new Titulo("AL29", "BONAR STEP-UP USD Ley Arg 2029", 100.103, TipoTitulo.BONO);

		/*----------------------------------------------------------------------------*/

		ProcesadorBursatil procesadorBursatil = new ProcesadorBursatil();

		/* Test Ejercicio B */
		procesadorBursatil.ingresar(new SolicitudDeVenta(001, 2, 55, al29, personaSolicitante01));
		procesadorBursatil.ingresar(new SolicitudDeCompra(001, 2, 249, al29, personaSolicitante02));
		procesadorBursatil.ingresar(new SolicitudDeVenta(001, 2, 55, al29, personaSolicitante01));
		procesadorBursatil.ingresar(new SolicitudDeVenta(001, 2, 55, al29, personaSolicitante01));
		procesadorBursatil.ingresar(new SolicitudDeVenta(001, 2, 55, al29, personaSolicitante01));
		procesadorBursatil.ingresar(new SolicitudDeVenta(001, 2, 55, al29, personaSolicitante01));
		procesadorBursatil.ingresar(new SolicitudDeVenta(001, 2, 55, al29, personaSolicitante01));
		procesadorBursatil.ingresar(new SolicitudDeVenta(001, 2, 55, al29, personaSolicitante01));
		procesadorBursatil.ingresar(new SolicitudDeVenta(001, 2, 55, al29, personaSolicitante01));
		procesadorBursatil.ingresar(new SolicitudDeVenta(001, 2, 55, al29, personaSolicitante01));
		procesadorBursatil.ingresar(new SolicitudDeVenta(001, 2, 55, al29, personaSolicitante01));


		/* Test Ejercicio C */
		procesadorBursatil.mostrarCantSolicitudesPorAgenteyTipoDeTitulo();

		/* Test Ejercicio D */
		procesadorBursatil.mostrarListaOrdenadaDeSolicitudesPorPrecioOfertado();

	}
}
