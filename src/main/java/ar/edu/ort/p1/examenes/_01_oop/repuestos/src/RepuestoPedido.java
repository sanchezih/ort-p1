package ar.edu.ort.p1.examenes._01_oop.repuestos.src;

public class RepuestoPedido {

	private int can;
	private Repuesto repuesto;

	/*----------------------------------------------------------------------------*/

	public RepuestoPedido(int can, Repuesto repuesto) {
		this.can = can;
		this.repuesto = repuesto;
	}

	/*----------------------------------------------------------------------------*/

	public boolean verificarStock() {
		return this.can < this.repuesto.getCanStock(); // cambiado por ihs
	}

}
