package ar.edu.ort.p1.examenes._02_ds.deposito.src;

import ar.edu.ort.tp1.u5.tda.impl.PilaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Pila;

public class Compacto extends Rack {

	private final static int CANT_MAX_X_PAIS = 5;
	private boolean tieneRefrigerancion; // En este ejercicio, esta var no tiene uso
	private Pila<Producto> productos;

	/*----------------------------------------------------------------------------*/

	public Compacto(int pesoMaximoSoportado, boolean tieneRefrigerancion) {
		super(pesoMaximoSoportado);
		this.tieneRefrigerancion = tieneRefrigerancion;
		this.productos = new PilaNodos<>();
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean ingresarProducto(Producto producto) {
		boolean sePuedeAgregar = esProductoValido(producto);
		if (sePuedeAgregar) {
			this.productos.push(producto);
		}
		return sePuedeAgregar;
	}

	/**
	 * 
	 * @param producto
	 * @return
	 */
	@Override
	public boolean esProductoValido(Producto producto) {

		Pila<Producto> pilaAux = new PilaNodos<>();
		Producto productoAux = null;
		int acuPeso = 0;
		int cantXPais = 0;

		while (!this.productos.isEmpty()) {
			productoAux = this.productos.pop();
			acuPeso = acuPeso + productoAux.getPeso();

			if (productoAux.getPaisDeFabricacion() == producto.getPaisDeFabricacion()) {
				cantXPais++;
			}
			pilaAux.push(productoAux);
		}

		while (!pilaAux.isEmpty()) {
			this.productos.push(pilaAux.pop());
		}

		return acuPeso + producto.getPeso() <= this.getPesoMaximoSoportado() && cantXPais + 1 <= CANT_MAX_X_PAIS;
	}

}
