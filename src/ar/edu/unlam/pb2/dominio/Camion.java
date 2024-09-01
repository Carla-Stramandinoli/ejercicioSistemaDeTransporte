package ar.edu.unlam.pb2.dominio;

import java.util.List;

public class Camion extends Vehiculo {

	public Camion(String patente, Double pesoMaximo, Integer capacidadDeCarga) {
		super(patente, pesoMaximo, capacidadDeCarga);
	}

	@Override
	public Boolean cargarPasajero(Persona pasajero) {
		for(Persona persona : this.pasajeros) {
			if(this.obtenerCapacidadMaximaDePasajeros() < capacidadDeCarga || 
					this.obtenerPesoMaximo() <= pesoMaximo) {
				this.pasajeros.add(pasajero);
			}
		}
		
		return false;
	}

}
