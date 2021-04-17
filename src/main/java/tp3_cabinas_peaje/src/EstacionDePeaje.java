package tp3_cabinas_peaje.src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class EstacionDePeaje {
	private int id;
	private String descripcion;
	private ArrayList<Cabina> listaDeCabinas;

	public String dameHoraActual() {
		String date = null;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		return date;
	}

	public ArrayList<Cabina> getListaDeCabinas() {
		return listaDeCabinas;
	}

	public void setListaDeCabinas(ArrayList<Cabina> listaDeCabinas) {
		this.listaDeCabinas = listaDeCabinas;
	}

}
