package stickymemories.frames;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import stickymemories.core.OptionsModel;
import stickymemories.core.Constants;
import stickymemories.loop.CheckReminders;

/**
 *
 * @author andre
 */
public class OptionsPanel extends javax.swing.JPanel {

    private final JFrame mainFrame;
    private CheckReminders checkReminders;
    private boolean notificationMode;
    
    public OptionsPanel(JFrame mainFrame, CheckReminders checkReminders) {
        this.mainFrame = mainFrame;
        this.checkReminders = checkReminders;
        initComponents();
        
        setupButtons();

        setupComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passiveRadioButton = new javax.swing.JRadioButton();
        activeRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        colorJPanel = new javax.swing.JPanel();
        save = new javax.swing.JButton();

        setBackground(Constants.colorBackground);
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));

        backButton.setBackground(Constants.colorBackground);
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setToolTipText("Back to Main Page");
        backButton.setBorderPainted(false);
        backButton.setFocusable(false);
        backButton.setPreferredSize(new java.awt.Dimension(30, 30));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnBackButtonClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        jLabel1.setText("Settings");

        jLabel2.setBackground(Constants.colorBackground);
        jLabel2.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel2.setText("Notifications Mode");

        passiveRadioButton.setBackground(Constants.colorBackground);
        passiveRadioButton.setFont(new java.awt.Font("Monaco", 0, 15)); // NOI18N
        passiveRadioButton.setText("Passive");
        passiveRadioButton.setFocusable(false);
        passiveRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnPassiveRadioButtonClick(evt);
            }
        });

        activeRadioButton.setBackground(Constants.colorBackground);
        activeRadioButton.setFont(new java.awt.Font("Monaco", 0, 15)); // NOI18N
        activeRadioButton.setText("Active");
        activeRadioButton.setFocusable(false);
        activeRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnActiveRadioButtonClick(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel3.setText("Background Color");

        colorJPanel.setBackground(Constants.colorBackground);
        colorJPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        colorJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnBackgroundColorClicked(evt);
            }
        });

        javax.swing.GroupLayout colorJPanelLayout = new javax.swing.GroupLayout(colorJPanel);
        colorJPanel.setLayout(colorJPanelLayout);
        colorJPanelLayout.setHorizontalGroup(
            colorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        colorJPanelLayout.setVerticalGroup(
            colorJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        save.setText("Save");
        save.setFocusable(false);
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnSaveButtonClick(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(activeRadioButton)
                    .addComponent(passiveRadioButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(save)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(colorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passiveRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(activeRadioButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(save)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void setupButtons(){
        backButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_BACK_SIGN));
    }
    
    private void setupComponents(){
        OptionsModel om = OptionsModel.loadOptions();
        if(om != null){
            if(!om.getNotificationsMode())
                passiveRadioButton.setSelected(true);
            else
                activeRadioButton.setSelected(true);
        } else {
            passiveRadioButton.setSelected(true);
        }
    }
    
    private void OnBackButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnBackButtonClicked
        mainFrame.setContentPane(MainFrame.mainPanel);
        invalidate();
        validate();
    }//GEN-LAST:event_OnBackButtonClicked

    private void OnPassiveRadioButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnPassiveRadioButtonClick
        if(activeRadioButton.isSelected()){
            activeRadioButton.setSelected(false);
            notificationMode = false;
        }
    }//GEN-LAST:event_OnPassiveRadioButtonClick

    private void OnActiveRadioButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnActiveRadioButtonClick
        if(passiveRadioButton.isSelected()){
            passiveRadioButton.setSelected(false);
            notificationMode = true;
        }
    }//GEN-LAST:event_OnActiveRadioButtonClick

    private void OnBackgroundColorClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnBackgroundColorClicked
        
        Object[] options = {
            "Yes, please",
            "No way!" };

        JColorChooser jCC;
        JPanel panel;

        jCC = new JColorChooser();
        panel = new JPanel() {
            @Override
            protected void paintComponent(final Graphics g) {
                final Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                super.paintComponent(g);
            }
        };

        panel.add(jCC);
        panel.setOpaque(false);
        jCC.setOpaque(false);
        jCC.setPreviewPanel(new JPanel());
        jCC.setColor(120, 20, 57);

        final JComponent[] inputs = new JComponent[] {
            jCC,
            panel
        };
        int result = JOptionPane.showOptionDialog(null,
            inputs,
            "My custom dialog",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]);

        if (result == JOptionPane.OK_OPTION)
        {
            System.out.println("You entered " + jCC.getColor());
            colorJPanel.setBackground(jCC.getColor());
        }
        else
        {
            System.out.println("User canceled / closed the dialog, result = " + result);
        }
        
    }//GEN-LAST:event_OnBackgroundColorClicked

    private void OnSaveButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnSaveButtonClick
        OptionsModel om = 
                new OptionsModel(notificationMode, colorJPanel.getBackground());
        om.saveOptions();
        checkReminders.isPassive(notificationMode);
        Constants.updateBackground(om.getColorCode());
        OnBackButtonClicked(evt);
    }//GEN-LAST:event_OnSaveButtonClick
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton activeRadioButton;
    private javax.swing.JButton backButton;
    public static javax.swing.JPanel colorJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton passiveRadioButton;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
