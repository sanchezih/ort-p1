package ar.edu.ort.p1.u4.practico04.ej09_estacionamiento.src;

import ar.edu.ort.p1.util.Fecha;

public class Main {

	public static void main(String[] args) {

		Pago auto01pago01 = new Pago(90, "31507904");
		Pago auto01pago02 = new Pago(90, "31507904");
		Pago auto01pago03 = new Pago(90, "31507904");
		Pago auto01pago04 = new Pago(90, "31507904");
		Pago auto01pago05 = new Pago(90, "31507904");
		Pago auto01pago06 = new Pago(90, "31507904");
		Pago auto01pago07 = new Pago(90, "31507904");
		Pago auto01pago08 = new Pago(90, "31507904");
		Pago auto01pago09 = new Pago(90, "31507904");
		Pago auto01pago10 = new Pago(90, "31507904");
		Pago auto01pago11 = new Pago(90, "31507904");
		Pago auto01pago12 = new Pago(90, "31507904");

		Pago[] pagosAuto01 = { auto01pago01, auto01pago02, auto01pago03, auto01pago04, auto01pago05, auto01pago06,
				auto01pago07, auto01pago08, auto01pago09, auto01pago10, auto01pago11, auto01pago12 };

		Auto autos[][] = new Auto[8][6];

		autos[0][0] = new Auto("IHW061", pagosAuto01, new Fecha(10, 1, 2021));
		autos[0][1] = new Auto("AJQ503", pagosAuto01, new Fecha(13, 6, 2021));

		Estacionamiento e1 = new Estacionamiento();

		e1.setAutos(autos);

		/*----------------------------------------------------------------------------*/

		/**
		 * La explotacion del metodo retirar, que permita resolver lo enunciado. Retorna
		 * el auto indicado o null, segun corresponda.
		 */

		System.out.println("Retiro el auto: " + e1.retirar(04));
		System.out.println("Retiro el auto: " + e1.retirar(01));

		/*----------------------------------------------------------------------------*/

		/**
		 * La explotacion del metodo autosMasMorososPorPiso que devuelva (no muestre por
		 * consola) de cada piso, el auto con mayor cantidad de pagos no efectuados
		 * durante este anio (se supone unico por piso).
		 */

		// TODO: Terminar
//		Auto[] autosMasMorososPorPiso = e1.autosMasMorososPorPiso();
//		for (int i = 0; i < autosMasMorososPorPiso.length; i++) {
//			autosMasMorososPorPiso[i].toString();
//		}

	}

}
