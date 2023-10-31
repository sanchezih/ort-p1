package ar.edu.ort.p1.examenes.ds.generador_de_actas_para_finales.src;

public class AlumnoLibre extends Alumno {

	private int cantFinalesDados;

	/*----------------------------------------------------------------------------*/

	public AlumnoLibre(int dni, String nombre, int nroCurso, int notaCursada, int cantFinalesDados) {
		super(dni, nombre, nroCurso, notaCursada);
		this.cantFinalesDados = cantFinalesDados;
	}

	/*----------------------------------------------------------------------------*/

	@Override
	public CategoriaExamen getCategoriaExamen() {
		return CategoriaExamen.FINAL_PRACTICO;
	}

	@Override
	public String toString() {
		return "AlumnoLibre [cantFinalesDados=" + cantFinalesDados + ", toString()=" + super.toString() + "]";
	}

}
