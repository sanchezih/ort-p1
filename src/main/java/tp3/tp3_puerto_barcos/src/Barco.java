package tp3.tp3_puerto_barcos.src;

public abstract class Barco {

	private String matricula;
	private double eslora;
	private int anioFabricacion;
	private String nombreDuenio;
	protected final static double VALOR_BASE = 10;
	protected final static double VALOR_ADICIONAL = 2.5;

	public Barco() {

	}

	public Barco(String matricula, double eslora, int anioFabricacion, String nombreDuenio) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioFabricacion = anioFabricacion;
		this.nombreDuenio = nombreDuenio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getNombreDuenio() {
		return nombreDuenio;
	}

	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}

	public double calcularPrecioBase() {
		return VALOR_BASE * this.eslora;
	}

	public double calcularCostoDelAlquiler() {
		return calcularPrecioBase() + calcularAdicional();
	}

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion
				+ ", nombreDuenio=" + nombreDuenio + "]";
	}

	abstract public double calcularAdicional();
}
