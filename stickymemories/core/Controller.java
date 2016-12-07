/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
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
    
    public static boolean saveData() throws FileNotFoundException, IOException
    {
        FileOutputStream fout = new FileOutputStream("file.bin");
        try (ObjectOutputStream oos = new ObjectOutputStream(fout))
        {
            oos.writeObject(DataNotes.notes);
        }
        return false;
    }
    
    public static List<Note> loadData() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        List<Note> notes;
        
        FileInputStream fin = new FileInputStream("file.bin");
        ObjectInputStream ois = new ObjectInputStream(fin);
        notes = (List<Note>)ois.readObject();
        
        return notes;
    }
}
