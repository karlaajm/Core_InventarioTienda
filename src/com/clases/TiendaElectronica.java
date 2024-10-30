package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	private ArrayList<ProductoElectrodomestico> listaDeProductos;

	public TiendaElectronica() {
		this.listaDeProductos = new ArrayList<ProductoElectrodomestico>();
	}
	
	public ArrayList<ProductoElectrodomestico> getProductos(){
        return listaDeProductos;
    }

    public void setProductos(ArrayList<ProductoElectrodomestico> listaDeProductos){
        this.listaDeProductos = listaDeProductos;
    }
	
	public void agregarProducto(ProductoElectrodomestico item){
		listaDeProductos.add(item);
	}
	
	public void mostrarInventario() {
		for (ProductoElectrodomestico item : listaDeProductos) {
			item.mostrarInformacion();
		}
	}
	
	public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }
	
	public void realizarVenta(String nombre) {
        ProductoElectrodomestico producto = buscarProductoPorNombre(nombre);
        if (producto != null) {
            if (producto.getCantidadDisponible() > 0) {
                producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
                System.out.println("Venta realizada. Quedan " + producto.getCantidadDisponible() + " unidades de " + nombre);
            } else {
                System.out.println("Producto agotado");
            }
        } else {
            System.out.println("Producto no encontrado en el inventario");
        }
    }
}
