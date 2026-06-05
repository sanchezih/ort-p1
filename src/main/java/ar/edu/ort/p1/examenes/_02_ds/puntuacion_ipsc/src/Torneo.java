package ar.edu.ort.p1.examenes._02_ds.puntuacion_ipsc.src;

import java.util.ArrayList;
import java.util.List;

public class Torneo implements Puntuable {

	private List<Competidor> inscriptos;
	private ColaDeEtapas etapas;

	public Torneo() {
		this.inscriptos = new ArrayList<>();
		inicializar();
		this.etapas = new ColaDeEtapas();
	}

	public CompetidoresPorPuntuacion obtenerResultados() {
		CompetidoresPorPuntuacion lista = new CompetidoresPorPuntuacion();
		int totalPuntos;

		for (Competidor tirador : this.inscriptos) {

			System.out.println("Voy a calcular el puntaje de " + tirador.getApellido() + " (id "
					+ tirador.getNroInscripcion() + ")");

			totalPuntos = calcularPuntaje(tirador.getNroInscripcion());
			tirador.setPuntosObtenidos(totalPuntos);
			lista.add(tirador);
		}

		return lista;
	}

	@Override
	public int calcularPuntaje(int idTirador) {

		Etapa centinela = new Etapa(null);
		Etapa etapa;
		int totalPuntos = 0;

		this.etapas.add(centinela);
		etapa = etapas.remove();

		while (etapa != centinela) {
			totalPuntos = totalPuntos + etapa.calcularPuntaje(idTirador);
			etapas.add(etapa);
			etapa = etapas.remove();
		}
		return totalPuntos;
	}

	private void inicializar() {
		this.inscriptos.add(new Competidor(1, "SIC", "Juliana", "Perez"));
		this.inscriptos.add(new Competidor(2, "SIC", "Martin", "Gomez"));
		// this.inscriptos.add(new Competidor(3, "SIC", "Joaquin", "Fernandez"));
	}

	public void addEtapa(Etapa etapa) {
		this.etapas.add(etapa);
	}
}
