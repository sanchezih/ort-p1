package ar.edu.ort.p1.unidades.u3.practico03.ej13_sophie.src;

public class Metodo implements Calificable {

	private String nombre;
	private int cantParametros;
	private int cantInstrucciones;
	private int cantRamificacionesFlujo;

	public Metodo(String nombre, int cantParametros, int cantInstrucciones, int cantRamificacionesFlujo) {
		this.nombre = nombre;
		this.cantParametros = cantParametros;
		this.cantInstrucciones = cantInstrucciones;
		this.cantRamificacionesFlujo = cantRamificacionesFlujo;
	}

	public String getNombre() {
		return nombre;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Ejercicio B: Realizar los metodos indiceCalidad de las clases calificables.
	 */
	@Override
	public double indiceCalidad() {
		return 5 / (cantParametros + 1) + 20 / cantInstrucciones + 3 / (cantRamificacionesFlujo + 1);
	}

	/*----------------------------------------------------------------------------*/

	public void mostrarDatos() {
		System.out.println(
				cantParametros + " | " + cantInstrucciones + " | " + cantRamificacionesFlujo + " | " + indiceCalidad());
	}

}
