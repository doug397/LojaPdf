package loja;

import java.util.Date;

import loja.fretes.CalculaFrete;

public class Pedido {
	
	private String codigoPedido;
	private Cliente cliente;
	private CarrinhoCompras carrinho;
	private CalculaFrete frete;
	private Date dataPedido;
	
	
	
	
	public Pedido(String codigoPedido,Cliente cliente,CarrinhoCompras carrinho, CalculaFrete frete){
		this.codigoPedido=codigoPedido;
		this.cliente=cliente;
		this.carrinho=carrinho;
		this.frete=frete;
		
		
	}
	
	
	public String getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public CarrinhoCompras getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(CarrinhoCompras carrinho) {
		this.carrinho = carrinho;
	}
	public CalculaFrete getFrete() {
		return frete;
	}
	public void setFrete(CalculaFrete frete) {
		this.frete = frete;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}


	

}
