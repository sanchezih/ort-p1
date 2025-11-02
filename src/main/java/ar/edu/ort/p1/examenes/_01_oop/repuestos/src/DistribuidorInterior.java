package ar.edu.ort.p1.examenes._01_oop.repuestos.src;

public class DistribuidorInterior extends Distribuidor {

	private float impFijo;
	private float kmRec;

	/*----------------------------------------------------------------------------*/

	public DistribuidorInterior(int id, float porCom, float impPendRendir, float impFijo, float kmRec) {
		super(id, porCom, impPendRendir);
		this.impFijo = impFijo;
		this.kmRec = kmRec;
	}

	@Override
	public float calcularComision(float importe) {
		return super.calcularComision(importe) + this.impFijo;
	}

}
