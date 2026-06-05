package ar.edu.ort.p1.examenes._02_ds.festival_cine_independiente.src;

public class Registracion {
	private int dniDelInteresado;
	private String nombreDelInteresado;
	private String nombreDeLaPelicula;

	/*----------------------------------------------------------------------------*/

	public Registracion(int dniDelInteresado, String nombreDelInteresado, String nombreDeLaPelicula) {
		this.dniDelInteresado = dniDelInteresado;
		this.nombreDelInteresado = nombreDelInteresado;
		this.nombreDeLaPelicula = nombreDeLaPelicula;
	}

	/*----------------------------------------------------------------------------*/

	public int getDniDelInteresado() {
		return dniDelInteresado;
	}

	public String getNombreDelInteresado() {
		return nombreDelInteresado;
	}

	public String getNombreDeLaPelicula() {
		return nombreDeLaPelicula;
	}

	public Acreditacion generarAcreditacion() {
		return new Acreditacion(this.getDniDelInteresado(), this.getNombreDelInteresado());
	}

	@Override
	public String toString() {
		return "Registracion [dniDelInteresado=" + dniDelInteresado + ", nombreDelInteresado=" + nombreDelInteresado
				+ ", nombreDeLaPelicula=" + nombreDeLaPelicula + "]";
	}

}
