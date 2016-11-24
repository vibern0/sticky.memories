/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bernardovieira
 */
public class StickyMemories {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        systemNotifications.showTextNotification("Uma mensagem de exemplo!",
                "/home/bernardovieira/Imagens/prioridades.png");
        
    }
    
}
