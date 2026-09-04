package ar.edu.ort.p1.examenes._01_oop.repuestos.src;

public class Distribuidor implements Bloqueable {
	public static final float TOPE_PEND = 100000;

	private int id;
	private float porCom;
	private float impPendRendir;

	/*----------------------------------------------------------------------------*/

	public Distribuidor(int id, float porCom, float impPendRendir) {
		this.id = id;
		this.porCom = porCom;
		this.impPendRendir = impPendRendir;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public boolean estaBloqueado() {
		return this.impPendRendir > TOPE_PEND;
	}

	public float calcularComision(float impTotPed) {
		return impTotPed * this.porCom;
	}

}
