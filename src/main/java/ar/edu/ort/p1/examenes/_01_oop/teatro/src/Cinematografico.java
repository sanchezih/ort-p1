package ar.edu.ort.p1.examenes._01_oop.teatro.src;

public class Cinematografico extends Musical implements Premiable {

	private String nombreDirector;

	/*----------------------------------------------------------------------------*/

	public Cinematografico(String nombre, int duracion, int cantLocalidades, boolean orquestaVivo,
			String nombreDirector) {
		super(nombre, duracion, cantLocalidades, orquestaVivo);
		this.nombreDirector = nombreDirector;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public void asignarPremio(int cant) {
		for (Espectador espectador : getEspectadoresPremiables()) {
			System.out.println("El espectador con DNI" + espectador.getDni() + " recibe " + cant + " entradas");
		}

	}

}
