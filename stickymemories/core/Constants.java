
package stickymemories.core;

import java.awt.Color;
import java.awt.Image;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import stickymemories.StickyMemories;
import stickymemories.frames.MainFrame;
/**
 *
 * @author andre
 */
public class Constants {
    public static String STICKY_MEMORIES_TITLE = "Sticky Memories";
    
    public static final String NOTES_FILE_PATH = "notes.bin";
    public static final String OPTIONS_FILE_PATH = "optionsFile.bin";
    
    public static final String MAIN_PANEL = "main_panel";
    public static final String OPTIONS_PANEL = "options_panel";
    
    public static final String ON_TEXT = "ON";
    public static final String OFF_TEXT = "OFF";
    
    public static final String CREATION_DAYE = "Creation date";
    public static final String REMINDER_DATE = "Reminder date";
    public static final String UP_TEXT = "Up";
    public static final String DOWN_TEXT = "Down";
    
    public static String PATH_IMG_APP_ICON = "images/brain.png";
    public static String PATH_IMG_BACK_SIGN = "images/back_sign.png";
    public static String PATH_IMG_PLUS_SIGN = "images/plus_sign.png";
    public static String PATH_IMG_MINUS_SIGN = "images/minus_sign.png";
    public static String PATH_IMG_EDIT_SIGN = "images/edit_sign.png";
    public static String PATH_IMG_HELP_SIGN = "images/help_sign.png";
    public static String PATH_IMG_OPTIONS_SIGN = "images/options_sign.png";
    public static String PATH_IMG_UP_SIGN = "images/up_sign.png";
    public static String PATH_IMG_DOWN_SIGN = "images/down_sign.png";
    public static String PATH_IMG_ICON = "images/brain.png";
    
    public static String PATH_IMG_DEFFAULT_IMAGE = "images/deffault_img.png";
    
    public static String PATH_IMG_EXCLAMATION_SIGN = "images/exclamation_sign.png";
    
    public static Color colorBackground;
    
    public static String MAC_NOTIFICATION_PATH  = "osx/notification.scpt";
    public static String MAC_STARTUP_PATH  = "osx/startup.scpt";
    
    public static void updateBackground(Color colorBackground){
        Constants.colorBackground = colorBackground;
        //MainFrame.addNotePanel.setBackground(colorBackground);
        MainFrame.editNotePanel.setBackground(colorBackground);
        MainFrame.helpPanel.setBackground(colorBackground);
        MainFrame.mainPanel.setBackground(colorBackground);
        MainFrame.notesList.setBackground(Color.WHITE);
        MainFrame.optionsPanel.setBackground(colorBackground);
    }
    
    public static String getUserFolder()
    {
        return System.getProperty("user.home") + "/";
    }
    
    public static String getFolderData()
    {
        return getUserFolder() + ".stickyMemories/";
    }
    
    public static String getFolderImages()
    {
        return getUserFolder() + ".stickyMemories/images/";
    }
    
    public static ImageIcon getButtonImageIcon(String path) {
        try {
            return new ImageIcon(ImageIO.read(Resources.getResourceFile(path)).getScaledInstance(25, 25,java.awt.Image.SCALE_SMOOTH ));
        } catch (IOException ex) {
            System.out.println("Erro no path!");
        }
        return null;
    }
    
    public static ImageIcon getSelectedImageIcon(int mode, String path) {
        //mode -> 0 classPath; 1 fullPath
        try {
            if(mode == 0)
                return new ImageIcon(ImageIO.read(Resources.getResourceFile(path)).getScaledInstance(190, 175,java.awt.Image.SCALE_SMOOTH ));
            else
                return new ImageIcon(ImageIO.read(new File(path)).getScaledInstance(160, 160,java.awt.Image.SCALE_SMOOTH));
        } catch (IOException ex) {
            System.out.println("IOException error.:\tMode:"+mode+"\tImagePath:"+path);
        }
        return null;
    }
    
    public static Image getSelectedImage(int mode, String path) {
        //mode -> 0 classPath; 1 fullPath
        try {
            if(mode == 0)
                return ImageIO.read((Resources.getResourceFile(path)));
            else
                return ImageIO.read(new File(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static String copyImage(String imagePath) {
        String[] imagePathArray = imagePath.replaceAll("\\\\", "/").split("/");
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(new File(imagePath));
            
            String newPath = getFolderImages();
            newPath += String.valueOf(new Date().getTime()) + ".jpg"; //imagePathArray[imagePathArray.length-1];
            
            os = new FileOutputStream(new File(newPath));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            is.close();
            os.close();
            return newPath;
        } catch (FileNotFoundException ex) {
            return null;
        } catch(Exception e){
            return null;
        } 
    }
}
