package tp3.tp3_cabinas_peaje.src;

import java.util.ArrayList;

import tp3.tp3_cabinas_peaje.src.mediosdepago.Efectivo;
import tp3.tp3_cabinas_peaje.src.mediosdepago.MedioDePago;
import tp3.tp3_cabinas_peaje.src.mediosdepago.PASE;
import tp3.tp3_cabinas_peaje.src.mediosdepago.SUBE;

public class Main {
	public static ArrayList<Cabina> listaDeCabinas = new ArrayList<Cabina>();
	public static ArrayList<Cabina> cabinasConEfectivo = new ArrayList<Cabina>();

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo(45420350, CategoriaVehiculo.AUTO);
		Vehiculo v2 = new Vehiculo(46331591, CategoriaVehiculo.MOTO);

		Cabina c1 = new Cabina();
		Cabina c2 = new Cabina();
		Cabina c3 = new Cabina();

		MedioDePago mp1 = new Efectivo();
		MedioDePago mp2 = new SUBE(1);
		MedioDePago mp3 = new PASE(120);

		c1.setMp(mp1);
		c2.setMp(mp2);
		c3.setMp(mp3);

		EstacionDePeaje ep1 = new EstacionDePeaje("001", "Panamericana");
		ep1.agregarCabina(c1);
		ep1.agregarCabina(c2);
		ep1.agregarCabina(c3);

		// Ejercicio B
		System.out.println("Debera pagar " + c1.cobrar(v1));
		System.out.println("Debera pagar " + c1.cobrar(v2));

		// Ejercicio C
		System.out.println(
				"\nEn la estacion de peaje hay " + ep1.cabinasConEfectivo().size() + " cabinas que cobran en efectivo");

		// Ejercicio D
		System.out.println(
				"\nEl promedio de dias de demora entre todas las cabinas que acepten medios de pago electrónicos (SUBE o PASE) es "
						+ ep1.promedioDemora());
	}
}