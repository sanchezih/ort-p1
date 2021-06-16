package edu.ort.p1.u5.practico05.ej08_centro_vacunacion.src;

public class Educador extends Persona {
	private NivelEducacion nivelDelProfe;

	public Educador(String dni, String nombre, int edad, boolean pacRiesgo, NivelEducacion nivelDelProfe) {
		super(dni, nombre, edad, pacRiesgo);
		this.nivelDelProfe = nivelDelProfe;
	}

	public int getprioridad() {
		int resu = 1;
		if ((super.getprioridad() == 0) || this.nivelDelProfe == NivelEducacion.INICIAL) {
			resu = 0;
		}
		return resu;
	}

	@Override
	public String toString() {
		return super.toString() + "Educador [nivelDelProfe=" + nivelDelProfe + "]";
	}

}
