package ar.edu.unlam.pb2.parcial2;

public class Venta {

	private Integer numeroVenta;
	private Integer dniDelComprador;
	private String nombreDelComprador;

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprador  = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
		this.numeroVenta = 0;
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

	public Integer getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(Integer numeroVenta) {
		this.numeroVenta = numeroVenta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroVenta == null) ? 0 : numeroVenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		if (numeroVenta == null) {
			if (other.numeroVenta != null)
				return false;
		} else if (!numeroVenta.equals(other.numeroVenta))
			return false;
		return true;
	}


	
	
	

}
