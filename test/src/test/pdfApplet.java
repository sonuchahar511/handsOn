package test;

	import java.applet.*;
	import java.awt.*;
	import java.net.URL;
	
	public class pdfApplet extends Applet {
		
		private static final long serialVersionUID = 1L;
		Font font = new Font("Dialog", Font.BOLD, 24);
		String str = "PDF Viewer";
		int xPos = 5;
	
	public String getAppletInfo() {
		return "PDFViewer\n" + 
			"\n" + 
			"This type was created in VisualAge.\n" + 
			"";
	}
	
	public void paint(Graphics g) {
		g.setFont(font);
		g.setColor(Color.black);
		g.drawString(str, xPos, 50);
	}
	
	public void start() {
		super.start();

		
		try {
			URL url = new URL( "C:/Users/user1/Desktop/file.pdf" );
			this.getAppletContext().showDocument( url, "_blank" );
		} catch (Exception e) {
			System.err.println( "Error: Could not display PDF document!" );
		}
	}

}
