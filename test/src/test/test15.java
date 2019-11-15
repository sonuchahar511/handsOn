package test;

import java.applet.Applet;

import java.awt.*; 
import java.io.*;

import com.adobe.acrobat.PDFBookmark;
import com.adobe.acrobat.Viewer;
import com.adobe.acrobat.ViewerCommand; 

public class test15 extends Applet {

	public void start() {
		super.start();
		
		Frame frame = new Frame("PDF Viewer");
		frame.setLayout(new BorderLayout());
		try
		{
		Viewer viewer = new Viewer();
		frame.add(viewer, BorderLayout.CENTER);

InputStream input = new FileInputStream (new File( "C:/Users/user1/Desktop/file.pdf")); 
viewer.setDocumentInputStream(input);

viewer.setProperty("Default_Page_Layout", "SinglePage");
viewer.setProperty("Default_Zoom_Type", "FitPage"); 
viewer.setProperty("Default_Magnification", "100"); 


System.out.println("Page Count: "+viewer.getPageCount());
System.out.println("Current Page: "+viewer.getCurrentPage()); 
/*viewer.zoomTo(1.0);*/
viewer.activate();
frame.setSize(400, 500); 
frame.pack();
frame.setVisible(true);

/*viewer.execMenuItem(ViewerCommand.ZoomTo_K);*/
String[] dis = {ViewerCommand.Open_K, ViewerCommand.OpenURL_K};
Viewer vw = new Viewer(dis);
Viewer v1; 
PDFBookmark rootBookmark=viewer.getRootBookmark(); 

java.util.Vector pdfBookmarks=rootBookmark.getBookmarks(); 

		

PDFBookmark bookmark=null;
java.lang.String title=bookmark.getTitle(); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
