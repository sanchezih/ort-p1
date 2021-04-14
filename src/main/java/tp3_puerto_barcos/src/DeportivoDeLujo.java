package tp3_puerto_barcos.src;

public class DeportivoDeLujo extends Deportivo {


	@Override
	public double calcularConsumo() {
		return (2 * getPotencia() * ICP);
	}

}
