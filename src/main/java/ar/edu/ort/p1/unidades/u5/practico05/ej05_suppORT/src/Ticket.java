package ar.edu.ort.p1.unidades.u5.practico05.ej05_suppORT.src;

public class Ticket {

	private int id;
	private String fecha;
	private Sector sector;
	private Prioridad prioridad;

	public Ticket(int id, String fecha, Sector sector, Prioridad prioridad) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.sector = sector;
		this.prioridad = prioridad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + "]";
	}

}
