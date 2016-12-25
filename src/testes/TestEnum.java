package testes;

import loja.fretes.TiposFrete;

public class TestEnum {
	
	
	public static void main(String[] args){
		System.out.println(TiposFrete.BASICA);
		System.out.println(TiposFrete.ECONOMICA);
		System.out.println(TiposFrete.SEDEX);
		System.out.println();
		
		System.out.println(TiposFrete.BASICA.getTitulo());
		
		
		for(TiposFrete tp: TiposFrete.values()){
			System.out.println(tp +":"+ tp.getTitulo());
		}
		
		
		
		double pegavalor= TiposFrete.BASICA.getValor();
		
		System.out.println("Valor do Basico"+pegavalor);
	}
}
