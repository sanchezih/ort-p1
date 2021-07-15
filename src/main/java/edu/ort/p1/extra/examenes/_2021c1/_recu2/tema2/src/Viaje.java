package edu.ort.p1.extra.examenes._2021c1._recu2.tema2.src;

public class Viaje {

	private Camion suCaminon;
	private Chofer suChofer;
	private PilaDeDestinos pilaDestinos;
	
	

	public Viaje(Camion suCaminon, Chofer suChofer, PilaDeDestinos pilaDestinos) {
		super();
		this.suCaminon = suCaminon;
		this.suChofer = suChofer;
		this.pilaDestinos = pilaDestinos;
	}
	
	

	public Camion getSuCaminon() {
		return suCaminon;
	}



	public void setSuCaminon(Camion suCaminon) {
		this.suCaminon = suCaminon;
	}



	public Chofer getSuChofer() {
		return suChofer;
	}



	public void setSuChofer(Chofer suChofer) {
		this.suChofer = suChofer;
	}



	public PilaDeDestinos getPilaDestinos() {
		return pilaDestinos;
	}



	public void setPilaDestinos(PilaDeDestinos pilaDestinos) {
		this.pilaDestinos = pilaDestinos;
	}



	public boolean contieneDestino(String nombreDestino) {
		Destino d;
		boolean destinoEncontrado = false;
		PilaDeDestinos pilaAux = new PilaDeDestinos();

		while (!this.pilaDestinos.isEmpty() && !destinoEncontrado) {
			d = this.pilaDestinos.pop();
			destinoEncontrado = d.getNombre() == nombreDestino;
			pilaAux.push(d);
		}
		pasarElementos(pilaAux, this.pilaDestinos);
		return destinoEncontrado;
	}

	private void pasarElementos(PilaDeDestinos source, PilaDeDestinos target) {
		while (!source.isEmpty()) {
			target.push(source.pop());
		}
	}

}
