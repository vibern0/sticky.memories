
package stickymemories;

import java.awt.AWTException;
import javax.swing.JRootPane;

/**
 *
 * @author bernardovieira
 */
public class StickyMemories {

    
    public static void main(String[] args) throws AWTException {

        MainFrame mf = new MainFrame();
        
        OsCheck.OSType ostype=OsCheck.getOperatingSystemType();
        switch (ostype) {
            case Windows:
                System.out.println("Hi from Windows!");
                break;
            case MacOS:
                System.out.println("Hi from MacOS!");
                break;
            case Linux:
                System.out.println("Hi from Linux!");
                break;
            case Other:
                System.out.println("Hi from Other!");
                break;
        }
        
        new PutOnStartup(ostype);
        SystemNotifications systemNotifications = new SystemNotifications(ostype);
        
        // Linux Test
        //systemNotifications.showTextNotification("Uma mensagem de exemplo!",
        //        "/home/bernardovieira/Imagens/prioridades.png");
        
        // Windows Test
        systemNotifications.showTextNotification("Lembrete XYZ", 
                Constants.PATH_IMG_EXCLAMATION_SIGN);
        
    }
    
}
