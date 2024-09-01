package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
public class GestionTransportes {
	private List<Persona> pasajeros;
	private List<Vehiculo> vehiculos;
	
	public GestionTransportes() {
		this.pasajeros = new ArrayList<>();
		this.vehiculos = new ArrayList<>();
	}

	public Boolean agregar(Vehiculo nuevoVehiculo) {
		return this.vehiculos.add(nuevoVehiculo);
	}

	public List<Camion> obtenerCamiones() {
		List<Camion> camiones = new ArrayList<>();
		
		for(Vehiculo vehiculo : this.vehiculos) {
			if(vehiculo instanceof Camion) 
				camiones.add((Camion)vehiculo);	
		}
		return camiones;
	}

}
