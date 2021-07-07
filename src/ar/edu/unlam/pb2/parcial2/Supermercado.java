package ar.edu.unlam.pb2.parcial2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n�mero de venta)
	Integer contadorDeVentas; // Identificador del n�mero de venta
	
	public Supermercado(String nombre) {
		this.nombre = nombre;
		this.productosExistentes = new HashSet <Producto>();
		this.productosDisponibles = new ArrayList<Producto>();
		this.ventasRealizadas = new HashMap<Integer,Venta>();
		this.contadorDeVentas = 0;
	}

	public void ingresarProducto(Producto nuevo) {
		this.productosDisponibles.add(nuevo);
		
		if(!this.productosExistentes.contains(nuevo)) {
			this.productosExistentes.add(nuevo);
		}
		
	}

	public Set<Producto> getOfertaDeProductos() {
		return this.productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		Integer cantidadDeProductos = 0;
		for (Producto producto : productosDisponibles) {
			if(producto.getCodigo().equals(codigo)) {
				cantidadDeProductos ++;
			}
		}
		
		return cantidadDeProductos;
	}


	
	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		// Verifica si un producto existe
		for (Producto producto : productosExistentes) {
			if(producto.getCodigo().equals(codigoDeProducto)) {
				return true;
			}
		}
		
		throw new ProductoInexistente();
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		for (Producto producto : productosDisponibles) {
			if(producto.getCodigo().equals(codigoDeProducto))
				return producto;
		}
		
		throw new ProductoSinStock();
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
	
	public Venta getVenta(Integer numeroDeVenta) {
		// Devuelve una venta en funci�n de su n�mero identificatorio
		
		return this.ventasRealizadas.get(numeroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"

		productoExiste(codigoDeProducto);
		
		if(getStock(codigoDeProducto)==0)
			throw new ProductoSinStock();
		
		this.ventasRealizadas.put(numeroDeVenta, getVenta(numeroDeVenta));
		
	}

	public Integer obtenerProductosComestibles() {
		Integer cantidadDeProductos = 0;
		for (Producto producto : productosDisponibles) {
			if(producto instanceof Comestible) {
				cantidadDeProductos++;
			}
		}
		return cantidadDeProductos;
	}
	

}
