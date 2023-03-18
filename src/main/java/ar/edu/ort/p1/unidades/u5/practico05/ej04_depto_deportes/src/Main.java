package ar.edu.ort.p1.unidades.u5.practico05.ej04_depto_deportes.src;

public class Main {

	public static void main(String[] args) {

		DepartamentoDeportes departamento = new DepartamentoDeportes();

		// Test ejercicio B
		System.out.println("Ejercicio B: La pelotas actualmente visibles son:");
		departamento.verPelotasEnTopes();

		// Test ejercicio C
		System.out.println(
				"\nEjercicio C: Agrego una nueva pelota de voley en la primera pila que tenga lugar para alojarla:");
		System.out.println(
				"Se pudo agregar? -> " + departamento.agregarPelota(new Pelota("PAgregada", TipoPelota.VOLEY)));
		departamento.dibujarPilas();

		// Test ejercicio D
		System.out.println(
				"Ejercicio D: Busco la pelota con codigo PAgregada: " + departamento.buscarPelota("PAgregada"));

		System.out.println();
		
		// Test ejercicio E
		System.out.println("Ejercicio E: Muestro cuantas pelotas de cada tipo hay en cada pila");
		departamento.dibujarMatrizDePelotas(departamento.pelotasPorTipo());
	}

}
