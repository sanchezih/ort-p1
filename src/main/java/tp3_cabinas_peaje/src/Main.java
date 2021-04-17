package tp3_cabinas_peaje.src;

import java.util.ArrayList;

public class Main {
	public static ArrayList<Cabina> listaDeCabinas = new ArrayList<Cabina>();

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo(45420350, CategoriaVehiculo.AUTO);
		Cabina c1 = new Cabina();
		EstacionDePeaje ep1 = new EstacionDePeaje();
		MedioDePago mp = new PASE();

		c1.setMp(mp);
		listaDeCabinas.add(c1);
		ep1.setListaDeCabinas(listaDeCabinas);
		double aPagar = c1.cobrar(v1);
		System.out.println("Debera pagar " + aPagar);

	}
}