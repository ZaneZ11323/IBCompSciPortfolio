package Project3;
import javax.swing.*;

public class Main {
public static void main(String [] args){

            JFrame window = new JFrame("Skyber");
            window.setBounds(100, 100, 200, 400);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.getContentPane().add(new Game());
            window.setVisible(true);
        }
    }

