import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;       


public class WCSChecker {
	

	String name; 
	
	public static final int WIDTH = 1200;
	public static final int HEIGHT = 800;
	


    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	Base ui = new Base(WIDTH, HEIGHT);
            public void run() {
                ui.show();
            }
        });

    }

}
