package es.paqueteria.paqueteria.modelo;

public class Sucursal  {
	
	private Integer idSucursal ;
	private String nombreSucursal;
	private Localidad nombreLocalidad;
	
	public Sucursal(Integer idSucursal, String nombreSucursal, Localidad nombreLocalidad) {
		this.idSucursal = idSucursal;
		this.nombreSucursal = nombreSucursal;
		this.nombreLocalidad = nombreLocalidad;
	}

	public Integer getIdSucursal() {
		return idSucursal;
	}

	public String getNombreSucursal() {
		return nombreSucursal;
	}
	
	

}
