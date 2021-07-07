package ar.edu.unlam.pb2.parcial2;

public class Remera extends Producto implements Indumentaria {

	private String talle;
	private String color;

	public Remera(Integer codigo, String descripcion, String talle, String marca, String color, Double valor) {
		super(codigo, descripcion, marca, valor);
		this.talle = talle;
		this.color = color;
	}
	
	

	@Override
	public String getTalle() {
		return this.talle;
	}



	@Override
	public String getColor() {
		return this.color;
	}

}
