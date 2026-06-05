package ar.edu.ort.p1.examenes._02_ds.puntuacion_ipsc.src;

public class Main {

	public static void main(String[] args) {

		int[][] disparosPorCompetidorEtapa1 = { { 0, 15 }, { 90, 64 } };

		Etapa etapa1 = new Etapa(disparosPorCompetidorEtapa1);
		etapa1.addBlanco(new BlancoMetal());
		etapa1.addBlanco(new BlancoNonShoot());

		Torneo torneo = new Torneo();
		torneo.addEtapa(etapa1);

		CompetidoresPorPuntuacion res = torneo.obtenerResultados();

		for (Competidor competidor : res) {
			System.out.println(competidor.getApellido());
		}

		System.out.println("FIN");
	}

}
