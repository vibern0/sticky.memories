
package stickymemories.frames;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import stickymemories.core.*;
/**
 *
 * @author andre
 */
public class EditNotePanel extends javax.swing.JPanel {
    MainFrame mainFrame;
    String imagePath = "";
    private Image image;
    private boolean reminderState;
    public static List<ReminderPanel> remindersList;
    public static JPanel outer_p;

    public EditNotePanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        
        setupButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        createNoteButton = new javax.swing.JButton();
        chosenImagePanel = new ImagePanel();
        createNoteTextLabel = new javax.swing.JLabel();
        remindersTextLabel = new javax.swing.JLabel();
        button_add_reminders = new javax.swing.JButton();
        //reminders_scroll = new javax.swing.JScrollPane();
        switch_reminders = new javax.swing.JButton();

		outer_p = new JPanel();
        outer_p.setLayout(new BoxLayout(outer_p, BoxLayout.Y_AXIS));
        reminders_scroll = new javax.swing.JScrollPane(outer_p);
		outer_p.setSize(150, 800); //Important
		reminders_scroll.setBounds(150,315,195,130);
		reminders_scroll.setBorder(null);

        setBackground(new java.awt.Color(255, 255, 255));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setToolTipText("Back to Main Page");
        backButton.setBorderPainted(false);
        backButton.setFocusable(false);
        backButton.setPreferredSize(new java.awt.Dimension(30, 30));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonOnBackButtonClicked(evt);
            }
        });

        createNoteButton.setBackground(new java.awt.Color(255, 255, 255));
        createNoteButton.setText("Save");
        createNoteButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        createNoteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnSaveButtonClicked(evt);
            }
        });

        chosenImagePanel.setBackground(new java.awt.Color(255, 255, 255));
        chosenImagePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        chosenImagePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout chosenImagePanelLayout = new javax.swing.GroupLayout(chosenImagePanel);
        chosenImagePanel.setLayout(chosenImagePanelLayout);
        chosenImagePanelLayout.setHorizontalGroup(
            chosenImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        chosenImagePanelLayout.setVerticalGroup(
            chosenImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );

        createNoteTextLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        createNoteTextLabel.setText("Edit Note");

        remindersTextLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        remindersTextLabel.setText("Reminders:");

        button_add_reminders.setText("Add new reminder");
        button_add_reminders.setEnabled(false);
        button_add_reminders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_remindersActionPerformed(evt);
            }
        });

        switch_reminders.setText("jButton1");
        switch_reminders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switch_remindersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 352, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reminders_scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(switch_reminders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(createNoteButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(createNoteTextLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(chosenImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(remindersTextLabel))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(button_add_reminders, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(switch_reminders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reminders_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(createNoteTextLabel)
                    .addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(remindersTextLabel)
                            .addGap(186, 186, 186)
                            .addComponent(button_add_reminders)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(createNoteButton))
                        .addComponent(chosenImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void setupComponents(){
        Note note = DataNotes.getNote(MainFrame.LastSelectedEdit);
        
        outer_p.removeAll();
	outer_p.setVisible(true);
        
        if(note == null){ 
            System.out.println("ERRO");
            return;
        }
        imagePath = note.getImagePath();
        if(imagePath != null){
            System.out.println("ImagePath: " + imagePath);
            image = Constants.getSelectedImageIcon(1, imagePath).getImage();
            chosenImagePanel.repaint();
        }
        remindersList = new ArrayList<>();
        if(note.getReminders() == null){
            reminderState = false;
            System.out.println("Nota sem reminders!");
        } else {
            reminderState = true;
            System.out.println("Esta nota tem "+note.getReminders().size()
                    +" reminders!");
            
            for(Reminder rm : note.getReminders()) {
                ReminderPanel rp = new ReminderPanel(this, remindersList.size());
                rp.setTime(rm.getAno(), rm.getMes(), rm.getDia(), rm.getHora(), rm.getMinuto());
                System.out.println(rm.getAno() + ":" + rm.getMes() + ":" + rm.getDia() + ":" + rm.getHora() + ":" + rm.getMinuto());
                outer_p.add(rp);
                remindersList.add(rp);
            }
            outer_p.invalidate();
            outer_p.validate();
        }           
        
        if(reminderState)
        {
            switch_reminders.setText(Constants.ON_TEXT);
            switch_reminders.setSelected(true);
            reminderState = true;
            outer_p.setVisible(true);
            button_add_reminders.setEnabled(true);
            this.repaint();
        }
        //updateReminderState();
    }
    
    private void backButtonOnBackButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonOnBackButtonClicked
        mainFrame.setContentPane(MainFrame.mainPanel);
        invalidate();
        validate();
    }//GEN-LAST:event_backButtonOnBackButtonClicked

    private void OnSaveButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnSaveButtonClicked
        if(imagePath == null)
            return;
        String newPath = Constants.copyImage(imagePath);
        Note note = DataNotes.getNote(MainFrame.LastSelectedEdit);
        note.setImagePath(newPath);
        List<Reminder> reminders = null;
        if(reminderState){
            reminders = new ArrayList<>();
            int i = 0;
            for(ReminderPanel rm : this.remindersList){
                if(rm.jDateChoser.getDate() == null){
                    JOptionPane.showMessageDialog(this,
                        "There are reminders with no date!",
                        "Create note warning",
                        JOptionPane.WARNING_MESSAGE);
                    return;
                }
                Date date = rm.jDateChoser.getDate();
                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                Reminder reminder = new Reminder(year, month,
                        day, rm.getHour(), rm.getMinute());
                System.out.println(year + ":" + month + ":" + day + ":" + rm.getHour() + ":" + rm.getMinute());
                reminders.add(reminder);
            }
            if(reminders.isEmpty())
                reminders = null;
            if(reminders != null)
                System.out.println("Adicionei uma nota com PATH:"+imagePath+",REMINDERS:"+reminders.size());
        }
        note.setReminders(reminders);
        DataNotes.updateNote(MainFrame.LastSelectedEdit, note);
        try
        {
            Controller.saveData();
            mainFrame.updateRemindes();
        }
        catch (IOException ex)
        {
            System.out.println("Erro ao criar nota!");
            Logger.getLogger(AddNotePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNotePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        MainFrame.reloadPanel();
        backButtonOnBackButtonClicked(evt);
    }//GEN-LAST:event_OnSaveButtonClicked

    private void updateReminderState(){
        if(reminderState){
            switch_reminders.setText(Constants.OFF_TEXT);
            switch_reminders.setSelected(false);
            reminderState = false;
            outer_p.setVisible(false);
            button_add_reminders.setEnabled(false);
        }else{
            switch_reminders.setText(Constants.ON_TEXT);
            switch_reminders.setSelected(true);
            reminderState = true;
            outer_p.setVisible(true);
            button_add_reminders.setEnabled(true);
        }
        this.repaint();
    }
    
    private void button_add_remindersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_remindersActionPerformed
        ReminderPanel rp = new ReminderPanel(this, remindersList.size());
        outer_p.add(rp);
        remindersList.add(rp);
        outer_p.invalidate();
        outer_p.validate();
        outer_p.setVisible(false);
        outer_p.setVisible(true);
    }//GEN-LAST:event_button_add_remindersActionPerformed

    private void OnImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnImageMouseClicked
        imagePath = Controller.selectImageFromDisk();
        if(imagePath != null){
            image = Constants.getSelectedImageIcon(1, imagePath).getImage();
            chosenImagePanel.repaint();
        }
    }//GEN-LAST:event_OnImageMouseClicked

    private void switch_remindersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switch_remindersActionPerformed
        updateReminderState();
    }//GEN-LAST:event_switch_remindersActionPerformed

    private void setupButtons() {
        backButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_BACK_SIGN));
    }
    
    class ImagePanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(image != null){
                g.drawImage(image, 0, 0, this);
            }
        }
    }
    
    class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {
        private String datePattern = "yyyy-MM-dd";
        private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

        @Override
        public Object stringToValue(String text) throws ParseException {
            return dateFormatter.parseObject(text);
        }

        @Override
        public String valueToString(Object value) throws ParseException {
            if (value != null) {
                Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
            }

            return "";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton button_add_reminders;
    private javax.swing.JPanel chosenImagePanel;
    private javax.swing.JButton createNoteButton;
    private javax.swing.JLabel createNoteTextLabel;
    private javax.swing.JLabel remindersTextLabel;
    private javax.swing.JScrollPane reminders_scroll;
    private javax.swing.JButton switch_reminders;
    // End of variables declaration//GEN-END:variables

}
