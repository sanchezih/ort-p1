package ar.edu.ort.p1.examenes.ds.gestor_reclamos_afip.src;

public class GestionAfip {

	private ListaOrdenadaDni ciudadanos;
	private PilaDeReclamos reclamos;

	public GestionAfip() {
		this.ciudadanos = new ListaOrdenadaDni();
		this.reclamos = new PilaDeReclamos();
	}

	private Ciudadano buscarCuidadano(int dni) {
		return this.ciudadanos.search(dni);
	}

	public ColaDeReclamos procesarReclamos() {
		Ciudadano c;
		ColaDeReclamos resultado = new ColaDeReclamos();
		Reclamo r;

		while (!this.reclamos.isEmpty()) {
			r = this.reclamos.pop();
			c = buscarCuidadano(r.getDni());
			if (c != null) {
				if (c.determinarImpuesto() != r.getImpuestoCobrado()) {
					resultado.add(r);
				}
			}
		}
		return resultado;
	}

	/*----------------------------------------------------------------------------*/

	// Metodos complementarios

	public void agregarCiudadano(Ciudadano ciudadano) {
		this.ciudadanos.add(ciudadano);
	}

	public void agregarReclamo(Reclamo reclamo) {
		this.reclamos.push(reclamo);
	}

}
