package edu.ort.tp3.tp3_puerto_barcos.src;

public class Yate extends Barco {
	private int cantCamarotes;

	public Yate(String matricula, double eslora, int anioFabricacion, String nombreDuenio, int cantCamarotes) {
		super(matricula, eslora, anioFabricacion, nombreDuenio);
		this.cantCamarotes = cantCamarotes;
	}

	public int getCantCamarotes() {
		return cantCamarotes;
	}

	public void setCantCamarotes(int cantCamarotes) {
		this.cantCamarotes = cantCamarotes;
	}

	@Override
	public String toString() {

		return ("\nMatricula: " + getMatricula() + "\nEslora: " + getEslora() + "\nAnio de fabricacion: "
				+ getAnioFabricacion() + "\nDuenio: " + getNombreDuenio() + "\nCantidad de camarotes: "
				+ cantCamarotes);
	}

	@Override
	public double calcularAdicional() {
		return VALOR_ADICIONAL * this.cantCamarotes;
	}

}
