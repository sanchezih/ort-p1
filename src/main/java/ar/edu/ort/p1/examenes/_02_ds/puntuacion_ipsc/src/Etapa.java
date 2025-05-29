package ar.edu.ort.p1.examenes._02_ds.puntuacion_ipsc.src;

import java.util.ArrayList;
import java.util.List;

public class Etapa implements Puntuable {

	private int[][] disparosPorCompetidor;
	private List<Blanco> blancos;

	public Etapa(int[][] disparosPorCompetidor) {
		this.disparosPorCompetidor = disparosPorCompetidor;
		this.blancos = new ArrayList<>();
	}

	@Override
	public int calcularPuntaje(int idTirador) {

		Blanco blanco;
		int cantDisparos;
		int nroBlanco = 0;
		int puntos = 0;

		System.out.println("Esta etapa tiene " + this.blancos.size() + " blancos");

		for (int i = 0; i < this.blancos.size(); i++) {
			cantDisparos = disparosPorCompetidor[idTirador - 1][i];
			System.out.println("El competidor " + idTirador + " impactó " + cantDisparos + " veces");
			puntos = puntos + blancos.get(i).calcularPuntaje(cantDisparos);
			System.out.println("\t Obtuvo " + puntos + " puntos");
		}
		return puntos;
	}

	public void addBlanco(Blanco blanco) {
		this.blancos.add(blanco);
	}

}
