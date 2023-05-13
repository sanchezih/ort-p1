package ar.edu.ort.p1.unidades.u4.ejemplos.ds.linear._01_array._03_posicionamiento_indirecto.src;

public class Empresa {

	private final static int CANT_EMPLEADOS = 8;

	private Vendedor[] vendedores = new Vendedor[CANT_EMPLEADOS];

	public void setVendedores(Vendedor[] vendedores) {
		this.vendedores = vendedores;
	}

	/**
	 * 
	 * @param venta
	 */
	public void mostrarVenta(Venta venta) {
		Vendedor vendedor = null;
		vendedor = buscarVendedor(venta.getLegajoVendedor());
		if (vendedor != null) {
			System.out.println(vendedor.getNombre() + " vendio un monto de $" + venta.getImporte());
		} else {
			System.out.println("Vendedor desconocido");
		}
	}

	/**
	 * 
	 * @param legajo
	 * @return
	 */
	private Vendedor buscarVendedor(String legajo) {
		int i = 0;
		Vendedor vendedorEncontrado = null;

		while (i < this.vendedores.length && vendedorEncontrado == null) {
			if (this.vendedores[i].getLegajo() == legajo) {
				vendedorEncontrado = this.vendedores[i];
			} else {
				i++;
			}
		}
		return vendedorEncontrado;
	}

}
