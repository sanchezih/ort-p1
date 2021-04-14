package tp3_puerto_barcos.src;

public class Amarra {

	private int numero;
	private String ubicacion;
	private boolean isDisponible;

	public Amarra(int numero, String ubicacion, boolean isDisponible) {
		this.numero = numero;
		this.ubicacion = ubicacion;
		this.isDisponible = isDisponible;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public boolean isDisponible() {
		return isDisponible;
	}

	public void setDisponible(boolean isDisponible) {
		this.isDisponible = isDisponible;
	}

}
