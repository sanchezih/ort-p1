package ar.edu.ort.p1.extra.examenes.terminal_autoservicio_t1.src;

public enum Valor {

	DIEZ(10), CINCUENTA(50), CIEN(100);

	private final int numero;

	Valor(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

}
