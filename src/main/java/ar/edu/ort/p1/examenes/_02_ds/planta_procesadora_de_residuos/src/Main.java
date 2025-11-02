package ar.edu.ort.p1.examenes._02_ds.planta_procesadora_de_residuos.src;

public class Main {

	public static void main(String[] args) {

		PlantaProcesadora plantaProcesadora = new PlantaProcesadora();

		plantaProcesadora.agregarResiduo(new Organico("20250701", 0.5, false));
		plantaProcesadora.agregarResiduo(new Organico("20250701", 0.5, false));
		plantaProcesadora.agregarResiduo(new Organico("20250701", 0.5, false));
		plantaProcesadora.agregarResiduo(new Toxico("20250103", 1.1, 5, true));

		plantaProcesadora.mostrarTerreno();

		plantaProcesadora.clasificar(TipoDeResiduo.ORGANICO);

		System.out.println("FIN");
	}

}
