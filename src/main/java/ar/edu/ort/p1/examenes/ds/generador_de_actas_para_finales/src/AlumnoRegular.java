package ar.edu.ort.p1.examenes.ds.generador_de_actas_para_finales.src;

public class AlumnoRegular extends Alumno {

	private boolean tuvoCamaraEncendida;

	/*----------------------------------------------------------------------------*/

	public AlumnoRegular(int dni, String nombre, int nroCurso, int notaCursada, boolean tuvoCamaraEncendida) {
		super(dni, nombre, nroCurso, notaCursada);
		this.tuvoCamaraEncendida = tuvoCamaraEncendida;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * 
	 */
	@Override
	public CategoriaExamen getCategoriaExamen() {
		CategoriaExamen res = CategoriaExamen.RECUPERATORIO;
		int nota;
		nota = getNotaCursada();

		if (nota >= NOTA_FT && tuvoCamaraEncendida) {
			res = CategoriaExamen.FINAL_TEORICO;
		} else {
			boolean condicion1 = nota >= NOTA_APR && nota < NOTA_FT;
			boolean condicion2 = nota >= NOTA_FT && !tuvoCamaraEncendida;
			if (condicion1 || condicion2) {
				res = CategoriaExamen.FINAL_PRACTICO;
			}
		}
		return res;
	}

	@Override
	public String toString() {
		return "AlumnoRegular [tuvoCamaraEncendida=" + tuvoCamaraEncendida + ", toString()=" + super.toString() + "]";
	}

}
