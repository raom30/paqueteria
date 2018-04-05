package es.paqueteria.paqueteria.modelo;

public class Localidad {
	
	private Integer idLocalidad;
	protected String nombreLocalidad;
	private Zona nombreZona;
	
	public Localidad(Integer idLocalidad, String nombreLocalidad, Zona nombreZona) {
		this.idLocalidad = idLocalidad;
		this.nombreLocalidad = nombreLocalidad;
		this.nombreZona = nombreZona;
		
	}

	public Integer getIdLocalidad() {
		return idLocalidad;
	}

	public String getNombreLocalidad() {
		return nombreLocalidad;
	}
	
	
	
}
