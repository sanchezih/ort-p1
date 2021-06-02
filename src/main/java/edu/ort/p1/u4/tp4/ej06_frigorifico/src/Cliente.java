package edu.ort.p1.u4.tp4.ej06_frigorifico.src;

public class Cliente {
	private String razonSocial;
	private String cuit;
	private String telefono;
	private Pais pais;

	public Cliente(String razonSocial, String cuit, String telefono, Pais pais) {
		super();
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.telefono = telefono;
		this.pais = pais;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
