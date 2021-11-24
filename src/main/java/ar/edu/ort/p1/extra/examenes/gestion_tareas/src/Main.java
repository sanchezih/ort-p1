package ar.edu.ort.p1.extra.examenes.gestion_tareas.src;

public class Main {

	public static void main(String[] args) {
		GestorTareas gestor = new GestorTareas();

		gestor.agregarUsuario(new Usuario("Maria", "Gonzalez", "AA"));

		gestor.agregarTarea(new ErrorInterno("DESA", null, "Victoria"));
		gestor.agregarTarea(new ErrorEnProduccion("PRD", null, true, "PRD"));
		gestor.agregarTarea(new ErrorEnProduccion("PRD", null, true, "PRD"));
		gestor.agregarTarea(new Desarrollo("Bla", 5));
		gestor.agregarTarea(new Desarrollo("Bla", 39));

		/*----------------------------------------------------------------------------*/

		// Test Ejercicio B
		mostrar(gestor.reporteTiempoPromedioTareasPorPrioridad());

		mostrar(gestor.reporteTiempoPromedioTareasPorPrioridadConSwitch());

		// Test Ejercicio C
		gestor.asignarTareas();

	}

	public static void mostrar(double[] elementos) {
		for (int i = 0; i < elementos.length; i++) {
			System.out.print(Prioridad.values()[i] + "\t" + elementos[i] + "\n");
		}
		System.out.println();
	}

}
