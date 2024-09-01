package ar.edu.unlam.pb2.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import java.util.List;

public class GestionTransportesTest {

	@Test
	public void dadoQueExiteUnaEmpresaDeTransportesPuedoAgregarUnCamion() {
		GestionTransportes gestionTransportes = new GestionTransportes();
		Vehiculo camionNuevoA1 = new Camion("AAA111", 2000.0, 2);

		Boolean agregado = gestionTransportes.agregar(camionNuevoA1);

		assertTrue(agregado);
	}

	@Test
	public void dadoQueExiteUnaEmpresaDeTransportesPuedoAgregarColectivo() {
		GestionTransportes gestionTransportes = new GestionTransportes();
		Vehiculo colectivoLinea12 = new Colectivo("AAA222", 2800.0, 30, 12);

		Boolean agregado = gestionTransportes.agregar(colectivoLinea12);

		assertTrue(agregado);
	}

	@Test
	public void dadoQueExiteUnaEmpresaDeTransportesConUnCamionUnAutoYUnColectivoCuandoObtengoCamionObtengoUno() {
		GestionTransportes gestionTransportes = new GestionTransportes();
		Vehiculo camionNuevoA1 = new Camion("AAA111", 800.0, 2);
		Vehiculo autoNuevo = new Auto("AA 111 bb", 400.0, 5, "ford");
		Vehiculo colectivoLinea12 = new Colectivo("AAA222", 3000.0, 40, 12);

		gestionTransportes.agregar(camionNuevoA1);
		gestionTransportes.agregar(autoNuevo);
		gestionTransportes.agregar(colectivoLinea12);

		List<Camion> camiones = gestionTransportes.obtenerCamiones();

		assertEquals(1, camiones.size());
	}

	@Test
	public void dadoQueExiteUnaEmpresaDeTransportesConUnColectivoPuedoCargar2Pasajeros() {
		GestionTransportes gestionTransportes = new GestionTransportes();
		Vehiculo colectivoLinea12 = new Colectivo("AAA222", 2800.0, 30, 12);
		Persona pasajero1 = new Persona("Juan", 80.0);
		Persona pasajero2 = new Persona("Maria", 60.0);

		colectivoLinea12.cargarPasajero(pasajero1);
		colectivoLinea12.cargarPasajero(pasajero2);

		Integer cantidadEsperada = 2;
		assertEquals(cantidadEsperada, colectivoLinea12.getCantidadPasajerosABordo());
	}

	@Test
	public void dadoQueExiteUnaEmpresaDeTransportesConUnCamionPuedoCargar2PasajerosYNoSuperarLaCapacidadMaximaDePasajeros() {
		Vehiculo camionNuevoA1 = new Camion("AAA111", 800.0, 2);
		Persona pasajero1 = new Persona("Juan", 80.0);
		Persona pasajero2 = new Persona("Maria", 60.0);

		camionNuevoA1.cargarPasajero(pasajero1);
		camionNuevoA1.cargarPasajero(pasajero2);

		Integer capacidadMaximaObtenida = camionNuevoA1.obtenerCapacidadMaximaDePasajeros();
		Integer capacidadMaximaEsperada = 2;

		assertEquals(capacidadMaximaEsperada, capacidadMaximaObtenida);
	}
	
	@Test
	public void dadoQueExiteUnaEmpresaDeTransportesConUnAutoPuedoCargar3PasajerosYNoSuperarElPesoMaximoPermitido() {
		Vehiculo autoNuevoA2 = new Auto("AB 333 ER", 800.0, 5, "Renault");
		Persona pasajero1 = new Persona("Juan", 80.0);
		Persona pasajero2 = new Persona("Maria", 60.0);
		Persona pasajero3 = new Persona("Brandon", 90.0);


		autoNuevoA2.cargarPasajero(pasajero1);
		autoNuevoA2.cargarPasajero(pasajero2);
		autoNuevoA2.cargarPasajero(pasajero3);

		Double pesoObtenido = autoNuevoA2.obtenerPesoActualSegunPasajerosABordo();
		Double pesoEsperado = 230.0;

		assertEquals(pesoEsperado, pesoObtenido);
	}
}
