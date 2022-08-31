package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
            	Student Stefano_Graziabile = new Student(134588,"Graziabile","Stéfano","sgraziabile@gmail.com",
            			"https://github.com/sgraziabile",
            			"https://argentinaestudia.com/wp-content/uploads/2021/06/Logo_UNS.png");
            	new SimplePresentationScreen(Stefano_Graziabile);
            	}catch(Exception e) {
            		e.printStackTrace();
            	}
            }
        });
    }
}