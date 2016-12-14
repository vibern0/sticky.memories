
package stickymemories.core.os;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

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
        //# add login item
        //osascript -e 'tell application "System Events" to make login item at 
        //end with properties {name: "Notes",path:"/Applications/Notes.app", hidden:false}'
        
        return false;
    }
    
    private static boolean doItOnLinux() throws FileNotFoundException, UnsupportedEncodingException
    //no linux é incluido no instalador
    {
        PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
        writer.println(
                "[Desktop Entry]\n" +
                "Name=Sticky Notes\n" +
                "Type=Application\n" +
                "Exec=~/.config/autostart/stickynotes.desktop\n" +
                "Terminal=false\n" +
                "Icon=noicon\n" +
                "Comment=The Sticky Notes App.\n" +
                "NoDisplay=false\n" +
                "Categories=Utility;"
        );
        writer.close();
        
        return false;
    }
}
