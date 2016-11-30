package stickymemories;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.colorchooser.AbstractColorChooserPanel;

/**
 *
 * @author andre
 */
public class OptionsPanel extends javax.swing.JPanel {

    private JFrame mainFrame;
    
    public OptionsPanel(JFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        
        AbstractColorChooserPanel[] oldPanels = jColorChooser.getChooserPanels();
        for (int i = 0; i < oldPanels.length; i++) {
          String clsName = oldPanels[i].getDisplayName();
          if (clsName.equals("javax.swing.colorchooser.DefaultSwatchChooserPanel")) {
            jColorChooser.removeChooserPanel(oldPanels[i]);
          } else if (clsName.equals("javax.swing.colorchooser.DefaultRGBChooserPanel")) {
            jColorChooser.removeChooserPanel(oldPanels[i]);
          } else if (clsName.equals("javax.swing.colorchooser.DefaultHSBChooserPanel")) {
            jColorChooser.removeChooserPanel(oldPanels[i]);
          } else if (clsName.equals("HSV")) {
            jColorChooser.removeChooserPanel(oldPanels[i]);
          } else if (clsName.equals("Preview")) {
            jColorChooser.removeChooserPanel(oldPanels[i]);
          }
        }
        
        setupButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser = new javax.swing.JColorChooser();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));

        jColorChooser.setPreferredSize(new java.awt.Dimension(300, 200));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setToolTipText("Back to Main Page");
        backButton.setPreferredSize(new java.awt.Dimension(30, 30));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonOnBackButtonClicked(evt);
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
                        .addGap(0, 346, Short.MAX_VALUE))
                    .addComponent(jColorChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jColorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setupButtons() {
        backButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_BACK_SIGN));
    }
    
    private void backButtonOnBackButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonOnBackButtonClicked
        mainFrame.setContentPane(MainFrame.mainPanel);
        invalidate();
        validate();
    }//GEN-LAST:event_backButtonOnBackButtonClicked

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
    private javax.swing.JButton backButton;
    private javax.swing.JColorChooser jColorChooser;
    // End of variables declaration//GEN-END:variables
}
