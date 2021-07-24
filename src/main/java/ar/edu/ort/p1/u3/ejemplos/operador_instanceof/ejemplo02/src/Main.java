package ar.edu.ort.p1.u3.ejemplos.operador_instanceof.ejemplo02.src;

class Main {
	public static void main(String[] args) {

		Perro toby = new Perro();

		if (toby instanceof Animal) {
			System.out.println("Toby es un perro y tambien un animal");
		}

		Animal p = new Perro(); /* creacion */
		Perro.downCast(p);
	}
}