package gerarcodigobarras;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

import loja.Pedido;

public class GeraCodigoBarras {
	
	
	
	public  void geraCodigo(Pedido pedido, PdfWriter writer, Document document){
	
		PdfContentByte codigoBarras= writer.getDirectContent();
		
		BarcodeEAN codeEAN= new BarcodeEAN();
		
		codeEAN.setCodeType(codeEAN.EAN13);
		
		
		codeEAN.setCode("1232323233232");
		
		Image imageEAN= codeEAN.createImageWithBarcode(codigoBarras, null, null);
		
		
		try {
			document.add(new Phrase(new Chunk(imageEAN,0,0)));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
			 System.out.println("ERro: "+ e.getMessage());
		}
	
		
	}

}
