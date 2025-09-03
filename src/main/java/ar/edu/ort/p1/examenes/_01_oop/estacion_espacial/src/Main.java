package ar.edu.ort.p1.examenes._01_oop.estacion_espacial.src;

public class Main {

	public static void main(String[] args) {

		EstacionEspacial estacionEspacial = new EstacionEspacial();

		System.out.println("Intento estacionar nave: " + estacionEspacial
				.estacionarNave(new NaveCargo("Solaris", "Vulcano", 4, "StarClass", new Carga("Litio", 20))));

		System.out.println("Intento estacionar nave: "
				+ estacionEspacial.estacionarNave(new NaveCruiser("Solaris", "Vulcano", 6, "StarClass", 44)));

		/*----------------------------------------------------------------------------*/

		System.out.println();
		System.out.println("----- IMPRIMIR MANIFIESTOS -----");
		System.out.println();
		estacionEspacial.imprimirManifiestos();
	}

}
