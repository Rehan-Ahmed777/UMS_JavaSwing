package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame implements Runnable {
    
    Thread t;
    
    Main() {
        // Load and scale the image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        // Set JFrame properties for fixed size and location
        setSize(1920, 1080); // Fixed size
        setLocation(0,0); // Fixed location
        setVisible(true);
        
        // Start the thread
        t = new Thread(this);
        t.start();
    }
    
    public void run() {
        try {
            Thread.sleep(7000);
            //setVisible(false);  
            
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
