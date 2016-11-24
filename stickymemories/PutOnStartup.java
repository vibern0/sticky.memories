/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    public boolean doIt()
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
            case Linux:
                result = doItOnLinux();
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
    
    private boolean doItOnLinux()
    {
        
        /*
        [Desktop Entry]
        Name=Docky
        Type=Application
        Exec=docky
        Terminal=false
        Icon=docky
        Comment=The finest dock no money can buy.
        Comment[pt]=A melhor doca que nenhum dinheiro pode comprar.
        NoDisplay=false
        Categories=Utility;

        */
        
        //escrever e guardar em ~/.config/autostart/
        //com o noome stickymemories.desktop
        
        return false;
    }
}
