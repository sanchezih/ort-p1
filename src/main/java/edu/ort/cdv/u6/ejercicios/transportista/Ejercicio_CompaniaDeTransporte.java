package edu.ort.cdv.u6.ejercicios.transportista;

import edu.ort.cdv.u6.ejercicios.transportista.clases.Carga;
import edu.ort.cdv.u6.ejercicios.transportista.clases.Chofer;
import edu.ort.cdv.u6.ejercicios.transportista.clases.CompaniaDeTransportes;
import edu.ort.cdv.u6.ejercicios.transportista.clases.TipoVehiculo;

public class Ejercicio_CompaniaDeTransporte {

	public static void main(String[] args) {
		CompaniaDeTransportes ct = new CompaniaDeTransportes();
		
		ct.altaChofer(12345678, "Aparicio Luna");
		ct.altaChofer(23456789, "Marcos Gravevoz");
		ct.altaChofer(34567890, "Domingo Diaz de Carreras");
		ct.altaChofer(34127856, "Kosher Waters");
		ct.altaChofer(31426758, "Greta Barbol");
		ct.altaChofer(24785236, "Esteban Quete");
		ct.altaChofer(24681012, "Elber Berecho");
		
		ct.altaVehiculo("AA 000 ZZ", TipoVehiculo.CAMION, 12000);
		ct.altaVehiculo("ZXE022", TipoVehiculo.CAMIONETA, 4000);
		ct.altaVehiculo("FDE999", TipoVehiculo.CAMION_CON_TOLVA, 24000);
		ct.altaVehiculo("AB 111 BA", TipoVehiculo.CAMION, 12000);
		ct.altaVehiculo("CD 222 DC", TipoVehiculo.CAMIONETA, 3500);
		ct.altaVehiculo("EF 333 FE", TipoVehiculo.CAMION, 9000);
		ct.altaVehiculo("HG 444 GH", TipoVehiculo.CAMION_ACOPLADO, 20500);
		
		Chofer baja = ct.bajaChofer(24785236);
		System.out.println("Se dio de baja a " + baja.getNombre());

		ct.altaChofer(91684500, "Rex Mifune");

		ct.listarChoferes();
		ct.listarVehiculos();
		
		ct.asignarVehiculo("AA 000 ZZ", 12345678);
		ct.asignarVehiculo("HG 444 GH", 31426758);
		ct.asignarVehiculo("CD 222 DC", 91684500);
		Carga carga = new Carga("Muebles", 3400);	
		ct.asignarCarga(carga);
		
		ct.listarVehiculosSinChofer();
		ct.listarChoferesAsignados();
		ct.listarCargasListasParaEnviar();
	}

}
