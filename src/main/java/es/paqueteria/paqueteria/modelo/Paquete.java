package es.paqueteria.paqueteria.modelo;

public class Paquete {

	private Sucursal idSucursal;
	private  Integer idPaquete;
	private  double altura;
	private double anchura;
	private double peso;
	private double profundidad;
	private double contrareembolso;
	
	public Paquete(Sucursal idSucursal, Integer idPaquete, double altura, double anchura, double peso,
			double profundidad, double contrareembolso) {
		super();
		this.idSucursal = idSucursal;
		this.idPaquete = idPaquete;
		this.altura = altura;
		this.anchura = anchura;
		this.peso = peso;
		this.profundidad = profundidad;
		this.contrareembolso = contrareembolso;
	}
	
	
	
}
