
package stickymemories.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import stickymemories.core.Constants;
/**
 *
 * @author andre
 */
public class MainFrame extends javax.swing.JFrame {

    public static JPanel addNotePanel;
    public static JPanel editNotePanel;
    public static JPanel optionsPanel;
    public static String LastSelectedEdit;

    private String sortMode = Constants.DOWN_TEXT; // FEITO À TROLHA xD

    public MainFrame() {
        initComponents();
       
        this.addNotePanel = new AddNotePanel(this);
        this.editNotePanel = new EditNotePanel(this);
        this.optionsPanel = new OptionsPanel(this);
        
        this.setTitle(Constants.STICKY_MEMORIES_TITLE);
        this.setResizable(false);
        
        notesList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        
        setupButtons();
        
        this.setVisible(true);
        
        initNotesList();
    }
    
    private void initNotesList()
    {
        DefaultListModel model = new DefaultListModel();
        notesList = new JList(model);

        // Initialize the list with items
        String[] items = { "A", "B", "C", "D" };
        for (int i = 0; i < items.length; i++) {
          model.add(i, items[i]);

        }
        
        notesList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        notesList.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        notesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        notesList.setAutoscrolls(false);
        notesList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        notesList.setFixedCellHeight(100);
        notesList.setFixedCellWidth(115);
        notesList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        notesList.setVisibleRowCount(-1);
        jScrollPane1.setViewportView(notesList);
        
        notesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        notesList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    //qualquer acao com 2 cliques
                }
            }
        });
        removeNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                ListSelectionModel selmodel = notesList.getSelectionModel();
                int index = selmodel.getMinSelectionIndex();
                if (index >= 0)
                {
                    System.out.println(model.get(index));
                }
            }
        });
        editNoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                ListSelectionModel selmodel = notesList.getSelectionModel();
                int index = selmodel.getMinSelectionIndex();
                if (index >= 0)
                {
                    LastSelectedEdit = (String)model.get(index);
                    setContentPane(editNotePanel);
                    invalidate();
                    validate();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jColorChooser1 = new javax.swing.JColorChooser();
        mainPanel = new javax.swing.JPanel();
        addNoteButton = new javax.swing.JButton();
        removeNoteButton = new javax.swing.JButton();
        editNoteButton = new javax.swing.JButton();
        optionsButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        sortModeButton = new javax.swing.JButton();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 350));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(300, 300));

        addNoteButton.setBackground(new java.awt.Color(255, 255, 255));
        addNoteButton.setToolTipText("Add note");
        addNoteButton.setBorderPainted(false);
        addNoteButton.setFocusPainted(false);
        addNoteButton.setFocusable(false);
        addNoteButton.setMaximumSize(new java.awt.Dimension(25, 25));
        addNoteButton.setMinimumSize(new java.awt.Dimension(25, 25));
        addNoteButton.setPreferredSize(new java.awt.Dimension(30, 30));
        addNoteButton.setRequestFocusEnabled(false);
        addNoteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnAddNoteButtonClick(evt);
            }
        });

        removeNoteButton.setBackground(new java.awt.Color(255, 255, 255));
        removeNoteButton.setToolTipText("Remove note");
        removeNoteButton.setBorderPainted(false);
        removeNoteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        removeNoteButton.setFocusPainted(false);
        removeNoteButton.setPreferredSize(new java.awt.Dimension(30, 30));

        editNoteButton.setBackground(new java.awt.Color(255, 255, 255));
        editNoteButton.setToolTipText("Edit note");
        editNoteButton.setBorderPainted(false);
        editNoteButton.setFocusPainted(false);
        editNoteButton.setMaximumSize(new java.awt.Dimension(20, 20));
        editNoteButton.setMinimumSize(new java.awt.Dimension(20, 20));
        editNoteButton.setPreferredSize(new java.awt.Dimension(30, 30));
        editNoteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnEditButtonClick(evt);
            }
        });

        optionsButton.setBackground(new java.awt.Color(255, 255, 255));
        optionsButton.setToolTipText("Options");
        optionsButton.setBorderPainted(false);
        optionsButton.setFocusPainted(false);
        optionsButton.setPreferredSize(new java.awt.Dimension(30, 30));
        optionsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnOptionsButtonClicked(evt);
            }
        });

        helpButton.setBackground(new java.awt.Color(255, 255, 255));
        helpButton.setToolTipText("Help");
        helpButton.setBorderPainted(false);
        helpButton.setFocusPainted(false);
        helpButton.setMaximumSize(new java.awt.Dimension(20, 20));
        helpButton.setMinimumSize(new java.awt.Dimension(20, 20));
        helpButton.setPreferredSize(new java.awt.Dimension(30, 30));
        helpButton.setRequestFocusEnabled(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        notesList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        notesList.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        notesList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        notesList.setAutoscrolls(false);
        notesList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        notesList.setFixedCellHeight(100);
        notesList.setFixedCellWidth(115);
        notesList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        notesList.setVisibleRowCount(-1);
        jScrollPane1.setViewportView(notesList);

        jLabel1.setText("Sort by:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Creation date", "Reminder date" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(120, 30));

        sortModeButton.setBackground(new java.awt.Color(255, 255, 255));
        sortModeButton.setToolTipText("Sort orientation");
        sortModeButton.setBorderPainted(false);
        sortModeButton.setFocusPainted(false);
        sortModeButton.setPreferredSize(new java.awt.Dimension(30, 30));
        sortModeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnButtonSortByClick(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(addNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(optionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortModeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortModeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setupButtons() {
        addNoteButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_PLUS_SIGN));
        removeNoteButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_MINUS_SIGN));
        editNoteButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_EDIT_SIGN));
        helpButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_HELP_SIGN));
        optionsButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_OPTIONS_SIGN));
        sortModeButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_DOWN_SIGN));
    }
    
    private void OnButtonSortByClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnButtonSortByClick
        if(sortMode.equals(Constants.UP_TEXT)) {
            sortMode = Constants.DOWN_TEXT;
            sortModeButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_DOWN_SIGN));
        } else {
            sortMode = Constants.UP_TEXT;
            sortModeButton.setIcon(Constants.getButtonImageIcon(Constants.PATH_IMG_UP_SIGN));
        }
    }//GEN-LAST:event_OnButtonSortByClick

    private void OnOptionsButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnOptionsButtonClicked
        setContentPane(optionsPanel);
        invalidate();
        validate();
    }//GEN-LAST:event_OnOptionsButtonClicked

    private void OnAddNoteButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnAddNoteButtonClick
        setContentPane(addNotePanel);
        invalidate();
        validate();
    }//GEN-LAST:event_OnAddNoteButtonClick

    private void OnEditButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnEditButtonClick
        /*
        setContentPane(editNotePanel);
        invalidate();
        validate();
        */
    }//GEN-LAST:event_OnEditButtonClick

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNoteButton;
    private javax.swing.JButton editNoteButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton jButton7;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPanel mainPanel;
    public static javax.swing.JList<String> notesList;
    private javax.swing.JButton optionsButton;
    private javax.swing.JButton removeNoteButton;
    private javax.swing.JButton sortModeButton;
    // End of variables declaration//GEN-END:variables

    public JPanel getMainPanel() { return mainPanel; }
}
