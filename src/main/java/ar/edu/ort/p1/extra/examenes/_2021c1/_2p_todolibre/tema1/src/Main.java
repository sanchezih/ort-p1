package ar.edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema1.src;

public class Main {

	public static void main(String[] args) {

		Usuario vendedor1 = new Usuario(1, "Luis", "12345678", new Domicilio("Balbin", "1234", "1", 3));

		/*----------------------------------------------------------------------------*/

		Usuario comprador1 = new Usuario(2, "Maria", "12345678", new Domicilio("Correa", "1234", "1", 7));
		Usuario comprador2 = new Usuario(3, "Lucia", "12345678", new Domicilio("Miller", "1234", "1", 5));

		/*----------------------------------------------------------------------------*/

		OrdenPuertaAPuerta orden1 = new OrdenPuertaAPuerta(1001, "2021-06-10", 150, vendedor1, comprador1, true);
		OrdenPuertaAPuerta orden2 = new OrdenPuertaAPuerta(1002, "2021-06-10", 260, vendedor1, comprador1, false);

		OrdenPuertaAPuerta orden3 = new OrdenPuertaAPuerta(1003, "2021-06-10", 740, vendedor1, comprador2, true);

		/*----------------------------------------------------------------------------*/

		TodoLibre todoLibre = new TodoLibre();

		todoLibre.agregarOrden(orden1);
		todoLibre.agregarOrden(orden2);
		todoLibre.agregarOrden(orden3);

		todoLibre.mostrarColaDeOrdenes();

		/*----------------------------------------------------------------------------*/

		/**
		 * Ejercicio B: El metodo cantEnviosEntreComunas que debe devolver (no mostrar
		 * por consola) la cantidad de envios a realizar desde cada una de las 15
		 * comunas hacia las demas, incluyendo la misma (los envios dentro de la misma
		 * comuna son muy frecuentes).
		 */

		todoLibre.dibujarMatrizDeEnvios();

		/**
		 * Ejercicio C: El metodo ordenesPuertaPuertaGratisPorMonto() que debe devolver
		 * (no mostrar por consola) todas las ordenes Puerta a Puerta con envio gratis
		 * ordenadas por monto de forma descendente.
		 */

		todoLibre.mostrarOrdenesRetiroSucursalSabadosPorMonto();

	}

}
