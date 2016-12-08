/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.core;

import java.io.*;
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
                return f.getName().toLowerCase().endsWith(".jpg")
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
    
    public static void saveData()
            throws FileNotFoundException, IOException
    {
        FileOutputStream fout = new FileOutputStream(Constants.NOTES_FILE_PATH);
        try (ObjectOutputStream oos = new ObjectOutputStream(fout))
        {
            oos.writeObject(DataNotes.notes);
        }
    }
    
    public static List<Note> loadData()
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        List<Note> notes;
        
        FileInputStream fin = new FileInputStream(Constants.NOTES_FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fin);
        notes = (List<Note>)ois.readObject();
        
        return notes;
    }
}
