package ar.edu.ort.p1.examenes._01_oop.teatro.src;

public class Dramatica extends Obra implements Premiable {

	private static final int ENTRADAS_ADICIONALES = 2;

	private boolean basadaEnLibro;

	/*----------------------------------------------------------------------------*/

	public Dramatica(String nombre, int duracion, int cantLocalidades, boolean basadaEnLibro) {
		super(nombre, duracion, cantLocalidades);
		this.basadaEnLibro = basadaEnLibro;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void asignarPremio(int cant) {
		for (Espectador espectador : getEspectadoresPremiables()) {
			System.out.println("El espectador con DNI" + espectador.getDni() + " recibe "
					+ (cant + ENTRADAS_ADICIONALES) + " entradas");
		}
	}
}
