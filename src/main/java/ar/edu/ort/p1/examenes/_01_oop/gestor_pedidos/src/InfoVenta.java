package ar.edu.ort.p1.examenes._01_oop.gestor_pedidos.src;

public class InfoVenta {

	private float precio;
	private int peso;

	/*----------------------------------------------------------------------------*/

	public InfoVenta(float precio, int peso) {
		this.precio = precio;
		this.peso = peso;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "InfoVenta [precio=" + precio + ", peso=" + peso + "]";
	}

}
