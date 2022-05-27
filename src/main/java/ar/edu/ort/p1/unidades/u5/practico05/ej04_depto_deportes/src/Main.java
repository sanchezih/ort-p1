package ar.edu.ort.p1.unidades.u5.practico05.ej04_depto_deportes.src;

public class Main {

	public static void main(String[] args) {

		DepartamentoDeportes departamento = new DepartamentoDeportes();

		
		// Test ejercicio B
		System.out.println("Ejercicio B: La pelotas actualmente visibles son:");
		departamento.verPelotasEnTopes();

		// Test ejercicio C
		System.out.println("Ejercicio C: Agrego una nueva pelota:");
		departamento.agregarPelota(new Pelota("PAgregada", TipoPelota.FUTBOL));
		departamento.dibujarPilas();
	}

}
