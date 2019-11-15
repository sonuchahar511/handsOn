package test;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

public class ActionListnerclass  extends Applet implements ActionListener{
	 
	        String actionMessage="";
	        File f;
	       
	        public void init(){
	                //create Buttons
	                Button Button1 = new Button("Ok");
	                Button Button2 = new Button("Cancel");
	               
	                //add Buttons
	                add(Button1);
	                add(Button2);
	               
	                //set action listeners for buttons
	                Button1.addActionListener(this);
	                Button2.addActionListener(this);
	        }
	       
	        public void paint(Graphics g){
	                g.drawString(actionMessage,10,50);
	        }
	       
	        public void actionPerformed(ActionEvent ae){
	               
	                String action = ae.getActionCommand();
	               
	               
					if(action.equals("Ok"))
	                	
	               f  = new File("my-document-filename.pdf");
	                FileOutputStream fos = new FileOutputStream(f);
	                fos.write(content);
	                fos.close();

	                // Open the file
	                Desktop.getDesktop().open(new File("my-document-filename.pdf"));
	                	/*try {
	            			URL url = new URL( "C:/Users/user1/Desktop/file.pdf" );
	            			this.getAppletContext().showDocument( url, "_blank" );
	            		} catch (Exception e) {
	            			System.err.println( "Error: Could not display PDF document!" );
	            		}*/
	                
	                        actionMessage = "Ok Button Pressed";
	                	
	                else if(action.equals("Cancel"))
	                        actionMessage = "Cancel Button Pressed";
	               
	                repaint();
	        }
	}


