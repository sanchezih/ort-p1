package ar.edu.ort.p1.u1.practico01.ej05_hotel.src;

import java.util.ArrayList;

public class Habitacion {

	private int numero;
	private double precio;
	private Cliente cliente;
	private ArrayList<Adicional> adicionales;
	
	

	public int getNumero() {
		return numero;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Ejercicio B: El constructor parametrizado de la clase Habitacion, que
	 * recibiria como parametros el numero y el precio por dia.
	 * 
	 * @param numero
	 * @param precioXDia
	 */
	public Habitacion(int numero, double precioXDia) {
		this.numero = numero;
		this.precio = precioXDia;
		this.adicionales = new ArrayList<Adicional>(); // Que pasa si no se inicializa?
	}

	/**
	 * Ejercicio C: La explotacion del metodo calcularTotal de la clase Habitacion,
	 * que devuelve el total en base al valor de la habitacion por los dias que se
	 * hospede el cliente y los adicionales pedidos
	 * 
	 * @return
	 */
	public double calcularTotal() {

		double precioTotal = 0;
		double precioAdicional = 0;

		if (estaOcupada()) {
			precioTotal = this.precio * cliente.getCantidadDiasEstadia();
			precioAdicional = calcularAdicionales();
		}
		return precioTotal + precioAdicional;
	}

	public boolean estaOcupada() {
		return this.cliente != null;
	}

	private double calcularAdicionales() {
		double total = 0;

		for (Adicional a : this.adicionales) {
			/* total = total + a.getPrecio() */
			total += a.getPrecio(); // Acumulador
		}
		return total;
	}

	public void liberar() {
		setCliente(null);
	}

}
