package ar.edu.unlam.pb2.parcial2;

public class Venta {

	private Integer dniDelComprador;
	private String nombreDelComprador;

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprador  = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
	}
	
	public Double getImporte() {
		return 0.0;
	}

	public Integer getDniDelComprador() {
		return dniDelComprador;
	}

	public void setDniDelComprador(Integer dniDelComprador) {
		this.dniDelComprador = dniDelComprador;
	}

	public String getNombreDelComprador() {
		return nombreDelComprador;
	}

	public void setNombreDelComprador(String nombreDelComprador) {
		this.nombreDelComprador = nombreDelComprador;
	}


	
	

}
