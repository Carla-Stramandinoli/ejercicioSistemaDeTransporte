package ar.edu.unlam.pb2.dominio;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	private String patente;
	protected Double pesoMaximo;
	protected Integer capacidadDeCarga;
	protected List<Persona> pasajeros;
	protected Integer pasajerosABordo;

	public Vehiculo(String patente, Double pesoMaximo, Integer capacidadDeCarga) {
		this.patente = patente;
		this.pesoMaximo = pesoMaximo;
		this.capacidadDeCarga = capacidadDeCarga;
		this.pasajeros = new ArrayList<Persona>(capacidadDeCarga);
		this.pasajerosABordo = 0;
	}

	public Boolean cargarPasajero(Persona pasajero) {
		return this.pasajeros.add(pasajero);
	}

	public Double obtenerPesoMaximo() {
		return this.pesoMaximo;
	}

	public Double obtenerPesoActualSegunPasajerosABordo() {
		Double pesoAcumulado = 0.0;
		Double pesoPersonaAbordo = 0.0;
		for (Persona persona : this.pasajeros) {
			if (persona instanceof Persona) {
				pesoPersonaAbordo = persona.getPeso();
				pesoAcumulado += pesoPersonaAbordo;
			}

		}
		return pesoAcumulado;
	}

	public Integer obtenerCapacidadMaximaDePasajeros() {
		return this.capacidadDeCarga;
	}

	public Integer getCantidadPasajerosABordo() {
		return this.pasajerosABordo;
	}

}
