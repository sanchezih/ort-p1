package ar.edu.ort.p1.examenes.oop.estacion_espacial.src;

public class Carga implements Manifestable {

	private String descripcion;
	private double volumen;

	public Carga(String descripcion, double volumen) {
		super();
		this.descripcion = descripcion;
		this.volumen = volumen;
	}

	@Override
	public void imprimirManifiesto() {
		System.out.println(this.descripcion + "(" + this.volumen + " m3)");
	}

	public boolean volumenSuperiorA(double valor) {
		return this.volumen > valor;
	}

}
