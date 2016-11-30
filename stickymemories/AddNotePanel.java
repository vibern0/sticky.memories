package stickymemories;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author andre
 */
public class AddNotePanel extends javax.swing.JPanel {

    private JFrame mainFrame;
    private Image image;
    
    private boolean reminderState = false;
    
    public AddNotePanel(JFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        
        setupButtons();
        
        image = Constants.getSelectedImageIcon(1, Constants.PATH_IMG_DEFFAULT_IMAGE).getImage();
        chosenImagePanel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        backButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        chosenImagePanel = new ImagePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        reminderSwitcher = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(255, 255, 255));

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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirm");
        jButton1.setOpaque(false);

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
            .addGap(0, 186, Short.MAX_VALUE)
        );
        chosenImagePanelLayout.setVerticalGroup(
            chosenImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel1.setText("Create Note");

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 14)); // NOI18N
        jLabel2.setText("Reminders:");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+");
        jButton2.setBorderPainted(false);

        reminderSwitcher.setBackground(new java.awt.Color(255, 255, 255));
        reminderSwitcher.setText("Off");
        reminderSwitcher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnReminderStateClick(evt);
            }
        });

        jLabel3.setText("Reminder XY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chosenImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reminderSwitcher)
                            .addComponent(jButton2))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(reminderSwitcher))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jLabel3)))
                    .addComponent(chosenImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setupButtons() {
        backButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_BACK_SIGN));
    }
    
    private void OnBackButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnBackButtonClicked
        mainFrame.setContentPane(MainFrame.mainPanel);
        invalidate();
        validate();
    }//GEN-LAST:event_OnBackButtonClicked

    private void OnImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnImageMouseClicked
        image = Constants.getSelectedImageIcon(1, Controller.selectImageFromDisk()).getImage();
        chosenImagePanel.repaint();
    }//GEN-LAST:event_OnImageMouseClicked

    private void OnReminderStateClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnReminderStateClick
        if(reminderState){
            reminderSwitcher.setText(Constants.OFF_TEXT);
            reminderSwitcher.setSelected(false);
            reminderState = false;
        }else{
            reminderSwitcher.setText(Constants.ON_TEXT);
            reminderSwitcher.setSelected(true);
            reminderState = true;
        }
    }//GEN-LAST:event_OnReminderStateClick

    class ImagePanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            if(image != null){
                g.drawImage(image, 0, 0, this);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel chosenImagePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton reminderSwitcher;
    // End of variables declaration//GEN-END:variables
}
