package ar.edu.ort.p1.examenes._01_oop.repuestos.src;

public class Repuesto {

	private String id;
	private String desc;
	private int canStock;
	private float precio;

	/*----------------------------------------------------------------------------*/

	public Repuesto(String id, String desc, int canStock, float precio) {
		this.id = id;
		this.desc = desc;
		this.canStock = canStock;
		this.precio = precio;
	}

	/*----------------------------------------------------------------------------*/

	public int getCanStock() {
		return canStock;
	}

}
