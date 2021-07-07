package ar.edu.unlam.pb2.parcial2;

public class Galletitas extends Producto implements Comestible {

	private String fechaElaboracion;
	private String fechaVencimiento;

	public Galletitas(Integer codigo, String descripcion,String fechaElaboracion, String fechaVencimiento, String marca, Double valor) {
		super(codigo, descripcion, marca, valor);
		this.fechaElaboracion = fechaElaboracion;
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String getFechaDeElaboracion() {
		return this.fechaElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		return this.fechaVencimiento;
	}
	
	



}
