
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
    
    private final OsCheck.OSType ostype;
    
    public PutOnStartup(OsCheck.OSType ostype)
    {
        //
        this.ostype = ostype;
    }
    
    public boolean doIt() throws FileNotFoundException, UnsupportedEncodingException
    {
        boolean result = false;
        //
        switch (ostype) {
            case Windows:
                result = doItOnWindows();
                break;
            case MacOS:
                result = doItOnMac();
                break;
            case Other:
                //
                break;
        }
        return result;
    }
    
    private boolean doItOnWindows()
    {
        //
        
        return false;
    }
    
    private boolean doItOnMac()
    {
        //
        //# add login item
        //osascript -e 'tell application "System Events" to make login item at 
        //end with properties {name: "Notes",path:"/Applications/Notes.app", hidden:false}'
        
        return false;
    }
    
    //no linux é incluido no instalador
}
