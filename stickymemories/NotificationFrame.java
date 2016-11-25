
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NotificationFrame extends JFrame{
    private NotificationPanel notificationPanel;
    
    public NotificationFrame(String filePath) throws IOException{
        super();
        
        notificationPanel = new NotificationPanel(filePath);
        notificationPanel.setLayout(new BorderLayout());
        add(notificationPanel, BorderLayout.CENTER);
        
        
        
        
        setLayout(new BorderLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }
    
}


