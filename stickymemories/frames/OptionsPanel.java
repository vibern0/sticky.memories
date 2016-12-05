package stickymemories.frames;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import stickymemories.core.Constants;
import stickymemories.RGBColorChooserPanel;

/**
 *
 * @author andre
 */
public class OptionsPanel extends javax.swing.JPanel {

    private JFrame mainFrame;
    
    public OptionsPanel(JFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        
        setupComponents();
        
        setupButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser = new javax.swing.JColorChooser();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passiveRadioButton = new javax.swing.JRadioButton();
        activeRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jColorChooser.setPreferredSize(new java.awt.Dimension(300, 200));

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));

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

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 24)); // NOI18N
        jLabel1.setText("Settings");

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel2.setText("Notifications Mode");

        passiveRadioButton.setFont(new java.awt.Font("Monaco", 0, 15)); // NOI18N
        passiveRadioButton.setText("Passive");
        passiveRadioButton.setFocusable(false);
        passiveRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnPassiveRadioButtonClick(evt);
            }
        });

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

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnBackgroundColorClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.setFocusable(false);

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
                            .addComponent(jButton1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setupComponents(){
        passiveRadioButton.setSelected(true);
    }
    
    private void setupButtons() {
        backButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_BACK_SIGN));
    }
    
    private void backButtonOnBackButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonOnBackButtonClicked
        mainFrame.setContentPane(MainFrame.mainPanel);
        invalidate();
        validate();
    }//GEN-LAST:event_backButtonOnBackButtonClicked

    private void OnPassiveRadioButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnPassiveRadioButtonClick
        if(activeRadioButton.isSelected())
            activeRadioButton.setSelected(false);
    }//GEN-LAST:event_OnPassiveRadioButtonClick

    private void OnActiveRadioButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnActiveRadioButtonClick
        if(passiveRadioButton.isSelected())
            passiveRadioButton.setSelected(false);
    }//GEN-LAST:event_OnActiveRadioButtonClick

    private void OnBackgroundColorClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnBackgroundColorClicked
        RGBColorChooserPanel rgbCCP = new RGBColorChooserPanel(mainFrame);
    }//GEN-LAST:event_OnBackgroundColorClicked

    private static AbstractColorChooserPanel findPanel(JColorChooser chooser, String name) {
        AbstractColorChooserPanel[] panels = chooser.getChooserPanels();
        for (int i = 0; i < panels.length; i++) {
            String clsName = panels[i].getClass().getName();
            if (clsName.equals(name)) {
                return panels[i];
            }
        }
        return null;
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton activeRadioButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton passiveRadioButton;
    // End of variables declaration//GEN-END:variables
}
