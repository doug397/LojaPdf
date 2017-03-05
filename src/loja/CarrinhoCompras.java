package loja;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	
	
	private double total=0.0;
    private double valorFrete=0.0;

	public double getValorFrete() {
	return valorFrete;
}

public void setValorFrete(double valorFrete) {
	this.valorFrete = valorFrete;
}

	private List<Produto> produtos= new ArrayList<>();
	
	
	public List<Produto> adicionar(Produto produto){
			produtos.add(produto);
			return produtos;
	}
	
	public void listarCarrinho(){
		
		
		System.out.println("---Lista de Produtos---");
		
		for(Produto produto: produtos){
			System.out.println(produto.getNome());
			
			total+=produto.getPreco();
		}
	
		
		
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}




	
	

	
	

}
