package stickymemories;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author andre
 */
public class Constants {
    public static String STICKY_MEMORIES_TITLE = "Sticky Memories";
    
    public static final String MAIN_PANEL = "main_panel";
    public static final String OPTIONS_PANEL = "options_panel";
    
    public static String PATH_IMG_BACK_SIGN = "images/back_sign.png";
    public static String PATH_IMG_PLUS_SIGN = "images/plus_sign.png";
    public static String PATH_IMG_MINUS_SIGN = "images/minus_sign.png";
    public static String PATH_IMG_EDIT_SIGN = "images/edit_sign.png";
    public static String PATH_IMG_HELP_SIGN = "images/help_sign.png";
    public static String PATH_IMG_OPTIONS_SIGN = "images/options_sign.png";
    public static String PATH_IMG_UP_SIGN = "images/up_sign.png";
    public static String PATH_IMG_DOWN_SIGN = "images/down_sign.png";
    
    public static String PATH_IMG_EXCLAMATION_SIGN = "images/exclamation_sign.png";
    
    public static ImageIcon getImageIcon(String path) {
        try {
            return new ImageIcon(ImageIO.read(Resources.getResourceFile(path)).getScaledInstance(25, 25,java.awt.Image.SCALE_SMOOTH ));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
