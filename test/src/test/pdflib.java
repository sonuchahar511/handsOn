package test;

	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.OutputStream;
	import java.util.Date;


	public class pdflib {

		public static void main(String[] args) {
			try {
				OutputStream file = new FileOutputStream(new File("D:\\Test.pdf"));

				/*Document document = new Document();
				PdfWriter.getInstance(document, file);
*/
				/*document.open();
				document.add(new Paragraph("Hello World, iText"));
				document.add(new Paragraph(new Date().toString()));

				document.close();*/
				file.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

