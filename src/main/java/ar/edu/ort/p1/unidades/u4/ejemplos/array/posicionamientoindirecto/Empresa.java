package ar.edu.ort.p1.unidades.u4.ejemplos.array.posicionamientoindirecto;

public class Empresa {
	private Vendedor[] vendedores = new Vendedor[8];

	public Vendedor[] getVendedores() {
		return vendedores;
	}

	public void setVendedores(Vendedor[] vendedores) {
		this.vendedores = vendedores;
	}

	public void mostrarVenta(Venta venta) {
		Vendedor vendedor = null;
		vendedor = buscarVendedor(venta.getLegajoVendedor());
		if (vendedor != null) {
			System.out.println(vendedor.getNombre() + " vendio un monto de $" + venta.getImporte());
		} else {
			System.out.println("Vendedor desconocido");
		}
	}

	private Vendedor buscarVendedor(String legajo) {
		int i = 0;
		Vendedor encontrado = null;

		while (i < this.vendedores.length && encontrado == null) {
			if (this.vendedores[i].getLegajo() == legajo) {
				encontrado = this.vendedores[i];
			} else {
				i++;
			}
		}
		return encontrado;
	}

}
