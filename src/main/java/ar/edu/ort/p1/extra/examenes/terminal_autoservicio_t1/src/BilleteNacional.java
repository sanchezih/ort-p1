package ar.edu.ort.p1.extra.examenes.terminal_autoservicio_t1.src;

public class BilleteNacional extends Billete {

	private final static int ANIO_LIMITE = 2010;

	public BilleteNacional(long numero, char letraSerie, int anio, Estado estado, Valor valor) {
		super(numero, letraSerie, anio, estado, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cumpleRequisito() {
		return super.cumpleRequisito() && getAnio() >= ANIO_LIMITE;
	}

}
