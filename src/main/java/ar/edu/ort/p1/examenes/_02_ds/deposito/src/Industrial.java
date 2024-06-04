package ar.edu.ort.p1.examenes._02_ds.deposito.src;

import ar.edu.ort.tp1.u5.tda.impl.ColaNodos;
import ar.edu.ort.tp1.u5.tda.interfaces.Cola;

public class Industrial extends Rack {

	private final static int CANT_MAX_X_PAIS = 8;
	private Cola<Producto> productos;

	/*----------------------------------------------------------------------------*/

	public Industrial(int pesoMaximoSoportado) {
		super(pesoMaximoSoportado);
		this.productos = new ColaNodos<>();
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean ingresarProducto(Producto producto) {
		boolean sePuedeAgregar = esProductoValido(producto);
		if (sePuedeAgregar) {
			this.productos.add(producto);
		}
		return sePuedeAgregar;
	}

	/**
	 * 
	 * @param producto
	 * @return
	 */
	public boolean esProductoValido(Producto producto) {

		Producto productoCentinela = new Producto(null, null, -1);
		Producto productoAux = null;
		int acuPeso = 0;
		int cantXPais = 0;

		this.productos.add(productoCentinela);
		productoAux = this.productos.remove();

		while (productoCentinela != productoAux) {
			acuPeso = acuPeso + productoAux.getPeso();

			if (productoAux.getPaisDeFabricacion() == producto.getPaisDeFabricacion()) {
				cantXPais++;
			}

			this.productos.add(productoAux);
			productoAux = this.productos.remove();
		}

		return acuPeso + producto.getPeso() <= this.getPesoMaximoSoportado() && cantXPais + 1 <= CANT_MAX_X_PAIS;
	}
}
