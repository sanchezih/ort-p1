package ar.edu.ort.p1.examenes.empresa_logistica.src;

public class CamionDeLiquidos extends Camion {

	public static final int MAX = 5;

	private int capacidadLitros;
	private int cantTanques;

	public CamionDeLiquidos(int nroPatente, int anioFabricacion, int kmRecorridos, int capacidadLitros,
			int cantTanques) {
		super(nroPatente, anioFabricacion, kmRecorridos);
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
		return Fecha.aniosHastaHoy(getAnioFabricacion()) > MAX;
	}
}
