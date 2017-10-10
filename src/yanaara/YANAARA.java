/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yanaara;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author student
 */

public class YANAARA extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        YANAARA frame = new YANAARA();
        frame.setSize(600, 400);
        frame.setTitle("YANAARA");
        frame.createGUI();
        frame.show();
    }
    
    public void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );
    }
    
}
