/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author juand
 */
public class Animacion {
    
    private static int Indice = 0;  
    private static JLabel label;          
    private static ImageIcon[] imagenes; 
    private static Timer timer;           
    public static void main(String[] args) {
        // Crear el marco
        JFrame frame = new JFrame("Mostrar Imágenes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Ruta relativa de las imágenes
        String[] images = {
            "src/main/resources/man1.png",
            "src/main/resources/man2.png",
            "src/main/resources/man3.png",
            "src/main/resources/man4.png","src/main/resources/man5.png","src/main/resources/man6.png","src/main/resources/man7.png","src/main/resources/man8.png"};
        

        // Cargar imágenes en un arreglo de ImageIcon
       imagenes = new ImageIcon[images.length];
        for (int i = 0; i < images.length; i++) {
            imagenes[i] = new ImageIcon(images[i]);
           
            
        }
}}
