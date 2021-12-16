package ar.edu.ort.p1.unidades.u5.practico05.ej10_elecciones.src;

public class PadronElectoral {

	private ListaDeMesas mesas;

	public PadronElectoral() {
		mesas = new ListaDeMesas();
	}

	public RegistroDeElector generarRegistroDeElector(int dni) {
		int pos = 0;
		RegistroDeElector registro = null;
		while (pos < mesas.size() && !mesas.get(pos).tieneEnLista(dni)) {
			pos++;
		}
		if (pos < mesas.size()) {
			registro = mesas.get(pos).generarRegistroDeElector(dni);
		}
		return registro;
	}

	public void registrarEnMesa(ElectorConMesa elector) {
		Mesa mesa = mesas.search(elector.getNroMesa());
		if (mesa == null) {
			mesa = new Mesa(elector.getNroMesa());
			mesas.add(mesa);
		}
		try {
			mesa.agregarElector(elector.generarElectorSinMesa());
		} catch (RuntimeException re) {
			System.out.println("Error: " + re.getMessage());
		}
	}
}
