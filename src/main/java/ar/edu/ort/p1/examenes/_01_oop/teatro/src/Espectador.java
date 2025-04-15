package ar.edu.ort.p1.examenes._01_oop.teatro.src;

public class Espectador {

	private String dni;
	private String nombreObra;
	private boolean acompanante;

	/*----------------------------------------------------------------------------*/

	public Espectador(String dni, String nombreObra, boolean acompanante) {
		this.dni = dni;
		this.nombreObra = nombreObra;
		this.acompanante = acompanante;
	}

	/*----------------------------------------------------------------------------*/

	public String getDni() {
		return dni;
	}

	public String getNombreObra() {
		return nombreObra;
	}

	public int getCantLocalidadesRequeridas() {
		return this.acompanante ? 2 : 1;
	}

	public boolean tieneTiempoDisponible(int duracionObra) {
		return true;
	}

}
