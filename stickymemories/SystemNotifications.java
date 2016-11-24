/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        //
        switch (ostype) {
            case Windows:
                //
                break;
            case MacOS:
                //
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
