/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author USUARIO
 */
public class VentanaPrincipal extends JFrame
{
    public ImageIcon iImagen;
    public JLabel lbImagen, prueba;
    public PanelIinvenario miPanelInventario;
    
    public VentanaPrincipal()
    {
        //contenedor de la ventana
        setLayout(null);
        
        
        miPanelInventario = new PanelIinvenario();
        miPanelInventario.setBounds(30, 30, 300, 510);
        miPanelInventario.setBorder(new BevelBorder(BevelBorder.RAISED) );

        add(miPanelInventario);
        
        
        
        String[] ARK1={"/img/fondo1ARK.jpg","/img/fondo2ARK.jpg","/img/fondo3ARK.jpg","/img/fondo4ARK.jpg","/img/fondo5ARK.jpg","/img/fondo6ARK.jpg","/img/fondo7ARK.jpg","/img/fondo8ARK.jpg"};
        iImagen = new ImageIcon(getClass().getResource(ARK1[(int)(Math.random()*8)]));
        lbImagen = new JLabel();
        lbImagen.setBounds(0,0,1000,600);
        Icon icono = new ImageIcon(iImagen.getImage().getScaledInstance(lbImagen.getWidth(), lbImagen.getHeight(), Image.SCALE_DEFAULT));
        lbImagen.setIcon(icono);
        add(lbImagen);
        
        prueba = new JLabel("harver marica");
        prueba.setBounds(100,100,100,40);
        add(prueba);
        
        setTitle("INTERFACE ARK");
        setSize(1000, 600); 
        setLocationRelativeTo(null); 
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false);  
    }
}
