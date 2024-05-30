package ar.edu.ort.p1.examenes._02_ds.terminales_de_autoservicio.src;

public class BilleteNacional extends Billete {

	private final static int ANIO_LIMITE = 2010;

	/*----------------------------------------------------------------------------*/

	public BilleteNacional(long numero, char letraSerie, int anio, Estado estado, Valor valor) {
		super(numero, letraSerie, anio, estado, valor);
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean cumpleRequisito() {
		return super.cumpleRequisito() && getAnio() >= ANIO_LIMITE;
	}

	@Override
	public String toString() {
		return "BilleteNacional [" + super.toString() + "]";
	}

}
