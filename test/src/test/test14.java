package test;
import com.adobe.acrobat.*;
import java.awt.*;
import java.io.*; 
	import java.applet.*;
	import java.awt.*;
	import java.net.URL;
	
	public class test14  extends Applet {
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

		// insert any code to be run when the applet starts here
		try {
			URL url = new URL( "C://Users/user1/Desktop/GIS\\file.pdf" );
			this.getAppletContext().showDocument( url, "_blank" );
		} catch (Exception e) {
			System.err.println( "Error: Could not display PDF document!" );
		}
	}
}
