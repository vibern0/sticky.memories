
package stickymemories;

import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author bernardovieira
 */
public class SystemNotifications
{
    private final OsCheck.OSType ostype;
    
    public SystemNotifications(OsCheck.OSType ostype)
    {
        this.ostype = ostype;
    }
    
    public void showTextNotification(String text, String image)
    {
        switch (ostype) 
        {
            case Windows:
                if (SystemTray.isSupported()) 
                {
                    final SystemTray tray = SystemTray.getSystemTray();

                    final Image imageIcon = new ImageIcon(Resources
                            .getResourceFile(image))
                            .getImage();

                    TrayIcon trayIcon = new TrayIcon(imageIcon);
                    trayIcon.setImageAutoSize(true);
                    
                    System.out.println("Action command: "+trayIcon.getActionCommand());

                    try
                    {
                        tray.add(trayIcon);
                    } 
                    catch(AWTException ex)
                    {
                        ex.printStackTrace();
                    }
                    trayIcon.displayMessage(Constants.STICKY_MEMORIES_TITLE, 
                            text, MessageType.NONE);
                } 
                else 
                {
                    System.out.println("System tray not supported");
                }

                break;
            case MacOS:
                try
                {
                    ProcessBuilder pb = new ProcessBuilder("osascript",
                            "notification.scpt", "Sticky Memories", text);
                    Process p = pb.start();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(StickyMemories.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case Linux:
                try
                {
                    ProcessBuilder pb = new ProcessBuilder("notify-send",
                            "Sticky Memories", text, "-i", image);
                    Process p = pb.start();
                }
                catch (IOException ex)
                {
                    Logger.getLogger(StickyMemories.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case Other:
                //
                break;
        }
    }
    
    public static void showImageNotification()
    {
        //
    }
}
