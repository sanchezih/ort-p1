package edu.ort.p1.extra.examenes._2021c1._recu2.tema2.src;

public class EmpresaLogistica {

	public final static int CANT_CAMIONES = 80;
	public final static int CANT_CHOFERES = 20;

	private Camion[] camiones = new Camion[CANT_CAMIONES];
	private Chofer[] choferes = new Chofer[CANT_CHOFERES];
	private ColaDeViajes viajesContratados;

	public EmpresaLogistica() {
		super();
		this.viajesContratados = new ColaDeViajes();
	}

	public int cantViajesSinDestino(String nombreDestino) {
		Viaje viajeAux;
		Viaje centinela = new Viaje(null, null, null);
		int cant = 0;

		viajesContratados.add(centinela);
		viajeAux = viajesContratados.remove();

		while (viajeAux != centinela) {
			if (!viajeAux.contieneDestino(nombreDestino)) {
				cant++;
			}
			viajesContratados.add(viajeAux);
			viajeAux = viajesContratados.remove();
		}
		return cant;
	}
}
