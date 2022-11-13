package ar.edu.ort.p1.examenes.ds.terminales_de_autoservicio.src;

public enum Valor {

	DIEZ(10), CINCUENTA(50), CIEN(100);

	private int numero;

	private Valor(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

}
