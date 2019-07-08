package Utilities;


import java.io.BufferedInputStream;
import java.io.IOException;

import java.net.URL;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;



public class PDFReader {
	public static WebDriver Driver;
	
public static void verifyPDFContent(WebDriver Driver,String reqTextInPDF) throws IOException {
	String getURL = Driver.getCurrentUrl();
//	PDDocument doc=null ;
//	BufferedInputStream file=null;
	String output=null;
	URL urlOfPdf = new URL(getURL);
	BufferedInputStream fileToParse = new BufferedInputStream(urlOfPdf.openStream());
	PDDocument document = PDDocument.load(fileToParse);
	output = new PDFTextStripper().getText(document);
	System.out.println("output-" +output);
	Assert.assertTrue(output.contains(reqTextInPDF)==true);
		

}


}
