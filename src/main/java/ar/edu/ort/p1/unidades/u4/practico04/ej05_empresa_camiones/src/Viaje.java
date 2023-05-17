package ar.edu.ort.p1.unidades.u4.practico04.ej05_empresa_camiones.src;

public class Viaje {

	private int idCamion;
	private String idChofer;
	private double kms;

	public Viaje(int idCamion, String idChofer, double kms) {
		this.idCamion = idCamion;
		this.idChofer = idChofer;
		this.kms = kms;
	}

	public int getIdCamion() {
		return idCamion;
	}

	public String getIdChofer() {
		return idChofer;
	}

	public double getKms() {
		return kms;
	}

	@Override
	public String toString() {
		return "Viaje [idCamion=" + idCamion + ", idChofer=" + idChofer + ", kms=" + kms + "]";
	}

}
