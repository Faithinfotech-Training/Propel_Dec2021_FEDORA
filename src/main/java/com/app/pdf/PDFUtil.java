package com.app.pdf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.app.dto.BillPdfDTO;
import com.app.entity.LabTest;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFUtil {
	
	public void generatePdf(int appoinId, BillPdfDTO billPdfDTO) throws FileNotFoundException, DocumentException  {
		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, 
				new FileOutputStream("D:\\FedoraFiles\\"+appoinId+"_billId.pdf"));

		document.open();
		
		document.add(new Paragraph("Patient Name : "+billPdfDTO.getPatientName())); 
		document.add(new Paragraph("Patient ID : "+billPdfDTO.getPatientId())); 
		document.add(new Paragraph("Patient ID : "+billPdfDTO.getAge())); 

		document.add(new Paragraph("Lab Test")); 
		 
	    //Add ordered list
	    List orderedList = new List(List.ORDERED);
	    for (LabTest labtests : billPdfDTO.getLabtestList()) {
		    orderedList.add(new ListItem(labtests.getTestName()+" " +labtests.getPrice()));
		}
	    document.add(orderedList);
	    document.add(new Paragraph("Total Amount  : "+billPdfDTO.getTest_fee())); 

	    document.close();
	    writer.close();
	}
	
	public byte[] getFile(int appoinId) throws IOException {
	    InputStream in = new FileInputStream("D:\\FedoraFiles\\"+appoinId+"_testbill.pdf");
	    return IOUtils.toByteArray(in);
	}

}
