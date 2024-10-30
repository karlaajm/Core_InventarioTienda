package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
	private String marca;
	private int memoriaRAM;
	private int numerSerie;
	
	public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, int memoriaRAM,
			int numerSerie) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.numerSerie = numerSerie;
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Marca: " + this.marca + ", Memoria RAM: " + this.memoriaRAM + ", Número de Serie: " + this.numerSerie);
	}
}
