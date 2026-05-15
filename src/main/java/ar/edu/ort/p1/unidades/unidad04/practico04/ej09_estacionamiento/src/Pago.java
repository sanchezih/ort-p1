package ar.edu.ort.p1.unidades.unidad04.practico04.ej09_estacionamiento.src;

public class Pago {

	private double monto;
	private String dni;

	/*----------------------------------------------------------------------------*/

	public Pago(double monto, String dni) {
		this.monto = monto;
		this.dni = dni;
	}

	/*----------------------------------------------------------------------------*/

	public double getMonto() {
		return monto;
	}

}
