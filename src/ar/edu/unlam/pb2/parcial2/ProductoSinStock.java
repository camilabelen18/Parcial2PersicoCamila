package ar.edu.unlam.pb2.parcial2;

public class ProductoSinStock extends Exception {

	public ProductoSinStock() {
		super("No hay stock del producto");
	}
}
