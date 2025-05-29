package ar.edu.ort.p1.unidades.unidad05.practico05.ej03_impresora.src;

public class Documento {

	private String fecha;
	private int cantCarillas;
	private boolean dobleFaz;

	/*----------------------------------------------------------------------------*/

	public Documento(String fecha, int cantCarillas, boolean dobleFaz) {
		this.fecha = fecha;
		this.cantCarillas = cantCarillas;
		this.dobleFaz = dobleFaz;
	}

	/*----------------------------------------------------------------------------*/

	public String getFecha() {
		return fecha;
	}

	public int getCantCarillas() {
		return cantCarillas;
	}

	public boolean isDobleFaz() {
		return dobleFaz;
	}

	@Override
	public String toString() {
		return "Documento [fecha=" + fecha + ", cantCarillas=" + cantCarillas + ", dobleFaz=" + dobleFaz + "]";
	}

}
