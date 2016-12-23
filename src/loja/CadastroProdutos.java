package loja;

import gerarpdf.GerenciadorPedido;
import loja.fretes.CalculaFrete;

public class CadastroProdutos {

	
	public static void main(String[] args){
		
		CalculaFrete frete= new CalculaFrete();
		
		CarrinhoCompras carrinho= new CarrinhoCompras();
		Cliente cliente= new Cliente("Douglas de JEsus FOnseca","065383929");
		
		GerenciadorPedido gerarPedido= new GerenciadorPedido();
		
		
		Produto camisa=new Produto(212,"Camisa Polo", 30);
		Produto calca= new Produto(33,"Jeans",80);
		Produto sapato= new Produto(12,"Olimpicos",200);
		Produto meia= new Produto(45,"Raid",2);
		Produto camiseta= new Produto(22,"Calvin Klain",39);
		Produto caneta= new Produto(322,"FaberCastel",1);
		
		carrinho.adicionar(camiseta);
		carrinho.adicionar(meia);
		carrinho.adicionar(sapato);
		carrinho.adicionar(calca);
		carrinho.adicionar(camisa);
		carrinho.adicionar(caneta);
		
		
		
	
	
		
		
		Pedido pedido= new Pedido("ADERFV",cliente,carrinho,frete );
	

	
		gerarPedido.imprimir(pedido);
		

		
	
		
	
		
	}
}

