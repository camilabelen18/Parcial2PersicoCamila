package ar.edu.unlam.pb2.parcial2;

public class Carne extends Producto implements Comestible {

	private String fechaElaboracion;
	private String fechaVencimiento;
	private Double kilos;

	public Carne(Integer codigo, String descripcion, String fechaElaboracion, String fechaVencimiento, Double kilos, String marca, Double valor) {
		super(codigo, descripcion, marca, valor);
		this.fechaElaboracion = fechaElaboracion;
		this.fechaVencimiento = fechaVencimiento;
		this.kilos = kilos;
	}

	@Override
	public String getFechaDeElaboracion() {
		return this.fechaElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		return this.fechaVencimiento;
	}

	public Double getKilos() {
		return this.kilos;
	}

}
