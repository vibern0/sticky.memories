/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories;

import static com.sun.javafx.runtime.SystemProperties.getCodebase;
import com.sun.javafx.tk.Toolkit;
import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.rmi.CORBA.Util;
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
    
    public void showTextNotification(String text, String image) throws AWTException
    {
        //
        switch (ostype) {
            case Windows:
                SystemTray tray = SystemTray.getSystemTray();

                Image imageDemo = null;
                
                if (SystemTray.isSupported()) {
                    URL imageUrl = this.getClass().getResource("\\images\\image.png");
                    try {
                        imageDemo = ImageIO.read(imageUrl);
                    } catch (IOException ex) {
                        Logger.getLogger(SystemNotifications.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                TrayIcon trayIcon = new TrayIcon(imageDemo, "Sticky Memories");
                trayIcon.setImageAutoSize(true);
                
                trayIcon.setToolTip("System tray icon demo");
                tray.add(trayIcon);
                trayIcon.displayMessage("Sticky Memories", text, MessageType.NONE);
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
