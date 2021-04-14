package tp3_puerto_barcos.src;

public abstract class Barco {

	private String matricula;
	private double eslora;
	private int anioFabricacion;
	private String nombreDuenio;
	private static double valorBase = 10; // Precio base: Se obtiene multiplicando un valor definido por la
											// administración del puerto para cada embarcación (denominado valorBase)
											// por la eslora del barco.
	private static double valorAdicional = 2.5;

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

	public static double getValorBase() {
		return valorBase;
	}

	public static void setValorBase(float valorBase) {
		Barco.valorBase = valorBase;
	}

	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}

	public static double getValorAdicional() {
		return valorAdicional;
	}

	public static void setValorAdicional(double valorAdicional) {
		Barco.valorAdicional = valorAdicional;
	}

	public static void setValorBase(double valorBase) {
		Barco.valorBase = valorBase;
	}

	public double calcularCostoBase() {
		return (eslora * valorBase);
	}

	public double calcularAlquiler() {
		return calcularCostoBase() + calcularCostoAdicional();
	};

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion
				+ ", nombreDuenio=" + nombreDuenio + "]";
	}

	abstract public double calcularCostoAdicional();
}
