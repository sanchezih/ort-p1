package ar.edu.ort.p1.unidades.unidad04.practico04.ej01_restaurant.src;

public class InfoPedido {

	private double monto;
	private String apellidoCajero;
	private int bateriaRobot;

	/*----------------------------------------------------------------------------*/

	public InfoPedido(double monto, String apellidoCajero, int bateriaRobot) {
		this.monto = monto;
		this.apellidoCajero = apellidoCajero;
		this.bateriaRobot = bateriaRobot;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "InfoPedido [monto=" + monto + ", apellidoCajero=" + apellidoCajero + ", bateriaRobot=" + bateriaRobot
				+ "]";
	}

}
