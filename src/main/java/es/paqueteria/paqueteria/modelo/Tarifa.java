package es.paqueteria.paqueteria.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Tarifa {

	private final List<Tarifa> tarifas = new ArrayList<>();
	private Integer idTarifa;
	private double precioTarifa;
	private Peso peso;
	private Zona nombreZona;
	private Mensajeria nombreMensajeria;
	
	public Tarifa(Integer idTarifa, double precioTarifa, Peso peso, Zona nombreZona, Mensajeria nombreMensajeria) {
		this.idTarifa = idTarifa;
		this.precioTarifa = precioTarifa;
		this.peso = peso;
		this.nombreZona = nombreZona;
		this.nombreMensajeria = nombreMensajeria;
	}

	public Integer getIdTarifa() {
		return idTarifa;
	}

	public double getPrecioTarifa() {
		return precioTarifa;
	}

	public Peso getPeso() {
		return peso;
	}

	public Zona getNombreZona() {
		return nombreZona;
	}

	public Mensajeria getNombreMensajeria() {
		return nombreMensajeria;
	}
	
	public Tarifa mostrarTarifas(Mensajeria idMensajeria) {
		Optional<Tarifa> tarifaEncontrada = tarifas.stream().filter(d -> d.getNombreMensajeria().equals(idMensajeria))
				.findFirst();
		
		if (tarifaEncontrada.isPresent()) {
			return tarifaEncontrada.get();
		}
		return null;
	}
	
	
}
