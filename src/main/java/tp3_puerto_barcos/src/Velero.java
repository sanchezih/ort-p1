package tp3_puerto_barcos.src;

public class Velero extends Barco {
	private int cantMastiles;

	public Velero(String matricula, double eslora, int anioFabricacion, String nombreDuenio, int cantMastiles) {
		super(matricula, eslora, anioFabricacion, nombreDuenio);
		this.cantMastiles = cantMastiles;
	}

	public int getCantMastiles() {
		return cantMastiles;
	}

	public void setCantMastiles(int cantMastiles) {
		this.cantMastiles = cantMastiles;
	}

	@Override
	public String toString() {

		return ("\nMatricula: " + getMatricula() + "\nEslora: " + getEslora() + "\nAnio de fabricacion: "
				+ getAnioFabricacion() + "\nDuenio: " + getNombreDuenio() + "\nCantidad de mastiles: " + cantMastiles);
	}

	@Override
	public double calcularAdicional() {
		return VALOR_ADICIONAL * this.cantMastiles;
	}

}
