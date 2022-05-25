package ar.edu.ort.p1.examenes.ds.empresa_logistica.src;

public abstract class Camion implements Renovable, Identificable {

	private int nroPatente;
	private int anioFabricacion;
	private int kmRecorridos;

	public Camion(int nroPatente, int anioFabricacion, int kmRecorridos) {
		super();
		this.nroPatente = nroPatente;
		this.anioFabricacion = anioFabricacion;
		this.kmRecorridos = kmRecorridos;
	}

	public int getNroPatente() {
		return nroPatente;
	}

	public void setNroPatente(int nroPatente) {
		this.nroPatente = nroPatente;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	@Override
	public void mostrarID() {
		System.out.println(this.nroPatente);
	}

	@Override
	public String toString() {
		return "Camion [nroPatente=" + nroPatente + ", anioFabricacion=" + anioFabricacion + ", kmRecorridos="
				+ kmRecorridos + "]";
	}

}
