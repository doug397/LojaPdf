package loja;

import loja.descontos.AplicadorDesconto;
import excecoes.CodigoNulloException;
import excecoes.NomeNulloException;

public class Produto implements AplicadorDesconto {
	
	private int codigo;
	private String nome;
	private double preco;
	
	
	public Produto(int codigo,String nome,double preco){
		if(codigo == 0 ){
			
			throw new CodigoNulloException("Codigo nao pode ser igual a 0");
		}
		if(nome==null){
			throw new NomeNulloException("Nome nao pode ser null");
		}
		
		
		this.codigo=codigo;
		this.nome=nome;
		this.preco=preco;
		
		
	}
	
	public void detalhesProdutod(){
		System.out.println("Detalhes do produto");
		System.out.println("Codigo:" +this.getCodigo());
		System.out.println("Nome :"+this.getNome());
		System.out.println("Preço:R$ "+this.getPreco());
	
		
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public double desconto10Porcento() {
		
		double desconto= this.preco*0.1;
		
		this.setPreco(this.getPreco()-desconto);
		
	 
		return desconto;
	}





}
