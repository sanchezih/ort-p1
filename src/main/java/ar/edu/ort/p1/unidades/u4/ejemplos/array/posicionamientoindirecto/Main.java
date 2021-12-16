package ar.edu.ort.p1.unidades.u4.ejemplos.array.posicionamientoindirecto;

public class Main {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("L5233", "Pedro");
		Vendedor v2 = new Vendedor("L5234", "Julieta");
		Vendedor v3 = new Vendedor("L5235", "Maria");
		Vendedor v4 = new Vendedor("L5236", "Luis");
		Vendedor v5 = new Vendedor("L5237", "Florencia");
		Vendedor v6 = new Vendedor("L5238", "Martin");
		Vendedor v7 = new Vendedor("L5239", "Elena");
		Vendedor v8 = new Vendedor("L5240", "Roberto");

		Vendedor[] vendedores = { v1, v2, v3, v4, v5, v6, v7, v8 };

		Empresa e1 = new Empresa();
		e1.setVendedores(vendedores);

		Venta venta1 = new Venta("2021-03-08", 149.95, "L5237");
		Venta venta2 = new Venta("2021-03-09", 1800, "L5237");

		e1.mostrarVenta(venta1);
		e1.mostrarVenta(venta2);

	}

}
