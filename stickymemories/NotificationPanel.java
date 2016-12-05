
package stickymemories;

import stickymemories.core.Resources;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class NotificationPanel extends JPanel{
    private static Image background;
    
    
    public NotificationPanel(String filePath) throws IOException {
        background = ImageIO.read(Resources.getResourceFile(filePath));
    }
    
    
    
    @Override
    public void paintComponent(Graphics g){      
        super.paintComponent(g);
        
        if(background != null){
            g.drawImage(background, 0, 0, this.getWidth() , this.getHeight() , this);
        }else{
            System.err.println(" imagem == null");
        }
    }
}
