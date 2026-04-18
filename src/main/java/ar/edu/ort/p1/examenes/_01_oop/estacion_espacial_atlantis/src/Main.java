package ar.edu.ort.p1.examenes._01_oop.estacion_espacial_atlantis.src;

public class Main {

	public static void main(String[] args) {

		EstacionEspacial estacionEspacial = new EstacionEspacial();

		estacionEspacial.estacionarNave(new NaveCargo("Solaris", "Vulcano", 4, "StarClass", new Carga("Litio", 20)));
		estacionEspacial.estacionarNave(new NaveCruiser("Solaris", "Vulcano", 6, "StarClass", 44));

		/*----------------------------------------------------------------------------*/

		System.out.println();
		System.out.println("----- IMPRIMIR MANIFIESTOS -----");
		System.out.println();
		estacionEspacial.imprimirManifiestos();
	}

}
