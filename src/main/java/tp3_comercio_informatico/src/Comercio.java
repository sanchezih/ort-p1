package tp3_comercio_informatico.src;

public class Comercio {

	Historial historial = new Historial();

	public Comercio(Historial historial) {
		super();
		this.historial = historial;
	}

	public Historial getHistorial() {
		return historial;
	}

	public void setHistorial(Historial historial) {
		this.historial = historial;
	}

}
