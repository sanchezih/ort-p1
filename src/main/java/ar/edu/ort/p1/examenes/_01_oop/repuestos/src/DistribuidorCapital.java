package ar.edu.ort.p1.examenes._01_oop.repuestos.src;

public class DistribuidorCapital extends Distribuidor {
	public static final float INC_MICRO = 10;

	private boolean permisoMicrocentro;

	/*----------------------------------------------------------------------------*/

	public DistribuidorCapital(int id, float porCom, float impPendRendir, boolean permisoMicrocentro) {
		super(id, porCom, impPendRendir);
		this.permisoMicrocentro = permisoMicrocentro;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public float calcularComision(float importe) {
		float impCom;
		impCom = super.calcularComision(importe);
		if (this.permisoMicrocentro) {
			impCom += impCom * INC_MICRO / 100;
		}
		return impCom;
	}
}
