package tp3.tp3_puerto_barcos.src;

import java.util.ArrayList;

public class Main {

	public static ArrayList<Amarra> listaDeAmarras = new ArrayList<Amarra>();

	public static void main(String[] args) {

		// creo los barcos
	//	Barco yate1 = new Yate("ARG-5999", 17, 1980, "Julia Perez", 5);
	//	Barco velero1 = new Velero("ARG-5830", 12, 1997, "Alejandro Ruiz", 3);
		Barco deportivoComun1 = new DeportivoComun("ARG-5999", 17, 1980, "Julia Perez", 1500, 8);

		// creo las amarras
		Amarra a1 = new Amarra(1, "norte", true);
		Amarra a2 = new Amarra(2, "norte", true);

		// asigno los barcos a las amarras
		a1.setBarco(deportivoComun1);
	//	a2.setBarco(velero1);

		listaDeAmarras.add(a1);
		listaDeAmarras.add(a2);

		Puerto puertoParana = new Puerto(listaDeAmarras);

		// Ejercicio B
		double alquilerMinimo = 120;
		System.out.println("La cantidad de barcos con un alquiler mayor a " + alquilerMinimo + " es: "
				+ puertoParana.barcosConAlquilerMayorA(alquilerMinimo));

		// Ejercicio C
		System.out.println(
				"El barco deportivo con mayor consumo de todo el puerto es: " + puertoParana.barcoConMayorConsumo());
	}

}
