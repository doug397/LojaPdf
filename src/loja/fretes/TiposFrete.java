package loja.fretes;

public enum TiposFrete {
	
	ECONOMICA("Econômica",19), BASICA("Básica",22), SEDEX("Sedex",25);
	
	private String titulo;
	private double valor;
	
	
	/*Construtor do Tipo enumm*/
	TiposFrete(String titulo, double valor){
		this.setTitulo(titulo);
		this.setValor(valor);
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
