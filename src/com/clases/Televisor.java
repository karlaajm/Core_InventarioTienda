package com.clases;

public class Televisor extends ProductoElectrodomestico {

	private int tamanioPantalla;
	private String resolucion;
	
	public Televisor(String nombre, double precio, int cantidadDisponible, int tamanioPantalla, String resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.tamanioPantalla = tamanioPantalla;
		this.resolucion = resolucion;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Tamaño de pantalla: " + this.tamanioPantalla + ", Resolución: " + this.resolucion);
	}
}
