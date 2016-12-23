package gerarpdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;

import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import gerarcodigobarras.GeraCodigoBarras;
import loja.Pedido;
import loja.Produto;





public class GerarPFD {
	

	public static void geradoPdf(Pedido pedido) throws FileNotFoundException {
		
		
	
	
		Document document= new Document(PageSize.A4,20,20,20,20);
	
		
		try{
			
			
			String nomeDocumento= pedido.getCodigoPedido();
			PdfWriter writer= PdfWriter.getInstance(document,new FileOutputStream("E:\\DOUGLAS CURSOS\\Cursos E Projetos\\Analise e Desenvolvimento de Sistemas (DROPBOX)\\JAVA\\workspace\\LojaPdf\\" +nomeDocumento+".pdf"));
			
			
			document.open();
			
	
			/* adicionado paragrafo no documento
			 document.addSubject("Programador Java");
	          document.addKeywords("www.douglas.com.br");
	          document.addCreator("DOuglas");
	          document.addAuthor("Douglas de JEsus Fonseca");
	          document.addTitle("Meu Livro JAva");*/
	          
		
			
			Font ftitulo= new Font(FontFamily.COURIER,30,Font.BOLD);
			Font fcliente= new Font(FontFamily.TIMES_ROMAN,15,Font.BOLD);
			Font fdados= new Font(FontFamily.TIMES_ROMAN,13,Font.NORMAL);
			
			
			Paragraph titulo= new Paragraph("ATACADAO DE ROUPAS",ftitulo);
			titulo.setAlignment(Element.ALIGN_CENTER);
			titulo.setSpacingAfter(30);
			
			document.add(titulo);
			
			
			Paragraph pedidoDados= new Paragraph("Pedido: "+pedido.getCodigoPedido(),fcliente);
			pedidoDados.setAlignment(Element.ALIGN_LEFT);
			pedidoDados.setSpacingAfter(5);
			
			document.add(pedidoDados);
			
			
			Paragraph cliente= new Paragraph("Cliente:",fcliente);
			cliente.setAlignment(Element.ALIGN_LEFT);
			cliente.setSpacingAfter(5);
			
			document.add(cliente);
			
			Paragraph nome= new Paragraph("Nome: "+pedido.getCliente().getNome(),fdados);
			nome.setAlignment(Element.ALIGN_LEFT);
			nome.setSpacingAfter(1);
			document.add(nome);
			
			Paragraph cpf= new Paragraph("CPF: "+pedido.getCliente().getCpf(),fdados);
			cpf.setAlignment(Element.ALIGN_LEFT);
			cpf.setSpacingAfter(10);
			document.add(cpf);
			
			
			
	
			
			PdfPTable produtos=new PdfPTable(3);
			produtos.setHorizontalAlignment(Element.ALIGN_LEFT);
			produtos.setWidthPercentage(60.0f);
			
			PdfPCell header= new PdfPCell(new Paragraph("Carrinho"));
			header.setBackgroundColor(BaseColor.YELLOW);
			header.setHorizontalAlignment(Element.ALIGN_CENTER);
			header.setColspan(3);
			produtos.addCell(header);
			
			
		PdfPCell codigoProduto= new PdfPCell(new Phrase("Codigo",fdados));
			codigoProduto.setHorizontalAlignment(Element.ALIGN_LEFT);
			codigoProduto.setBackgroundColor(BaseColor.WHITE);
			 produtos.addCell(codigoProduto);
			 
			 
			 
			 codigoProduto= new PdfPCell(new Phrase("Nome",fdados));
			 codigoProduto.setHorizontalAlignment(Element.ALIGN_LEFT);
			 codigoProduto.setBackgroundColor(BaseColor.WHITE);
			 produtos.addCell(codigoProduto);
			 
			 
			 codigoProduto= new PdfPCell(new Phrase("Preço",fdados));
			 codigoProduto.setHorizontalAlignment(Element.ALIGN_LEFT);;
			 codigoProduto.setBackgroundColor(BaseColor.WHITE);
			 produtos.addCell(codigoProduto);
			
			 
			   for(Produto prod:pedido.getCarrinho().getProdutos()){
				   produtos.addCell(Integer.toString (prod.getCodigo()));
				   produtos.addCell(prod.getNome());
				   produtos.addCell("R$"+Double.toString(prod.getPreco())+"0");
			   }
	       
			   produtos.setSpacingAfter(30);
				 Paragraph frete= new Paragraph("Frete: R$"+pedido.getCarrinho().getValorFrete()+"0",fdados);
				 Paragraph total= new Paragraph("Total: R$"+pedido.getCarrinho().getTotal()+"0",fdados);
				 
				 total.setSpacingAfter(50);
			   
			 document.add(produtos);
			 document.add(frete);
			 document.add(total);
			
			 
			 PdfContentByte cb = writer.getDirectContent();
			 BarcodeEAN codeEAN = new BarcodeEAN();
			 codeEAN.setCodeType(codeEAN.EAN13);
			 codeEAN.setCode("12316543216561");
			 
			 
			 Paragraph codigobarra= new Paragraph("Codigo Barras Prouto");
			 
			 Image imageEAN = codeEAN.createImageWithBarcode(cb,null, null);
				document.add(new Phrase(new Chunk(imageEAN, 0, 0)));
			 
			
			 
			
			 
	          
	        
	          System.out.println("Criado Com sucesso");
			
		}catch(DocumentException e){
			 System.err.println(e.getMessage());
		}catch(IOException ioe) {
	           System.err.println(ioe.getMessage());
	       }
		
		document.close();
	

	}

}
