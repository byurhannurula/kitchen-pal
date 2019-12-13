package gui;

public class SecondaryUI extends javax.swing.JFrame {
    
    // Creates new form SecondaryUI
    public SecondaryUI() {
        initComponents();
        
        // Initial setup of components
        addButton.setVisible(false);
        likeButton.setVisible(false);
        cancelButton.setVisible(false);
        downloadButton.setVisible(false);
    }
    
    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layoutBackground = new javax.swing.JPanel();
        recipeDataPanel = new javax.swing.JPanel();
        captionTextfield = new javax.swing.JTextField();
        authorTextfield = new javax.swing.JTextField();
        categoryTextfield = new javax.swing.JTextField();
        likesLabel = new javax.swing.JLabel();
        recipeContentPanel = new javax.swing.JPanel();
        descriptionScrollPanel = new javax.swing.JScrollPane();
        descriptionTextarea = new javax.swing.JTextArea();
        recipeButtonsPanel = new javax.swing.JPanel();
        likeButton = new javax.swing.JButton();
        downloadButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        layoutBackground.setBackground(new java.awt.Color(255, 255, 255));
        layoutBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recipeDataPanel.setBackground(new java.awt.Color(35, 35, 217));
        recipeDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        captionTextfield.setEditable(false);
        captionTextfield.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        captionTextfield.setText("Recipe caption");
        captionTextfield.setToolTipText("");
        captionTextfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        captionTextfield.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        captionTextfield.setEnabled(false);
        captionTextfield.setOpaque(false);
        recipeDataPanel.add(captionTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 490, 70));

        authorTextfield.setEditable(false);
        authorTextfield.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        authorTextfield.setText("Recipe author");
        authorTextfield.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        authorTextfield.setEnabled(false);
        recipeDataPanel.add(authorTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 220, -1));

        categoryTextfield.setEditable(false);
        categoryTextfield.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        categoryTextfield.setText("Recipe category");
        categoryTextfield.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        categoryTextfield.setEnabled(false);
        recipeDataPanel.add(categoryTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 180, -1));

        likesLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        likesLabel.setForeground(new java.awt.Color(255, 255, 255));
        likesLabel.setText("Likes: 10");
        recipeDataPanel.add(likesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 60, 30));

        layoutBackground.add(recipeDataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 140));

        recipeContentPanel.setBackground(new java.awt.Color(242, 242, 242));
        recipeContentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descriptionScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        descriptionScrollPanel.setEnabled(false);

        descriptionTextarea.setEditable(false);
        descriptionTextarea.setColumns(20);
        descriptionTextarea.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        descriptionTextarea.setLineWrap(true);
        descriptionTextarea.setRows(5);
        descriptionTextarea.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris neque urna, tincidunt ut suscipit elementum, varius ut est. Quisque hendrerit, lacus quis pulvinar finibus, tellus mi aliquam orci, et condimentum risus leo ut urna. Aliquam porta metus ligula, vitae consectetur dui condimentum ut. Aliquam viverra ut nibh sed vulputate. Praesent malesuada sagittis placerat. Phasellus ut fermentum orci. Integer auctor quis metus sit amet vestibulum. In sed dolor id tortor ornare efficitur ut in tellus. Nam vitae nibh augue.  Pellentesque a erat et sapien tincidunt porttitor non sit amet lectus. Mauris et lorem vulputate, suscipit urna in, laoreet augue. In dapibus diam non sagittis interdum. Mauris ultrices sed justo eget lacinia. Mauris ac enim finibus risus aliquam pellentesque id a eros. Phasellus quam dui, cursus ut leo non, accumsan vulputate nisl. Aliquam tortor nibh, pharetra eget turpis ut, tempus pretium nunc. In rhoncus justo eget aliquam varius. Duis urna mi, dapibus et erat ullamcorper, accumsan ullamcorper erat. Nulla non massa mi. Mauris non venenatis diam, sed malesuada tellus. Nam finibus erat aliquam, egestas dui vitae, tincidunt nulla.  Duis eleifend viverra arcu sit amet eleifend. Mauris viverra dignissim lacus eu tristique. Nullam vehicula commodo nisi eget consectetur. Cras ultricies lectus nunc, sed rhoncus ante vestibulum eu. Maecenas dapibus a nisi eu mollis. Etiam convallis fringilla eros viverra eleifend. Fusce consequat nibh lorem. Morbi congue mi vitae vehicula sollicitudin. Pellentesque dictum semper purus ut placerat. Praesent laoreet mi id elit lobortis, at dignissim arcu suscipit. Donec tempor placerat massa, eu facilisis erat tempor sit amet.  Nulla facilisi. Vestibulum luctus ante leo, sit amet tempus odio malesuada sit amet. Donec placerat nibh sed metus convallis, a vulputate orci placerat. Vivamus eu rutrum turpis, nec imperdiet tortor. Fusce et leo et risus iaculis cursus nec sed dui. Pellentesque eleifend velit massa, ac maximus libero laoreet non. Suspendisse potenti. Phasellus elementum enim vitae lectus posuere, eu varius felis blandit. Vivamus pulvinar erat arcu, at vulputate nibh sagittis sed. Mauris porta semper nisi eget imperdiet. Mauris sem risus, eleifend sit amet convallis in, varius sagittis nisl. Sed vitae eros facilisis, venenatis mi quis, congue quam. Morbi ac magna et tortor lobortis tincidunt facilisis accumsan erat. Nam eget odio odio.  Quisque vehicula ex a nulla egestas scelerisque. Pellentesque et ex ex. Suspendisse sodales elementum euismod. Curabitur lacinia dui id eleifend malesuada. Nullam pulvinar eleifend nisi, et rhoncus nisi suscipit a. Nulla egestas scelerisque enim, eget viverra nunc efficitur eu. Praesent et leo at urna ullamcorper suscipit. Duis tincidunt id diam at euismod. Phasellus turpis eros, vestibulum at rutrum vitae, congue vitae arcu. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aliquam erat volutpat. Proin vel efficitur ipsum, eget consectetur nulla.");
        descriptionTextarea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        descriptionScrollPanel.setViewportView(descriptionTextarea);

        recipeContentPanel.add(descriptionScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 490, 460));

        recipeButtonsPanel.setLayout(new java.awt.GridLayout(1, 0));

        likeButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        likeButton.setForeground(new java.awt.Color(255, 51, 51));
        likeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/heart-icon.png"))); // NOI18N
        likeButton.setText("Like +1");
        likeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                likeButtonClicked(evt);
            }
        });
        recipeButtonsPanel.add(likeButton);

        downloadButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        downloadButton.setText("Download");
        recipeButtonsPanel.add(downloadButton);

        addButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        addButton.setText("Add Recipe");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonClicked(evt);
            }
        });
        recipeButtonsPanel.add(addButton);

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 51, 51));
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonClicked(evt);
            }
        });
        recipeButtonsPanel.add(cancelButton);

        recipeContentPanel.add(recipeButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 490, 40));

        layoutBackground.add(recipeContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 600, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonClicked

    private void addButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonClicked

    private void likeButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_likeButtonClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_likeButtonClicked

    public void activateReadingMode() {
        likeButton.setVisible(true);
        downloadButton.setVisible(true);
        
        captionTextfield.setEnabled(false);
        captionTextfield.setEditable(false);
        
        authorTextfield.setEnabled(false);
        authorTextfield.setEditable(false);
        
        categoryTextfield.setEnabled(false);
        categoryTextfield.setEditable(false);
        
        descriptionTextarea.setEnabled(false);
        descriptionTextarea.setEditable(false);
    }
    
    public void activateAddingMode() {
        addButton.setVisible(false);
        cancelButton.setVisible(false);
        
        captionTextfield.setEnabled(true);
        captionTextfield.setEditable(true);
        
        authorTextfield.setEnabled(true);
        authorTextfield.setEditable(true);
        
        categoryTextfield.setEnabled(true);
        categoryTextfield.setEditable(true);
        
        descriptionTextarea.setEnabled(true);
        descriptionTextarea.setEditable(true);
    }
    
    // @param args the command line arguments
    public static void main(String args[]) {
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondaryUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField authorTextfield;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField captionTextfield;
    private javax.swing.JTextField categoryTextfield;
    private javax.swing.JScrollPane descriptionScrollPanel;
    private javax.swing.JTextArea descriptionTextarea;
    private javax.swing.JButton downloadButton;
    private javax.swing.JPanel layoutBackground;
    private javax.swing.JButton likeButton;
    private javax.swing.JLabel likesLabel;
    private javax.swing.JPanel recipeButtonsPanel;
    private javax.swing.JPanel recipeContentPanel;
    private javax.swing.JPanel recipeDataPanel;
    // End of variables declaration//GEN-END:variables
}
