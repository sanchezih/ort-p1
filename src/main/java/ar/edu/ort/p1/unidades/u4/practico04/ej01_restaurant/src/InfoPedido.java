package ar.edu.ort.p1.unidades.u4.practico04.ej01_restaurant.src;

public class InfoPedido {

	private double monto;
	private String apellidoCajero;
	private int bateriaRobot;

	public InfoPedido(double monto, String apellidoCajero, int bateriaRobot) {
		super();
		this.monto = monto;
		this.apellidoCajero = apellidoCajero;
		this.bateriaRobot = bateriaRobot;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getApellidoCajero() {
		return apellidoCajero;
	}

	public void setApellidoCajero(String apellidoCajero) {
		this.apellidoCajero = apellidoCajero;
	}

	public int getBateriaRobot() {
		return bateriaRobot;
	}

	public void setBateriaRobot(int bateriaRobot) {
		this.bateriaRobot = bateriaRobot;
	}

	@Override
	public String toString() {
		return "InfoPedido [monto=" + monto + ", apellidoCajero=" + apellidoCajero + ", bateriaRobot=" + bateriaRobot
				+ "]";
	}

}
