package ar.edu.ort.p1.unidades.u1.practico01.ej02_hotel.src;

public class Cliente {

	private String nombre;
	private int cantidadDiasEstadia;

	public Cliente(String nombre, int cantidadDiasEstadia) {
		this.nombre = nombre;
		this.cantidadDiasEstadia = cantidadDiasEstadia;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidadDiasEstadia() {
		return cantidadDiasEstadia;
	}

}
