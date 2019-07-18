import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;

public class Pdf {
	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
		String file_name = "/home/laserarjun/lasertech.pdf";
		Document document = new Document();

		PdfWriter.getInstance(document, new FileOutputStream(file_name));
		Font font1 = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLDITALIC);
		Font font2 = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLDITALIC | Font.UNDERLINE);
		Font font3 = new Font(Font.FontFamily.HELVETICA, 12, Font.ITALIC);
		document.open();
		Image img = Image.getInstance("/home/laserarjun/Desktop/photo.gif");
		img.setAlignment(Image.MIDDLE);
		document.add(img);

		Paragraph para = new Paragraph();
		Chunk glue = new Chunk(new VerticalPositionMark());
		para.add(new Chunk("                                           LASER INFORMATION & TECHNOLOGY ", font1));
		para.add(new Chunk(glue));
		para.add(new Chunk("OPEN ", font1));
		para.add(new Paragraph(" "));
		para.add(new Chunk("Job Information ", font2));
		para.add(new Paragraph(" "));
		para.add(new Chunk("Client PO# : N/A",font3));
		para.add(new Chunk(glue));
		para.add(new Chunk("Date :   Thrusday, July 18,2019",font3));
		para.add(new Paragraph(""));
		para.add(new Chunk("Job ID : GC-120",font3));
		para.add(new Chunk(glue));
		para.add(new Chunk("Customer : Genereal Technocratic Society",font3));
		para.add(new Paragraph(""));
		para.add(new Chunk("Job Name : Software Developer ",font1));
		para.add(new Chunk(glue));
		para.add(new Chunk("Job Address : Chabahil , Kathmandu",font3));
		para.add(new Paragraph(""));
		para.add(new Chunk("Bill to : Arjun Gautam ",font3));
		para.add(new Paragraph(" "));
		para.add(new Chunk("Description ", font2));
		para.add(new Paragraph(" "));
		para.add("Laser Information Company is looking for a Software Developer havaing good knowledge on "
				+ "Java ,Spring ,Hibernate and Database like Oracle and Mysql ,MongoDB as well as Well known with"
				+ " front end tools like HTML ,CSS and with little bit knowledge of Javascript. ");

		para.add(new Paragraph(" "));

		para.add(new Chunk("Time and Material", font2));
		para.add(new Paragraph(""));
		para.add(new Chunk("                Regular Hours : ", font1));
		// para.add(new Chunk(glue));
		para.add("Rs.2000");
		document.add(para);
		document.add(new Paragraph(" "));
		PdfPTable table = new PdfPTable(5);
		PdfPCell c1 = new PdfPCell(new Phrase(new Chunk("Labor", font1)));
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase(new Chunk("#", font1)));
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase(new Chunk("Hours", font1)));
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase(new Chunk("Rate ", font1)));
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase(new Chunk("Total", font1)));
		table.addCell(c1);

		table.addCell("Developer");
		table.addCell("GC-1");
		table.addCell("50.00");
		table.addCell("Rs.1000");
		table.addCell("Rs.50000");

		table.addCell("Tester");
		table.addCell("GC-2");
		table.addCell("100.00");
		table.addCell("Rs.1000");
		table.addCell("Rs.100000");
		document.add(table);

		Paragraph para1 = new Paragraph();

		para1.add(new Chunk("                Overtime Hours : ", font1));
		para1.add("Rs.2000");
		para1.add(new Paragraph(" "));
		document.add(para1);

		PdfPTable table1 = new PdfPTable(5);
		PdfPCell c11 = new PdfPCell(new Phrase(new Chunk("Labor", font1)));
		table1.addCell(c11);

		c11 = new PdfPCell(new Phrase(new Chunk("#", font1)));
		table1.addCell(c11);

		c11 = new PdfPCell(new Phrase(new Chunk("Hours", font1)));
		table1.addCell(c11);

		c11 = new PdfPCell(new Phrase(new Chunk("Rate ", font1)));
		table1.addCell(c11);

		c11 = new PdfPCell(new Phrase(new Chunk("Total", font1)));
		table1.addCell(c11);

		table1.addCell("Developer");
		table1.addCell("GC-1");
		table1.addCell("50.00");
		table1.addCell("Rs.1000");
		table1.addCell("Rs.50000");

		table1.addCell("Tester");
		table1.addCell("GC-2");
		table1.addCell("100.00");
		table1.addCell("Rs.1000");
		table1.addCell("Rs.100000");
		document.add(table1);

		Paragraph para2 = new Paragraph();

		para2.add(new Chunk("                Material/Equipment/Subcontractor  : ", font1));
		para2.add(new Paragraph(" "));
		document.add(para2);

		PdfPTable table11 = new PdfPTable(4);
		PdfPCell c111 = new PdfPCell(new Phrase(new Chunk("Item", font1)));
		table11.addCell(c111);

		c111 = new PdfPCell(new Phrase(new Chunk("Quantity", font1)));
		table11.addCell(c111);

		c111 = new PdfPCell(new Phrase(new Chunk("Unit Price", font1)));
		table11.addCell(c111);

		c111 = new PdfPCell(new Phrase(new Chunk("Total", font1)));
		table11.addCell(c111);

		table11.addCell("Paint");
		table11.addCell("50 Gal");
		table11.addCell("Rs.100");
		table11.addCell("Rs.5000");

		table11.addCell("Paint");
		table11.addCell("50 Gal");
		table11.addCell("Rs.100");
		table11.addCell("Rs.5000");
		document.add(table11);

		Paragraph para3 = new Paragraph();
		para3.add(new Paragraph(" "));
		document.add(para3);
		PdfPTable table3 = new PdfPTable(2);

		PdfPCell c3 = new PdfPCell(new Phrase(new Chunk("Total", font1)));
		table3.addCell(c3);

		c3 = new PdfPCell(new Phrase("Rs.640"));
		table3.addCell(c3);

		table3.addCell("MarkUp(15.0%)");
		table3.addCell("Rs.2000");
		table3.addCell("Grand Total");
		table3.addCell("Rs.740");
		table3.setHorizontalAlignment(Element.ALIGN_RIGHT);
		document.add(table3);

		Paragraph para4 = new Paragraph();
		para4.add(new Paragraph(""));
		para4.add(new Chunk("Authorization for Work and Payment ", font2));
		para4.add(new Paragraph(" "));
		para4.add(new Chunk("Arjun Gautam",font3));
		para4.add(new Paragraph(" "));
		para4.add(new Chunk("CEO ,Laser Information Technology",font1));
		Chunk glue1 = new Chunk(new VerticalPositionMark());
		para4.add(new Chunk(glue1));

		para4.add(new Chunk("Signature",font1));
		para4.add(new Chunk("                   ", font2));

		/*
		 * para4.add(new Paragraph("")); para4.add("Notes:");
		 * 
		 * para4.add(new Paragraph("")); para4.
		 * add("PAYMENT SCHEDULE:Payment will be due 10 days from date of invoice .");
		 */
		document.add(para4);

		System.out.println("Pdf Created Successfully with Table");

		document.close();

	}
}
