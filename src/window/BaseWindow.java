package window;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import recipe.Recipe;
import storage.DataUtils;

public class BaseWindow extends javax.swing.JFrame implements Window {

    // Variables declaration - do not modify                     
    private javax.swing.JButton addButton;
    private javax.swing.JTextField authorTextfield;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField nameTextfield;
    private javax.swing.JTextField categoryTextfield;
    private javax.swing.JScrollPane descriptionScrollPanel;
    private javax.swing.JTextArea descriptionTextarea;
    private javax.swing.JPanel layoutBackground;
    private javax.swing.JPanel recipeButtonsPanel;
    private javax.swing.JPanel recipeContentPanel;
    private javax.swing.JPanel recipeDataPanel;
    // End of variables declaration

    private DataUtils db;

    public BaseWindow() {
        initComponents();
        db = new DataUtils();

        // Initial setup of components
        addButton.setVisible(false);
        cancelButton.setVisible(false);
    }

    public void setNameField(String name) {
        nameTextfield.setText(name);
    }

    public void setAuthorField(String author) {
        authorTextfield.setText(author);
    }

    public void setCategoryField(String category) {
        categoryTextfield.setText(category);
    }

    public void setDescriptionField(String description) {
        descriptionTextarea.setText(description);
    }

    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        layoutBackground = new javax.swing.JPanel();
        recipeDataPanel = new javax.swing.JPanel();
        nameTextfield = new javax.swing.JTextField();
        authorTextfield = new javax.swing.JTextField();
        categoryTextfield = new javax.swing.JTextField();
        recipeContentPanel = new javax.swing.JPanel();
        descriptionScrollPanel = new javax.swing.JScrollPane();
        descriptionTextarea = new javax.swing.JTextArea();
        recipeButtonsPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        layoutBackground.setBackground(new java.awt.Color(255, 255, 255));
        layoutBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        recipeDataPanel.setBackground(new java.awt.Color(35, 35, 217));
        recipeDataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameTextfield.setEditable(false);
        nameTextfield.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        nameTextfield.setText("");
        nameTextfield.setToolTipText("");
        nameTextfield.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nameTextfield.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nameTextfield.setEnabled(false);
        nameTextfield.setOpaque(false);
        recipeDataPanel.add(nameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 490, 70));

        authorTextfield.setEditable(false);
        authorTextfield.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        authorTextfield.setText("");
        authorTextfield.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        authorTextfield.setEnabled(false);
        recipeDataPanel.add(authorTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 220, -1));

        categoryTextfield.setEditable(false);
        categoryTextfield.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        categoryTextfield.setText("");
        categoryTextfield.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        categoryTextfield.setEnabled(false);
        recipeDataPanel.add(categoryTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 180, -1));

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
        descriptionTextarea.setText("");
        descriptionTextarea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        descriptionScrollPanel.setViewportView(descriptionTextarea);

        recipeContentPanel.add(descriptionScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 490, 460));
        recipeButtonsPanel.setLayout(new java.awt.GridLayout(1, 0));

        addButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        addButton.setText("Add Recipe");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
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
            @Override
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
    }// </editor-fold>

    private void cancelButtonClicked(java.awt.event.MouseEvent evt) {
        dispose();
    }

    private void addButtonClicked(java.awt.event.MouseEvent evt) {
        ArrayList<Recipe> arr = new ArrayList();
        Recipe newRecipe = new Recipe();

        newRecipe.setName(nameTextfield.getText());
        newRecipe.setAuthor(authorTextfield.getText());
        newRecipe.setCategory(categoryTextfield.getText());
        newRecipe.setRecipeDescription(descriptionTextarea.getText());

        arr.add(newRecipe);

        db.writeLine(arr);
        JOptionPane.showMessageDialog(this, "Successfully added. Thank you!");
        this.dispose();
    }

    public void activateReadingMode() {
        nameTextfield.setEnabled(false);
        nameTextfield.setEditable(false);

        authorTextfield.setEnabled(false);
        authorTextfield.setEditable(false);

        categoryTextfield.setEnabled(false);
        categoryTextfield.setEditable(false);

        descriptionTextarea.setEnabled(false);
        descriptionTextarea.setEditable(false);
    }

    public void activateAddingMode() {
        addButton.setVisible(true);
        cancelButton.setVisible(true);

        nameTextfield.setEnabled(true);
        nameTextfield.setEditable(true);

        authorTextfield.setEnabled(true);
        authorTextfield.setEditable(true);

        categoryTextfield.setEnabled(true);
        categoryTextfield.setEditable(true);

        descriptionTextarea.setEnabled(true);
        descriptionTextarea.setEditable(true);

    }

    @Override
    public void extend() {
        java.awt.EventQueue.invokeLater(() -> {
            this.setResizable(false);
            this.setVisible(true);
        });
    }

    @Override
    public void getRecipeData(Recipe r) {
    }
}
