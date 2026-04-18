package ar.edu.ort.p1.examenes._01_oop.repuestos.src;

public class Zona implements Bloqueable {
	private String desc;
	private float porRec;
	private int canRutasCortadas;

	/*----------------------------------------------------------------------------*/

	public Zona(String desc, float porRec, int canRutasCortadas) {
		this.desc = desc;
		this.porRec = porRec;
		this.canRutasCortadas = canRutasCortadas;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean estaBloqueado() {
		return this.canRutasCortadas>3;
	}
}
