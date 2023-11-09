/**
 * Aqui planeo poner algo para que objetos cambien de lugar
 * o en casso de no poder hacerlo para que actue como selesctor de skins
 */
package vista;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author USUARIO
 */
public class PanelIinvenario extends JPanel
{
    public JLabel Inventario;
    public PanelIinvenario()
    {
        this.setLayout(null);
        this.setBackground(new Color(0,0,250,150));

        
        Inventario = new JLabel("Inventario",JLabel.CENTER);
        Inventario.setBounds(0,20,300,20);
        add(Inventario);
        
        this.setOpaque(true);
    }
}
