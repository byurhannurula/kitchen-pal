package gui;

public class MainUI extends javax.swing.JFrame {

    // Creates new form UI
    public MainUI() {
        initComponents();
    }

     
    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layoutBackground = new javax.swing.JPanel();
        mainHeader = new javax.swing.JPanel();
        newRecipeButton = new javax.swing.JPanel();
        buttonLabel1 = new javax.swing.JLabel();
        allRecipesButton = new javax.swing.JPanel();
        buttonLabel2 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        tableBackground = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CookingPal - Your Best Friend For Cooking");
        setResizable(false);

        layoutBackground.setBackground(new java.awt.Color(255, 255, 255));
        layoutBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainHeader.setBackground(new java.awt.Color(35, 35, 217));

        newRecipeButton.setBackground(new java.awt.Color(57, 57, 223));
        newRecipeButton.setMaximumSize(new java.awt.Dimension(250, 35));
        newRecipeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newRecipeButtonClicked(evt);
            }
        });
        newRecipeButton.setLayout(new java.awt.BorderLayout());

        buttonLabel1.setBackground(new java.awt.Color(255, 255, 255));
        buttonLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonLabel1.setForeground(new java.awt.Color(255, 255, 255));
        buttonLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonLabel1.setText("New Recipe");
        newRecipeButton.add(buttonLabel1, java.awt.BorderLayout.CENTER);

        allRecipesButton.setBackground(new java.awt.Color(57, 57, 223));
        allRecipesButton.setMaximumSize(new java.awt.Dimension(250, 35));
        allRecipesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allRecipesButtonClicked(evt);
            }
        });
        allRecipesButton.setLayout(new java.awt.BorderLayout());

        buttonLabel2.setBackground(new java.awt.Color(255, 255, 255));
        buttonLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonLabel2.setForeground(new java.awt.Color(255, 255, 255));
        buttonLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonLabel2.setText("Refresh");
        allRecipesButton.add(buttonLabel2, java.awt.BorderLayout.CENTER);

        logoLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 254, 255));
        logoLabel.setText("CookingPal");

        javax.swing.GroupLayout mainHeaderLayout = new javax.swing.GroupLayout(mainHeader);
        mainHeader.setLayout(mainHeaderLayout);
        mainHeaderLayout.setHorizontalGroup(
            mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 534, Short.MAX_VALUE)
                .addGroup(mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newRecipeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allRecipesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        mainHeaderLayout.setVerticalGroup(
            mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainHeaderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(mainHeaderLayout.createSequentialGroup()
                        .addComponent(newRecipeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(allRecipesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logoLabel))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layoutBackground.add(mainHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 130));

        tableBackground.setForeground(new java.awt.Color(255, 255, 255));
        tableBackground.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableBackground.setHorizontalScrollBar(null);

        dataTable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Author", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.setEnabled(false);
        dataTable.setGridColor(new java.awt.Color(245, 234, 234));
        dataTable.setRowHeight(18);
        dataTable.setRowMargin(8);
        dataTable.getTableHeader().setResizingAllowed(false);
        dataTable.getTableHeader().setReorderingAllowed(false);
        tableBackground.setViewportView(dataTable);

        layoutBackground.add(tableBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 860, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newRecipeButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newRecipeButtonClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_newRecipeButtonClicked

    private void allRecipesButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allRecipesButtonClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_allRecipesButtonClicked

    // @param args the command line arguments
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allRecipesButton;
    private javax.swing.JLabel buttonLabel1;
    private javax.swing.JLabel buttonLabel2;
    private javax.swing.JTable dataTable;
    private javax.swing.JPanel layoutBackground;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainHeader;
    private javax.swing.JPanel newRecipeButton;
    private javax.swing.JScrollPane tableBackground;
    // End of variables declaration//GEN-END:variables

}
