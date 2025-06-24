package ar.edu.ort.p1.examenes._02_ds.deposito.src;

public abstract class Rack {

	private int pesoMaximoSoportado;

	/*----------------------------------------------------------------------------*/

	public Rack(int pesoMaximoSoportado) {
		this.pesoMaximoSoportado = pesoMaximoSoportado;
	}

	/*----------------------------------------------------------------------------*/

	public int getPesoMaximoSoportado() {
		return pesoMaximoSoportado;
	}

	public abstract boolean ingresarProducto(Producto producto);

	public abstract boolean esProductoValido(Producto producto);
}
