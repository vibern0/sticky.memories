package stickymemories.frames;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.JFormattedTextField.AbstractFormatter;
import stickymemories.core.*;

/**
 *
 * @author andre
 */

public class AddNotePanel extends javax.swing.JPanel {
    private JFrame mainFrame;
    private Image image;
    private String imagePath;
    public static List<ReminderPanel> remindersList;
    //public static JPanel panelReminders;
    public static JPanel outer_p;
    
    private boolean reminderState = false;
    
    public AddNotePanel(JFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.remindersList = new ArrayList<>();
        initComponents();
        
        setupComponents();
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
        reminderSwitcher = new javax.swing.JToggleButton();
        button_add_reminders = new javax.swing.JButton();

		outer_p = new JPanel();
        outer_p.setLayout(new BoxLayout(outer_p, BoxLayout.Y_AXIS));
        reminders_scroll = new javax.swing.JScrollPane(outer_p);
		outer_p.setSize(150, 800); //Important
		reminders_scroll.setBounds(150,315,195,130);
		reminders_scroll.setBorder(null);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(400, 350));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setPreferredSize(new java.awt.Dimension(400, 350));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setToolTipText("Back to Main Page");
        backButton.setBorderPainted(false);
        backButton.setPreferredSize(new java.awt.Dimension(30, 30));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnBackButtonClicked(evt);
            }
        });

        createNoteButton.setBackground(new java.awt.Color(255, 255, 255));
        createNoteButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        createNoteButton.setLabel("Create");
        createNoteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnCreateNoteButtonClick(evt);
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
        createNoteTextLabel.setText("Create Note");

        remindersTextLabel.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        remindersTextLabel.setText("Reminders:");

        reminderSwitcher.setBackground(new java.awt.Color(255, 255, 255));
        reminderSwitcher.setText("Off");
        reminderSwitcher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnReminderStateClick(evt);
            }
        });

        button_add_reminders.setText("Add new reminder");
        button_add_reminders.setEnabled(false);
        button_add_reminders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_add_remindersActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createNoteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(createNoteTextLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chosenImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(remindersTextLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reminderSwitcher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reminders_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_add_reminders, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNoteTextLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reminderSwitcher)
                            .addComponent(remindersTextLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reminders_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_add_reminders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createNoteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chosenImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setupComponents(){
        image = Constants.getSelectedImageIcon(0, Constants.PATH_IMG_DEFFAULT_IMAGE).getImage();
        
	outer_p.setVisible(false);
        
        backButton.setOpaque(false);
        
        this.repaint();
    }
    
    private void setupButtons() {
        backButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_BACK_SIGN));
    }
    
    private void OnBackButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnBackButtonClicked
        mainFrame.setContentPane(MainFrame.mainPanel);
        invalidate();
        validate();
    }//GEN-LAST:event_OnBackButtonClicked

    private void OnImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnImageMouseClicked
        imagePath = Controller.selectImageFromDisk();
        if(imagePath != null){
            image = Constants.getSelectedImageIcon(1, imagePath).getImage();
            chosenImagePanel.repaint();
        }
    }//GEN-LAST:event_OnImageMouseClicked

    private void OnReminderStateClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnReminderStateClick
        if(reminderState){
            reminderSwitcher.setText(Constants.OFF_TEXT);
            reminderSwitcher.setSelected(false);
            reminderState = false;
            outer_p.setVisible(false);
            button_add_reminders.setEnabled(false);
        }else{
            reminderSwitcher.setText(Constants.ON_TEXT);
            reminderSwitcher.setSelected(true);
            reminderState = true;
            outer_p.setVisible(true);
            button_add_reminders.setEnabled(true);
        }
        this.repaint();
    }//GEN-LAST:event_OnReminderStateClick

    private void OnCreateNoteButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnCreateNoteButtonClick
        if(imagePath == null){
            JOptionPane.showMessageDialog(this,
                "To create a new note, you need to set an image!",
                "Create note warning",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        String newPath = Constants.copyImage(imagePath);
        if(newPath != null){
            if(reminderState){
                List<Reminder> reminders = new ArrayList<>();
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
                    Reminder reminder = new Reminder(date.getYear(), date.getMonth(),
                            date.getDay() , rm.getHour(), rm.getMinute());
                    reminders.add(reminder);
                }
                DataNotes.add(new Note("images/"+newPath, reminders));
                System.out.println("Adicionei uma nota com PATH:"+imagePath+",REMINDERS:"+reminders.size());
            } else {
                DataNotes.add(new Note("images/"+newPath, null));
                System.out.println("Adicionei uma nota com PATH:"+imagePath+",REMINDERS:null");
            }
            try
            {
                Controller.saveData();
            }
            catch (IOException ex)
            {
                System.out.println("Erro ao criar nota!");
            }
            MainFrame.reloadPanel();

            OnBackButtonClicked(evt);
        }
    }//GEN-LAST:event_OnCreateNoteButtonClick

    private void button_add_remindersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_add_remindersActionPerformed
        ReminderPanel rp = new ReminderPanel(this, remindersList.size());
        outer_p.add(rp);
        remindersList.add(rp);
        outer_p.invalidate();
        outer_p.validate();
    }//GEN-LAST:event_button_add_remindersActionPerformed
    
    class ImagePanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(image != null){
                g.drawImage(image, 0, 0, this);
            }
        }
    }
    
    class DateLabelFormatter extends AbstractFormatter {
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
    private javax.swing.JToggleButton reminderSwitcher;
    private javax.swing.JLabel remindersTextLabel;
    private javax.swing.JScrollPane reminders_scroll;
    // End of variables declaration//GEN-END:variables
}

