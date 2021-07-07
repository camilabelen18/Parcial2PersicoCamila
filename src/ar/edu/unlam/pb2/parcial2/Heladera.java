package ar.edu.unlam.pb2.parcial2;

public class Heladera extends Producto implements Electrodomestico {
	
	private Boolean noFrost;
	private Integer garantia;

	public Heladera(Integer codigo, String descripcion, Boolean noFrost, Integer garantia, String marca, Double valor) {
		super(codigo, descripcion, marca, valor);
		this.noFrost = noFrost;
		this.garantia = garantia;
	}
	
	public Boolean isNoFrost() {
		return this.noFrost;
	}

	
	@Override
	public Integer getGarantia() {
		return this.garantia;
	}


	

}
