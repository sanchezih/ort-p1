package ar.edu.ort.p1.u4.practico04.ej01_restaurant.src;

public class Pedido {
	private String nombreCliente;
	private int idCajero;
	private String codRobot;
	private double monto;

	public Pedido(String nombreCliente, int idCajero, String codRobot, double monto) {
		super();
		this.nombreCliente = nombreCliente;
		this.idCajero = idCajero;
		this.codRobot = codRobot;
		this.monto = monto;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	public String getCodRobot() {
		return codRobot;
	}

	public void setCodRobot(String codRobot) {
		this.codRobot = codRobot;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Pedido [nombreCliente=" + nombreCliente + ", idCajero=" + idCajero + ", codRobot=" + codRobot
				+ ", monto=" + monto + "]";
	}

}
