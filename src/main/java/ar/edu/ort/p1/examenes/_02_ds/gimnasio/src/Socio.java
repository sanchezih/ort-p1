package ar.edu.ort.p1.examenes._02_ds.gimnasio.src;

public class Socio {

	private int edad;
	private float peso;
	private boolean tieneCuotasPendientesDePago;

	/*----------------------------------------------------------------------------*/

	public Socio(int edad, float peso, boolean tieneCuotasPendientesDePago) {
		this.edad = edad;
		this.peso = peso;
		this.tieneCuotasPendientesDePago = tieneCuotasPendientesDePago;
	}

	/*----------------------------------------------------------------------------*/

	public int getEdad() {
		return edad;
	}

	public float getPeso() {
		return peso;
	}

	public boolean tieneCuotasPendientes() {
		return tieneCuotasPendientesDePago;
	}

}
