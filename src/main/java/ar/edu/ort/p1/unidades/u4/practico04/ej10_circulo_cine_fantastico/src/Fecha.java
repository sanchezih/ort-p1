package ar.edu.ort.p1.unidades.u4.practico04.ej10_circulo_cine_fantastico.src;



public class Fecha {
	
	int dia;
	int mes;
	int anio;
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}
	


}
