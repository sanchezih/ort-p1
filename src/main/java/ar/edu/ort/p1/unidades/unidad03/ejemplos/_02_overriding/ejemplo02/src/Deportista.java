package ar.edu.ort.p1.unidades.unidad03.ejemplos._02_overriding.ejemplo02.src;

public class Deportista extends Persona {

	private int numeroDeAfiliado;

	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param numeroDeAfiliado
	 */
	public Deportista(String nombre, String apellido, int numeroDeAfiliado) {
		super(nombre, apellido);
		this.numeroDeAfiliado = numeroDeAfiliado;
	}

	/**
	 * 
	 */
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("numeroDeAfiliado=" + numeroDeAfiliado);
	}
}