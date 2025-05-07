package ar.edu.ort.p1.unidades.unidad04.practico04.ej01_restaurant.src;

public class Pedido {

	private String nombreCliente;
	private int idCajero;
	private String codRobot;
	private double monto;

	/*----------------------------------------------------------------------------*/

	public Pedido(String nombreCliente, int idCajero, String codRobot, double monto) {
		this.nombreCliente = nombreCliente;
		this.idCajero = idCajero;
		this.codRobot = codRobot;
		this.monto = monto;
	}

	/*----------------------------------------------------------------------------*/

	public int getIdCajero() {
		return idCajero;
	}

	public String getCodRobot() {
		return codRobot;
	}

	public double getMonto() {
		return monto;
	}

	@Override
	public String toString() {
		return "Pedido [nombreCliente=" + nombreCliente + ", idCajero=" + idCajero + ", codRobot=" + codRobot
				+ ", monto=" + monto + "]";
	}

}
