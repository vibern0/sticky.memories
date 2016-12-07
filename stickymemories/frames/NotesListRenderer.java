/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.frames;

import java.awt.Component;
import java.awt.Font;
import java.util.Iterator;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import stickymemories.core.DataNotes;
import stickymemories.core.Note;

/**
 *
 * @author bernardovieira
 */
public class NotesListRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus) {

        JLabel label = (JLabel) super.getListCellRendererComponent(
                list, null, index, isSelected, cellHasFocus);
        
        int pos = 0;
        Iterator it = DataNotes.notes.iterator();
        while(pos++ < index)
        {
            it.next();
        }
        Note note = (Note)it.next();
        
        label.setIcon(note.getImage());
        //label.setHorizontalTextPosition(JLabel.RIGHT);
        //label.setFont(font);
        return label;
    }
    
}
