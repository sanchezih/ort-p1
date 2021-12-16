package ar.edu.ort.p1.examenes.terminal_autoservicio_t1.src;

public class BilleteDolar extends Billete {
	private final static char LETRA_INHABILITADA = 'D';

	private String bandaSeguridad3D;

	public BilleteDolar(long numero, char letraSerie, int anio, Estado estado, Valor valor, String bandaSeguridad3D) {
		super(numero, letraSerie, anio, estado, valor);
		this.bandaSeguridad3D = bandaSeguridad3D;
	}

	@Override
	public boolean cumpleRequisito() {
		return super.cumpleRequisito() && getLetraSerie() != LETRA_INHABILITADA
				&& bandaSeguridad3D.equals("DOLAR " + getValor());
	}

}
