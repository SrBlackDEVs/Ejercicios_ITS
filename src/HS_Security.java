import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class HS_Security {
    public static void main(String[] args) throws Exception {
        
    }
}
/**
 * GUI
 * Create the GUI for the program
 */
class a {
    private static Font ComicSans = new Font("Comic Samns MS", Font.PLAIN, 14);

    private static JFrame window = new JFrame();

    private static JTextField ciField = new JTextField(1);
    private static JLabel ciIdentifier = new JLabel("Client CI:");

    private static JTextField clientField = new JTextField(1);
    private static JLabel clientIdentifier = new JLabel("Client name:");

    private static JSpinner roomJSpinner = new JSpinner();
    private static JLabel roomIdentifier = new JLabel("Room count:");

    public static ArrayList<String> values = new ArrayList<String>();

    /**
     * @return A JFrame to set it to visible
     */
    public static JFrame Window(){
        // Setting the window
        window.setResizable(false);

        window.setTitle("HS Security"); // The name I invented to my company "HomeSecurity"
        window.setFont(ComicSans); // I hate this Font :). I want to use Cascadia Code
        window.setIconImage(Toolkit.getDefaultToolkit().getImage("recurs/HSSecurity_Logo.png"));
        
        window.setSize(Toolkit.getDefaultToolkit().getScreenSize()); // Adapt the window to the size of the screen
        window.setLayout(null); // I use the absolute layout because the others layouts are boring
        window.setDefaultCloseOperation(0); // The value 0 is equivalent to the constant JFrame.DO_NOTHING_ON_CLOSE


        // Set labels for
        ciIdentifier.setLabelFor(ciField);
        clientIdentifier.setLabelFor(clientField);
        roomIdentifier.setLabelFor(roomIdentifier);

        // 

        // Add all components to the window
        window.add(ciField);
        window.add(clientField);
        window.add(roomJSpinner);
        // IMPORTANT it´s better to add first the components that interacture with the user to evitate bugs drawing the window
        window.add(ciIdentifier);
        window.add(clientIdentifier);
        window.add(roomIdentifier);



        return window; // I do this because I want to show the window after draw all the objects to evitate bugs
    }
    
}
class Calcs {
    /**
     * @param percentage A value between 1-100
     * @param value The number to calculate the percentage
     * 
     * @return An int with the percentage. -1 if there are an error
     */
    public static int Percentage(int percentage, int value) {
        if (percentage <= 0 && percentage > 100) {
            percentage = percentage * 100;
            int aux = percentage / value;
            System.out.println(aux);

            return value;
        }
        else {
            return -1;
        }

    }

    /**
     * 
     * @param value The number to calculate the I.V.A
     * @return The value but with the I.V.A
     */
    public static int Iva(int value) {
        return Percentage(22, value);

    }
    /**
     * @param percentage A value between 1-100
     * @param value The number to calculate the percentage
     * 
     * @return An int with the descont. -1 if there are an error
     */
    public static int Descont(int percentage, int value) {
        return value - Percentage(percentage, value);
    
    }

    /**
     * @param percentage A value between 1-100
     * @param value The number to calculate the percentage
     * 
     * @return An int with the aument. -1 if there are an error
     */
    public static int Aument(int percentage, int value) {
        return value + Percentage(percentage, value);
    }

    /**
     * 
     * @param total An array with all the elements to do the sum of the total
     * @return The total value
     */
    public static int Total(int[] total) {
        int SumTotal = 0;

        for (int i = 0; i < total.length; i++) {
            SumTotal = SumTotal + total[i];
        }
        return SumTotal;
    }
    public static int Total(ArrayList<Integer> total) {
        int SumTotal = 0;

        for (int i = 0; i < total.size(); i++) {
            SumTotal = SumTotal + total.get(i);
        }
        return SumTotal;

    }
}
