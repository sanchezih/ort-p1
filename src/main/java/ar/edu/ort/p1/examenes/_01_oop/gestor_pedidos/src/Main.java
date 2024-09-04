package ar.edu.ort.p1.examenes._01_oop.gestor_pedidos.src;

public class Main {

	public static void main(String[] args) {

		Bebida b1 = new Bebida("Jugo", 8, 125, Tamanio.GRANDE);
		System.out.println(b1.obtenerPrecio());
		System.out.println(b1.obtenerPeso());

		Comida c1 = new Comida("Pan", 6, 100, true, 4);
		System.out.println(c1.obtenerPrecio());
		System.out.println(c1.obtenerPeso());

		Combo combo1 = new Combo("Combo 1", 20);
		combo1.agregarItem(c1);
		combo1.agregarItem(b1);
		System.out.println(combo1.obtenerPrecio());
		System.out.println(combo1.obtenerPeso());

		Pedido p1 = new Pedido();
		p1.agregarItem(c1);
		p1.agregarItem(b1);

		System.out.println(p1.evaluar());

	}

}
