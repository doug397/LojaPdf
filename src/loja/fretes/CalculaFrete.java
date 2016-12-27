package loja.fretes;

import java.util.List;

import loja.CarrinhoCompras;

public  class CalculaFrete implements Frete {
	

	
	@Override
	public double calculaFrete1(CarrinhoCompras carrinho) {
		
		
		if(carrinho.getProdutos().size()<=3){
			carrinho.setTotal(carrinho.getTotal()+TiposFrete.BASICA.getValor());
			
		
			carrinho.setValorFrete(TiposFrete.BASICA.getValor());
			return TiposFrete.BASICA.getValor();
			
		}else 
			if(carrinho.getProdutos().size()>3 && carrinho.getProdutos().size()<=5){
				carrinho.setTotal(carrinho.getTotal()+TiposFrete.ECONOMICA.getValor());
				
				carrinho.setValorFrete(TiposFrete.ECONOMICA.getValor());
				return TiposFrete.ECONOMICA.getValor();
		}
			else{
				carrinho.setTotal(carrinho.getTotal()+TiposFrete.SEDEX.getValor());
				carrinho.setValorFrete(TiposFrete.SEDEX.getValor());
				return TiposFrete.SEDEX.getValor();
			}
		
		
	}






	
	
	

}
