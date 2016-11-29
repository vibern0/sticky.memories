/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author bernardovieira
 */
public class Controller {
    
    public Controller()
    {
        
    }
    
    public static String selectImageFromDisk()
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        chooser.setFileFilter(new javax.swing.filechooser.FileFilter()
        {
            @Override
            public boolean accept(File f)
            {
                return f.getName().toLowerCase().endsWith(".gif")
                    || f.isDirectory();
            }

            @Override
            public String getDescription()
            {
                return "GIF Images";
            }
        });

        int r = chooser.showOpenDialog(new JFrame());
        if (r == JFileChooser.APPROVE_OPTION)
        {
            String name = chooser.getSelectedFile().getAbsolutePath();
            return name;
        }
        return null;
    }
    
    private String getUserFolder()
    {
        return System.getProperty("user.home");
    }
    
    public boolean saveData()
    {
        
        return false;
    }
    
    public boolean loadData()
    {
        
        return false;
    }
}
