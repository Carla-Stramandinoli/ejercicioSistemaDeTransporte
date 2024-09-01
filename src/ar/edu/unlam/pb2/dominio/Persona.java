package ar.edu.unlam.pb2.dominio;

public class Persona {

	private String nombre;
	private Double peso;
	
	public Persona(String nombre, Double peso) {
		super();
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
}
