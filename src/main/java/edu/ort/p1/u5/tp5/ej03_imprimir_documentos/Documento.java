package edu.ort.p1.u5.tp5.ej03_imprimir_documentos;

public class Documento {
	private String fecha;
	private int cantCarillas;

	public Documento(String fecha, int cantCarillas) {
		super();
		this.fecha = fecha;
		this.cantCarillas = cantCarillas;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getCantCarillas() {
		return cantCarillas;
	}

	public void setCantCarillas(int cantCarillas) {
		this.cantCarillas = cantCarillas;
	}

	@Override
	public String toString() {
		return "Documento [fecha=" + fecha + ", cantCarillas=" + cantCarillas + "]";
	}

}
