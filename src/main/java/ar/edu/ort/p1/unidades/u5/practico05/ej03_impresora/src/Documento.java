package ar.edu.ort.p1.unidades.u5.practico05.ej03_impresora.src;

public class Documento {

	private String fecha;
	private int cantCarillas;
	private boolean dobleFaz;

	public Documento(String fecha, int cantCarillas, boolean dobleFaz) {
		super();
		this.fecha = fecha;
		this.cantCarillas = cantCarillas;
		this.dobleFaz = dobleFaz;
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

	public boolean isDobleFaz() {
		return dobleFaz;
	}

	public void setDobleFaz(boolean dobleFaz) {
		this.dobleFaz = dobleFaz;
	}

	@Override
	public String toString() {
		return "Documento [fecha=" + fecha + ", cantCarillas=" + cantCarillas + ", dobleFaz=" + dobleFaz + "]";
	}

}
