package ar.edu.ort.p1.u3.practico03.ej05_bicicleteria.src;

public class Main {

	public static void main(String[] args) {

		Taller t1 = new Taller();

		t1.agregarBicicleta(new BicicletaComun("Trek", "T-001", 1999));
		t1.agregarBicicleta(new BicicletaComun("Trek", "T-002", 1999));

		t1.agregarBicicleta(new BicicletaElectrica("Lion", "L-10", 1999, 250));
		t1.agregarBicicleta(new BicicletaElectrica("Lion", "L-10", 1999, 251));
		t1.agregarBicicleta(new BicicletaElectrica("Lion", "L-10", 2000, 180));

		/*----------------------------------------------------------------------------*/

		// Ejercicios B y C
		System.out.println("El taller le podra prestar servicio a "
				+ t1.cantServiciosPosibles(t1.getListaDeBicicletas()) + " bicicletas");
	}
}
