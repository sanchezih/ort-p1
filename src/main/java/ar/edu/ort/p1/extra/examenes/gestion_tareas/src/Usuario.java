package ar.edu.ort.p1.extra.examenes.gestion_tareas.src;

public class Usuario {

	private String nombre;
	private String apellido;
	private String proyecto;
	private ListaTareasOrdenadasPorPrioridad tareasAsignadas;

	public Usuario(String nombre, String apellido, String proyecto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.proyecto = proyecto;
		this.tareasAsignadas = new ListaTareasOrdenadasPorPrioridad();
	}

	public void agregarTarea(Tarea tarea) {
		this.tareasAsignadas.add(tarea);
	}

}
