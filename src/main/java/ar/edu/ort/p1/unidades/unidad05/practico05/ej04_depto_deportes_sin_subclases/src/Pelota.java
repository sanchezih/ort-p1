package ar.edu.ort.p1.unidades.unidad05.practico05.ej04_depto_deportes_sin_subclases.src;

public class Pelota {

	private String codigo;
	private TipoPelota tipo;

	/*----------------------------------------------------------------------------*/

	public Pelota(String codigo, TipoPelota tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}

	/*----------------------------------------------------------------------------*/

	public String getCodigo() {
		return codigo;
	}

	public TipoPelota getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Pelota [codigo=" + codigo + ", tipo=" + tipo + "]";
	}

	public char getInicial() {
		return this.getTipo().name().charAt(0);
	}

}
