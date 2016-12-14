/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.core;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static stickymemories.core.Constants.getFolderData;
import static stickymemories.core.Constants.getFolderImages;
import stickymemories.core.os.PutOnStartup;

/**
 *
 * @author bernardovieira
 */
public class Controller {
    
    public Controller()
    {
        
    }
    
    public static void firstRun() throws IOException
    {
        String newPath = getFolderData();
        File file = new File(newPath);
        if(!file.exists())
        {
            Files.createDirectory(Paths.get(newPath));
            newPath = getFolderImages();
            file = new File(newPath);
            if(!file.exists())
            {
                Files.createDirectory(Paths.get(newPath));
            }
            
            PutOnStartup.doIt();
        }
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
                return "JPG Images";
            }
        });

        int r = chooser.showOpenDialog(new JFrame());
        if (r == JFileChooser.APPROVE_OPTION)
        {
            String name = chooser.getSelectedFile().getAbsolutePath();
            String format = name.substring(name.lastIndexOf("."));
            if(format.equals(".jpg") || format.equals(".JPG"))
            {
                return name;
            }
        }
        return null;
    }
    
    public static void saveData()
            throws FileNotFoundException, IOException
    {
        FileOutputStream fout = new FileOutputStream(Constants.getFolderData() + Constants.NOTES_FILE_PATH);
        try (ObjectOutputStream oos = new ObjectOutputStream(fout))
        {
            oos.writeObject(DataNotes.notes);
        }
    }
    
    public static List<Note> loadData()
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        List<Note> notes;
        
        FileInputStream fin = new FileInputStream(Constants.getFolderData() + Constants.NOTES_FILE_PATH);
        ObjectInputStream ois = new ObjectInputStream(fin);
        notes = (List<Note>)ois.readObject();
        
        return notes;
    }
}
