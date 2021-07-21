package ar.edu.ort.p1.extra.examenes._2021c1._2p_todolibre.tema2.src;

public class Producto implements Priorizable {

	private String codigo;
	private double precio;
	private boolean esencial;

	public Producto(String codigo, double precio, boolean esencial) {
		this.codigo = codigo;
		this.precio = precio;
		this.esencial = esencial;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEsencial() {
		return esencial;
	}

	public void setEsencial(boolean esencial) {
		this.esencial = esencial;
	}

	@Override
	public int getPrioridad() {
		return this.esencial ? 1 : 0;
	}

}
