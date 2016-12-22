package loja.fretes;

import java.util.List;

import loja.CarrinhoCompras;

public  class CalculaFrete implements Frete {
	
	
	public   final double FRETE1= 19.00;
	public   final double FRETE2= 22.00;
	public   final double FRETE3= 25.00;
	
	
	@Override
	public double calculaFrete1(CarrinhoCompras carrinho) {
		
		
		if(carrinho.getProdutos().size()<=3){
			carrinho.setTotal(carrinho.getTotal()+FRETE1);
		
			carrinho.setValorFrete(FRETE1);
			return FRETE1;
			
		}else 
			if(carrinho.getProdutos().size()>3 && carrinho.getProdutos().size()<=5){
				carrinho.setTotal(carrinho.getTotal()+FRETE2);
				
				carrinho.setValorFrete(FRETE2);
				return FRETE2;
		}
			else{
				carrinho.setTotal(carrinho.getTotal()+FRETE3);
				carrinho.setValorFrete(FRETE3);
				return FRETE3;
			}
		
		
	}






	
	
	

}
