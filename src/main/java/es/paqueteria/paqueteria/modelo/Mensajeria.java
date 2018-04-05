package es.paqueteria.paqueteria.modelo;

public class Mensajeria {
	
	private Integer idMensajeria;
	private String nombreMensajeria;
	
	public Mensajeria(Integer idMensajeria, String nombreMensajeria) {
		super();
		this.idMensajeria = idMensajeria;
		this.nombreMensajeria = nombreMensajeria;
	}

	public Integer getIdMensajeria() {
		return idMensajeria;
	}

	public String getNombreMensajeria() {
		return nombreMensajeria;
	}
	
	

}
