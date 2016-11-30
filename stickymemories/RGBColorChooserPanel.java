package stickymemories;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.colorchooser.AbstractColorChooserPanel;

/**
 *
 * @author andre
 */
public final class RGBColorChooserPanel extends JDialog implements ActionListener {
    private final JColorChooser jCC;
    private final JFrame mainFrame;
    private final JPanel panel;
    
    private JOptionPane optionPanel;
    
    private final String title;
    private String colorCode;

    public RGBColorChooserPanel(JFrame mainFrame) {
        super(mainFrame);
        this.mainFrame = mainFrame;
        this.title = "Color Chooser";
        this.jCC = new JColorChooser();
        this.modifyJColorChooser();
        this.panel = new JPanel() {
            @Override
            protected void paintComponent(final Graphics g) {
                final Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                super.paintComponent(g);
            }
        };
        
        this.panel.add(this.jCC);
        this.panel.setOpaque(false);
        this.jCC.setOpaque(false);
        this.jCC.setPreviewPanel(new JPanel());
        this.jCC.setColor(120, 20, 57);
        this.add(this.panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        this.pack();

        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screenSize.width - this.getWidth()) / 2,
                (screenSize.height - this.getHeight()) / 2);
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        /*
        int selection = getSelection(pane);

        switch (selection) {
        case JOptionPane.OK_OPTION:
          System.out.println("OK_OPTION");
          break;
        case JOptionPane.CANCEL_OPTION:
          System.out.println("CANCEL");
          break;
        default:
          System.out.println("Others");
        }
        */
    }

    private void modifyJColorChooser() {
        optionPanel = new JOptionPane();
        Object[] options = {"Ok Color", "Cancel"};
        for (final AbstractColorChooserPanel accp : jCC.getChooserPanels()) {
            if (accp.getDisplayName().equals("RGB")) {
                //optionPanel.
                JOptionPane.showOptionDialog(mainFrame, accp,
                title, JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                null, options, null);
            }
        }
    }
}
