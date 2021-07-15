package edu.ort.p1.extra.examenes._2021c1._recu2.tema2.src;

public class CamionDeLiquidos extends Camion {

	public static final int MAX = 5;

	private int capacidadLitros;
	private int cantTanques;

	public CamionDeLiquidos(int capacidadLitros, int cantTanques) {
		super();
		this.capacidadLitros = capacidadLitros;
		this.cantTanques = cantTanques;
	}

	public int getCapacidadLitros() {
		return capacidadLitros;
	}

	public void setCapacidadLitros(int capacidadLitros) {
		this.capacidadLitros = capacidadLitros;
	}

	public int getCantTanques() {
		return cantTanques;
	}

	public void setCantTanques(int cantTanques) {
		this.cantTanques = cantTanques;
	}

	@Override
	public boolean debeRenovarse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void mostrarID() {
		// TODO Auto-generated method stub

	}

}
