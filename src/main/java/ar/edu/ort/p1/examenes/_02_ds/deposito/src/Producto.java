package ar.edu.ort.p1.examenes._02_ds.deposito.src;

public class Producto {

	private String nombre;
	private String paisDeFabricacion;
	private int peso;

	/*----------------------------------------------------------------------------*/

	public Producto(String nombre, String paisDeFabricacion, int peso) {
		this.nombre = nombre;
		this.paisDeFabricacion = paisDeFabricacion;
		this.peso = peso;
	}

	/*----------------------------------------------------------------------------*/

	public String getNombre() {
		return nombre;
	}

	public String getPaisDeFabricacion() {
		return paisDeFabricacion;
	}

	public int getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", paisDeFabricacion=" + paisDeFabricacion + ", peso=" + peso + "]";
	}

}
