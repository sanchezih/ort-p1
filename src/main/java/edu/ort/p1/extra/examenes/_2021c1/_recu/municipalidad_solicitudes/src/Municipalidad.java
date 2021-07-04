package edu.ort.p1.extra.examenes._2021c1._recu.municipalidad_solicitudes.src;

public class Municipalidad {

	private final static int CANT_TIPO_SOLICITUD = 2;
	private PilaDeContactos contactos;

	public Municipalidad() {
		this.contactos = new PilaDeContactos();
	}

	public double[][] informeCostoAcumPorMesTipo() {

		double[][] informe;
		PilaDeContactos pilaAux = null;
		Contacto contacto;

		informe = new double[Mes.values().length][CANT_TIPO_SOLICITUD]; // IHS: es new int
		pilaAux = new PilaDeContactos();

		// REVISAR reclamo=reclamosAtendidos.remove();

		while (!contactos.isEmpty()) {
			contacto = contactos.pop();
			procesarContacto(contacto, informe);
			pilaAux.push(contacto);
		}

		while (!pilaAux.isEmpty()) {
			contactos.push(pilaAux.pop());
		}

		return informe;
	}

	private void procesarContacto(Contacto contacto, double[][] informe) {
		int columna;
		int fila;

		columna = calcularColumna(contacto.getSolicitud());
		fila = contacto.getSolicitud().mes().ordinal();
		informe[fila][columna] = informe[fila][columna] + contacto.getSolicitud().costo();
	}

	private int calcularColumna(Solicitud solicitud) {
		return solicitud instanceof ReparacionVereda ? 0 : 1;
	}

	public int cantidadPodaNoVencida() {

		PilaDeContactos pilaAux = null;
		Contacto contacto;
		int cant = 0;

		pilaAux = new PilaDeContactos();
		// reclamo=reclamosAtendidos.remove()

		while (!contactos.isEmpty()) {
			contacto = contactos.pop();
			cant += procesarContacto(contacto);
			pilaAux.push(contacto);
		}

		while (!pilaAux.isEmpty()) {
			contactos.push(pilaAux.pop());
		}
		return cant;
	}

	private int procesarContacto(Contacto contacto) {
		Solicitud solicitud;
		solicitud = contacto.getSolicitud();
		return solicitud instanceof Poda && !solicitud.vencido() ? 1 : 0;
	}

	public ListaContactosPorDocumento contactosPorDocumento() {
		PilaDeContactos pilaAux = null;
		Contacto contacto;
		ListaContactosPorDocumento lista = new ListaContactosPorDocumento();

		pilaAux = new PilaDeContactos();

		while (!contactos.isEmpty()) {
			contacto = contactos.pop();
			lista.add(contacto);
			pilaAux.push(contacto);
		}

		while (!pilaAux.isEmpty()) {
			contactos.push(pilaAux.pop());
		}
		return lista;
	}

	/*----------------------------------------------------------------------------*/

	/* Metodos extra */

	public void agregarContacto(Contacto c) {
		this.contactos.push(c);
	}

	public void mostrarInformeCostoAcumPorMesTipo() {

		double[][] matLetras = informeCostoAcumPorMesTipo();
		System.out.println("Ejercicio B --> Muestro el costo acumulado de todas las solicitudes");
		System.out.println("\tREPA\tPODA");
		for (int i = 0; i < matLetras.length; i++) {
			System.out.print(((Mes.values()[i]).toString().substring(0, 3)) + "\t");
			for (int j = 0; j < matLetras[i].length; j++) {
				System.out.print(matLetras[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void mostrarCantidadPodaNoVencida() {
		System.out.println("\nEjercicio D --> Muestro las solicitudes de poda que aun no vencieron");
		System.out.println("La cantidad de solicitudes de poda que aun no vencieron es: " + cantidadPodaNoVencida());
	}

	public void mostrarContactosPorDocumento() {
		System.out.println("\nEjercicio E --> Muestro la lista de contactos por documento");
		for (Contacto c : contactosPorDocumento()) {
			System.out.println(c.toString());
		}
	}
}
