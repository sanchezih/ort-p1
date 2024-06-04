package ar.edu.ort.p1.examenes._02_ds.terminales_de_autoservicio.src;

public abstract class Billete implements Verificable {

	private final static long NUM_BILLETE_LIMITE = 2000000;

	private long numero;
	private char letraSerie;
	private int anio;
	private Estado estado;
	private Valor valor;

	/*----------------------------------------------------------------------------*/

	public Billete(long numero, char letraSerie, int anio, Estado estado, Valor valor) {
		this.numero = numero;
		this.letraSerie = letraSerie;
		this.anio = anio;
		this.estado = estado;
		this.valor = valor;
	}

	/*----------------------------------------------------------------------------*/

	public int getAnio() {
		return anio;
	}

	public char getLetraSerie() {
		return letraSerie;
	}

	public Valor getValor() {
		return valor;
	}

	public Estado getEstado() {
		return estado;
	}

	public boolean cumpleRequisito() {
		return numero > NUM_BILLETE_LIMITE;
	}

	@Override
	public String toString() {
		return "numero=" + numero + ", letraSerie=" + letraSerie + ", anio=" + anio + ", estado=" + estado + ", valor="
				+ valor;
	}

}
