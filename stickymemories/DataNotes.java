/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bernardovieira
 */
public class DataNotes {
    
    private static List<Note> notes;
    
    public DataNotes()
    {
        //
        notes = new ArrayList<>();
    }
    
    public boolean add(String path_image, List<Reminder> reminders)
            throws DirectoryNotEmptyException, FileAlreadyExistsException,
                IOException
    {
        if(!saveImageApllicationFolder(path_image))
        {
            return false;
        }
        //Note note = new Note(path_image);
        //note.setReminders(reminders);
        //notes.add(note);
        return true;
    }
    
    private boolean saveImageApllicationFolder(String path_image)
            throws DirectoryNotEmptyException, FileAlreadyExistsException,
                IOException
    {
        Path source = Paths.get(path_image);
        Path newdir = Paths.get("", source.getFileName().toString());
        return (Files.copy(source, newdir) != null);
    }
    
    public boolean remove(long note_id)
    {
        for(Note note : notes)
        {
            if(note.getID() == note_id)
            {
                notes.remove(note);
                return true;
            }
        }
        return false;
    }
}
