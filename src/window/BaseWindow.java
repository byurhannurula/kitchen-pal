package window;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import recipe.Recipe;
import storage.DataUtils;

public class BaseWindow extends javax.swing.JFrame implements Window {

    // Variables declaration for UI elements
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField authorField;
    private javax.swing.JTextField categoryField;
    private javax.swing.JTextArea descriptionTextarea;
    private javax.swing.JScrollPane descriptionScrollPanel;
    private javax.swing.JPanel layoutBackground;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel dataPanel;
    // End of variables declaration

    private DataUtils db;

    public BaseWindow() {
        initComponents();
        db = new DataUtils();
    }

    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        categoryField = new javax.swing.JTextField();
        descriptionTextarea = new javax.swing.JTextArea();
        descriptionScrollPanel = new javax.swing.JScrollPane();
        layoutBackground = new javax.swing.JPanel();
        contentPanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        dataPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        layoutBackground.setBackground(new java.awt.Color(255, 255, 255));
        layoutBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataPanel.setBackground(new java.awt.Color(35, 35, 217));
        dataPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nameField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        dataPanel.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 490, 70));

        authorField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        authorField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        dataPanel.add(authorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 240, -1));

        categoryField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        categoryField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        dataPanel.add(categoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 240, -1));

        layoutBackground.add(dataPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 140));

        contentPanel.setBackground(new java.awt.Color(242, 242, 242));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descriptionScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        descriptionScrollPanel.setEnabled(false);

        descriptionTextarea.setRows(5);
        descriptionTextarea.setColumns(20);
        descriptionTextarea.setLineWrap(true);
        descriptionTextarea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        descriptionTextarea.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        descriptionScrollPanel.setViewportView(descriptionTextarea);

        contentPanel.add(descriptionScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 490, 460));
        buttonsPanel.setLayout(new java.awt.GridLayout(1, 0));

        addButton.setVisible(false);
        addButton.setText("Add Recipe");
        addButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonClicked(evt);
            }
        });
        buttonsPanel.add(addButton);

        cancelButton.setVisible(false);
        cancelButton.setText("Cancel");
        cancelButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dispose();
            }
        });
        buttonsPanel.add(cancelButton);

        contentPanel.add(buttonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 490, 40));

        layoutBackground.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 600, 590));

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

    private void addButtonClicked(java.awt.event.MouseEvent evt) {
        ArrayList<Recipe> arr = new ArrayList();
        Recipe newRecipe = new Recipe();

        newRecipe.setName(nameField.getText());
        newRecipe.setAuthor(authorField.getText());
        newRecipe.setCategory(categoryField.getText());
        newRecipe.setRecipeDescription(descriptionTextarea.getText());

        arr.add(newRecipe);

        db.writeLine(arr);

        JOptionPane.showMessageDialog(this, "Successfully added. Thank you!");
        this.dispose();
    }

    public void activateAddingMode() {
        addButton.setVisible(true);
        cancelButton.setVisible(true);

        nameField.setEditable(true);
        authorField.setEditable(true);
        categoryField.setEditable(true);
        descriptionTextarea.setEditable(true);
    }

    public void activateReadingMode() {
        nameField.setEditable(false);
        authorField.setEditable(false);
        categoryField.setEditable(false);
        descriptionTextarea.setEditable(false);
    }

    @Override
    public void renderWindow() {
        java.awt.EventQueue.invokeLater(() -> {
            this.setResizable(false);
            this.setVisible(true);
        });
    }

    @Override
    public void getRecipeData(Recipe r) {
    }

    // Setters for fields
    public void setNameField(String name) {
        nameField.setText(name);
    }

    public void setAuthorField(String author) {
        authorField.setText(author);
    }

    public void setCategoryField(String category) {
        categoryField.setText(category);
    }

    public void setDescriptionField(String description) {
        descriptionTextarea.setText(description);
    }
}
