package stickymemories.core;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author bernardovieira
 */

public class DataNotes implements Serializable {
    
    public static List<Note> notes;
    
    public DataNotes()
    { }
    
    public static void init()
    {
        notes = new ArrayList<>();
    }
    
    public static void setNotes(List<Note> ns)
    {
        notes = ns;
    }
    
    public static int getSize()
    {
        return notes.size();
    }
    
    public static boolean add(Note note)
    {
        return notes.add(note);
    }
    
    public static boolean add(String path_image, List<Reminder> reminders)
            throws DirectoryNotEmptyException, FileAlreadyExistsException,
                IOException
    {
        if(!saveImageApllicationFolder(path_image))
        {
            return false;
        }
        Note note = new Note(path_image, reminders);
        notes.add(note);
        return true;
    }
    
    private static boolean saveImageApllicationFolder(String path_image)
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
