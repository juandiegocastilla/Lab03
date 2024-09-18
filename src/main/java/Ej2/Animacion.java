/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

import java.awt.BorderLayout;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author juand
 */
public class Animacion {
    
    private static int Indice = 0;  
    private static JLabel label; 
    private static JSlider slider ;
     private static ImageIcon[] imagenes;
    private static Timer timer;           
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Mostrar Imágenes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        
        String[] images = {
            "src/main/resources/man1.png",
            "src/main/resources/man2.png",
            "src/main/resources/man3.png",
            "src/main/resources/man4.png","src/main/resources/man5.png","src/main/resources/man6.png","src/main/resources/man7.png","src/main/resources/man8.png"};
        

       
       imagenes = new ImageIcon[images.length];
        for (int i = 0; i < images.length; i++) {
            imagenes[i] = new ImageIcon(images[i]);
        }
        label= new JLabel();
          label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        frame.add(label, BorderLayout.CENTER);
        
        slider = new JSlider(1,10,2);
        slider.setMajorTickSpacing(1);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setToolTipText("Velocidad");
        
        JPanel panel= new JPanel();
}
private static void cambiarImagen() {
        if (imagenes.length > 0) {
            label.setIcon(imagenes[Indice]);
            Indice = (Indice + 1) % imagenes.length;

}}}
