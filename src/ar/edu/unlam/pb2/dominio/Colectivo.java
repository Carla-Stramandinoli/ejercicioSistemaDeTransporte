package ar.edu.unlam.pb2.dominio;

import java.util.List;

public class Colectivo extends Vehiculo {

	private Integer numeroDeLinea;

	public Colectivo(String patente, Double pesoMaximo, Integer capacidadDeCarga, Integer numeroDeLinea) {
		super(patente, pesoMaximo, capacidadDeCarga);
		this.numeroDeLinea = numeroDeLinea;

	}

	@Override
	public Boolean cargarPasajero(Persona pasajero) {
		if ((this.pasajeros.size() < this.capacidadDeCarga)
				|| super.obtenerPesoActualSegunPasajerosABordo() <= pesoMaximo) {
			pasajerosABordo++;
			return this.pasajeros.add(pasajero);
		}
		return false;
	}

	@Override
	public Integer getCantidadPasajerosABordo() {
		return this.pasajerosABordo;
	}
}
