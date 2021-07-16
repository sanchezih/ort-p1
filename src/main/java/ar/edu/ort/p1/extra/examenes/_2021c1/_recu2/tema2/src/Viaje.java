package edu.ort.p1.extra.examenes._2021c1._recu2.tema2.src;

public class Viaje {

	private Camion suCamion;
	private Chofer suChofer;
	private PilaDeDestinos pilaDestinos;

	public Viaje(Camion suCaminon, Chofer suChofer, PilaDeDestinos pilaDestinos) {
		super();
		this.suCamion = suCaminon;
		this.suChofer = suChofer;
		this.pilaDestinos = pilaDestinos;
	}

	public Camion getSuCamion() {
		return suCamion;
	}

	public void setSuCaminon(Camion suCamnon) {
		this.suCamion = suCamion;
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

	public int getLegajoChofer() {
		return this.suChofer.getNroLegajo();
	}

	public int getPatenteDeCamion() {
		// TODO Auto-generated method stub
		return this.suCamion.getNroPatente();
	}

	public int cantDestinos() {
		Destino d;
		int cant = 0;
		PilaDeDestinos pilaAux = new PilaDeDestinos();
		while (!this.pilaDestinos.isEmpty()) {
			pilaAux.push(this.pilaDestinos.pop());
			cant++;
		}
		pasarElementos(pilaAux, this.pilaDestinos);
		return cant;
	}



}
