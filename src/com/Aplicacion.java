package com;

import com.clases.TiendaElectronica;
import com.clases.Televisor;
import com.clases.ComputadoraPortatil;

public class Aplicacion {

	public static void main(String[] args) {
		TiendaElectronica tienda = new TiendaElectronica();

        Televisor televisor1 = new Televisor("Televisor Samsung", 440000.0, 10, 55, "4K");
        ComputadoraPortatil laptop1 = new ComputadoraPortatil("Notebook Asus", 380000.0, 5, "Asus", 16, 12345678);

        tienda.agregarProducto(televisor1);
        tienda.agregarProducto(laptop1);

        tienda.mostrarInventario();
        tienda.realizarVenta("Televisor Samsung");
        tienda.mostrarInventario();
	}

}
