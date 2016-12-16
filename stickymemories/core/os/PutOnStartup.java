
package stickymemories.core.os;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import stickymemories.core.Constants;

/**
 *
 * @author bernardovieira
 */
public class PutOnStartup {
    
    public PutOnStartup()
    {
        //
    }
    
    public static boolean doIt() throws FileNotFoundException, UnsupportedEncodingException
    {
        boolean result = false;
        //
        switch (OsCheck.getOperatingSystemType()) {
            case Windows:
                result = doItOnWindows();
                break;
            case MacOS:
                result = doItOnMac();
                break;
            case Linux:
                result = doItOnLinux();
                break;
            case Other:
                //
                break;
        }
        return result;
    }
    
    private static boolean doItOnWindows()
    {
        //
        
        return false;
    }
    
    private static boolean doItOnMac()
    {
        //
        try
        {
            ProcessBuilder pb = new ProcessBuilder("osascript", Constants.MAC_STARTUP_PATH);
            Process p = pb.start();
        }
        catch (IOException ex)
        {
            Logger.getLogger(SystemNotifications.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private static boolean doItOnLinux() throws FileNotFoundException, UnsupportedEncodingException
    {
        PrintWriter writer = new PrintWriter(Constants.getUserFolder() +
                        ".config/autostart/StickyMemories.desktop", "UTF-8");
        writer.println(
                "[Desktop Entry]\n" +
                "Encoding=UTF-8\n" +
                "Name=StickyMemories\n" +
                "Comment=The best way to be reminded !\n" +
                "Exec=java -jar /opt/StickyMemories/StickyMemories.jar\n" +
                "Icon=/opt/StickyMemories/brain.png\n" +
                "Categories=Utility;\n" +
                "Version=1.0\n" +
                "Type=Application\n" +
                "Terminal=0"
        );
        writer.close();
        
        return false;
    }
}
