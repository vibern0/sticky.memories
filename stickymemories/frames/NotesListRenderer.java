/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.frames;

import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import stickymemories.core.DataNotes;

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
        label.setIcon(DataNotes.notes.get(index).getImage());
        //label.setHorizontalTextPosition(JLabel.RIGHT);
        //label.setFont(font);
        return label;
    }
    
}
