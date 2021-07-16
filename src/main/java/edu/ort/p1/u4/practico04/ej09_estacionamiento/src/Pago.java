package edu.ort.p1.u4.practico04.ej09_estacionamiento.src;

public class Pago {
	
	private double monto;
	private String dni;
	public Pago(double monto, String dni) {
		super();
		this.monto = monto;
		this.dni = dni;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	

}
