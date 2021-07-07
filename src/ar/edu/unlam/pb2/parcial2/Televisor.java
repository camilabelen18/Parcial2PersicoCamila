package ar.edu.unlam.pb2.parcial2;

public class Televisor extends Producto implements Electrodomestico{

	private Integer pulgadas;
	private Integer garantia;

	public Televisor(Integer codigo, String descripcion, Integer pulgadas, Integer garantia,String marca, Double valor) {
		super(codigo, descripcion, marca, valor);
		this.pulgadas = pulgadas;
		this.garantia = garantia;
	}
	
	public Integer getPulgadas() {
		return this.pulgadas;
	}

	@Override
	public Integer getGarantia() {
		return this.garantia;
	}



}
