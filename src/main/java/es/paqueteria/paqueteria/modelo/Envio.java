package es.paqueteria.paqueteria.modelo;

import java.util.Date;

public class Envio {
	
	private Paquete idPaquete;
	private Localidad idLocalidad;
	private Date fechaEnvio;
	
	public Envio(Paquete idPaquete, Localidad idLocalidad, Date fechaEnvio) {
		super();
		this.idPaquete = idPaquete;
		this.idLocalidad = idLocalidad;
		this.fechaEnvio = fechaEnvio;
	}
	
	

}
