package tp3_cabinas_peaje.src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class EstacionDePeaje {
	private int id;
	private String descripcion;
	private ArrayList<Cabina> listaDeCabinas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<Cabina> getListaDeCabinas() {
		return listaDeCabinas;
	}

	public void setListaDeCabinas(ArrayList<Cabina> listaDeCabinas) {
		this.listaDeCabinas = listaDeCabinas;
	}

	public static String dameHoraActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

	public ArrayList<Cabina> cabinasConEfectivo() {
		ArrayList<Cabina> cabinasConEfectivo = new ArrayList<Cabina>();
		for (Cabina c : this.listaDeCabinas) {
			if (c.getMp() instanceof Efectivo) {
				cabinasConEfectivo.add(c);
			}
		}
		return cabinasConEfectivo;
	}

	public double promedioDemora() {
		double sumatoria = 0;
		double cantidad = 0;
		for (Cabina c : this.listaDeCabinas) {
			if (c.getMp() instanceof MedioDePagoElectronico) {
				sumatoria = sumatoria + ((MedioDePagoElectronico) c.getMp()).getCantDiasDemoraPago();
				cantidad++;
			}
		}
		return (cantidad > 0 ? (sumatoria / cantidad) : 0);
	}
}
