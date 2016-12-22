package gerarpdf;

import java.io.FileNotFoundException;

import loja.Pedido;
import loja.Produto;

public class GerenciadorPedido {
	
	

	public static void imprimir(Pedido pedido){
		
		
		
		
		System.out.println();
		System.out.println("<<<<<<DETALHES DO PEDIDO>>>>>>");
	
		
		System.out.println("CodigoPedido: "+pedido.getCodigoPedido());
	
		
		pedido.getCarrinho().listarCarrinho();
		System.out.println("Frete: R$ "+ pedido.getFrete().calculaFrete1(pedido.getCarrinho()));
		 System.out.println("Total a pagar: R$ "+pedido.getCarrinho().getTotal());	
		 System.out.println();
		
		pedido.getCliente().detalhesCliente();

		
		
		try {
			GerarPFD.geradoPdf(pedido);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
			
		
	

		
		
	}

}
