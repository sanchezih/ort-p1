package ar.edu.ort.p1.unidades.unidad01.ejemplos._03_static._02_contador_de_tickets.src;

public class Ticket {

	private static int contador = 0;
	private int numero;
	private String fechaDeCompra;
	private String dniDeComprador;

	/*----------------------------------------------------------------------------*/

	public Ticket(String fechaDeCompra, String dniDeComprador) {
		contador++;
		this.numero = contador;
		this.fechaDeCompra = fechaDeCompra;
		this.dniDeComprador = dniDeComprador;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", fechaDeCompra=" + fechaDeCompra + ", dniDeComprador=" + dniDeComprador
				+ "]";
	}

}
