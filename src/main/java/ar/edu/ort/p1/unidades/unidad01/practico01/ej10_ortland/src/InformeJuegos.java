package ar.edu.ort.p1.unidades.unidad01.practico01.ej10_ortland.src;

public class InformeJuegos {

	private String nombreDelJuego;
	private int cantLugaresDisp;

	/*----------------------------------------------------------------------------*/

	public InformeJuegos(String nombreDelJuego, int cantLugaresDisp) {
		this.nombreDelJuego = nombreDelJuego;
		this.cantLugaresDisp = cantLugaresDisp;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "InformeJuegos [nombreDelJuego=" + nombreDelJuego + ", cantLugaresDisp=" + cantLugaresDisp + "]";
	}

}
