package edu.ort.p1.u5.practico05.ej04_depto_deportes.src;

public class Pelota {
	private String codigo;
	private TipoPelota tipo;
	
	

	public Pelota(String codigo, TipoPelota tipo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public TipoPelota getTipo() {
		return tipo;
	}

}
