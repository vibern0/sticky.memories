/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.core;

import java.util.Comparator;
import stickymemories.frames.MainFrame;

/**
 *
 * @author bernardovieira
 */
public class NotesComparator implements Comparator<Note> {

    @Override
    public int compare(Note t, Note t1)
    {
        switch(MainFrame.order_notes)
        {
            case 0: // "Creation date" asc
                break;
            case 1: // "Creation date" desc
                break;
            case 2: // "Remidner date" asc
                break;
            case 3: // "Remidner date" desc
                break;
        }
        return 1;
    }
    
}
