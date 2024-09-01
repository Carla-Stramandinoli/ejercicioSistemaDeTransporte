package ar.edu.unlam.pb2.dominio;

public class Auto extends Vehiculo {

	private String marca;

	public Auto(String patente, Double pesoMaximo, Integer capacidadDeCarga, String marca) {
		super(patente, pesoMaximo, capacidadDeCarga);
		this.marca = marca;
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
}
