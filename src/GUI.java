
import recipe.Recipe;
import storage.DataUtils;
import storage.SortData;
import storage.Storage;
import window.BaseWindow;
import window.AddWindow;
import window.Window;

public class GUI extends javax.swing.JFrame {

    // Variables declaration - do not modify                     
    private javax.swing.JPanel allRecipesButton;
    private javax.swing.JLabel buttonIcon1;
    private javax.swing.JLabel buttonIcon2;
    private javax.swing.JLabel buttonLabel1;
    private javax.swing.JLabel buttonLabel2;
    private javax.swing.JTable dataTable;
    private javax.swing.JPanel layoutBackground;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainHeader;
    private javax.swing.JPanel newRecipeButton;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JScrollPane tableBackground;
    // End of variables declaration  

    private Window wnd;
    private Recipe mRecipe;
    Storage db = new SortData();
    
    private static GUI instance = null;

    public static GUI getInstance() {
        if (instance == null) {
            return new GUI();
        }
        return instance;
    }

    private GUI() {
        initComponents();
    }

    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        layoutBackground = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        newRecipeButton = new javax.swing.JPanel();
        buttonIcon1 = new javax.swing.JLabel();
        buttonLabel1 = new javax.swing.JLabel();
        allRecipesButton = new javax.swing.JPanel();
        buttonIcon2 = new javax.swing.JLabel();
        buttonLabel2 = new javax.swing.JLabel();
        mainHeader = new javax.swing.JPanel();
        tableBackground = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CookingPal - Your Best Friend For Cooking");

        layoutBackground.setBackground(new java.awt.Color(255, 255, 255));
        layoutBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePanel.setBackground(new java.awt.Color(35, 35, 217));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 254, 255));
        logoLabel.setText("CookingPal");
        sidePanel.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        newRecipeButton.setBackground(new java.awt.Color(82, 96, 235));
        newRecipeButton.setMaximumSize(new java.awt.Dimension(250, 35));
        newRecipeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newRecipeButtonClicked(evt);
            }
        });
        newRecipeButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonIcon1.setBackground(new java.awt.Color(255, 0, 204));
        buttonIcon1.setForeground(new java.awt.Color(255, 255, 255));
        buttonIcon1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        buttonIcon1.setAlignmentY(1.0F);
        buttonIcon1.setIconTextGap(2);
        newRecipeButton.add(buttonIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        buttonLabel1.setBackground(new java.awt.Color(255, 255, 255));
        buttonLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonLabel1.setForeground(new java.awt.Color(255, 255, 255));
        buttonLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        buttonLabel1.setText("New Recipe");
        newRecipeButton.add(buttonLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));

        sidePanel.add(newRecipeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 40));

        allRecipesButton.setBackground(new java.awt.Color(48, 63, 217));
        allRecipesButton.setMaximumSize(new java.awt.Dimension(250, 35));
        allRecipesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allRecipesButtonClicked(evt);
            }
        });
        allRecipesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonIcon2.setBackground(new java.awt.Color(255, 255, 255));
        buttonIcon2.setForeground(new java.awt.Color(255, 255, 255));
        buttonIcon2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/book-opened-icon.png"))); // NOI18N
        buttonIcon2.setAlignmentY(1.0F);
        buttonIcon2.setIconTextGap(2);
        buttonIcon2.setMaximumSize(new java.awt.Dimension(24, 24));
        buttonIcon2.setMinimumSize(new java.awt.Dimension(24, 24));
        allRecipesButton.add(buttonIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        buttonLabel2.setBackground(new java.awt.Color(255, 255, 255));
        buttonLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonLabel2.setForeground(new java.awt.Color(255, 255, 255));
        buttonLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        buttonLabel2.setText("All Recipes");
        allRecipesButton.add(buttonLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));

        sidePanel.add(allRecipesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 40));

        layoutBackground.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));
        sidePanel.getAccessibleContext().setAccessibleName("sideBar");

        mainHeader.setBackground(new java.awt.Color(82, 96, 235));

        javax.swing.GroupLayout mainHeaderLayout = new javax.swing.GroupLayout(mainHeader);
        mainHeader.setLayout(mainHeaderLayout);
        mainHeaderLayout.setHorizontalGroup(
                mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 622, Short.MAX_VALUE)
        );
        mainHeaderLayout.setVerticalGroup(
                mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        layoutBackground.add(mainHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 622, 100));

        tableBackground.setForeground(new java.awt.Color(255, 255, 255));
        tableBackground.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableBackground.setHorizontalScrollBar(null);

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Caption", "Author", "Category", "Likes"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        dataTable.setEnabled(false);
        dataTable.setGridColor(new java.awt.Color(245, 234, 234));
        dataTable.setIntercellSpacing(new java.awt.Dimension(1, 5));
        tableBackground.setViewportView(dataTable);

        layoutBackground.add(tableBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 622, 460));

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
    }// </editor-fold>

    private void newRecipeButtonClicked(java.awt.event.MouseEvent evt) {
        wnd = new AddWindow(new BaseWindow());
        wnd.extend();
        
    }

    private void allRecipesButtonClicked(java.awt.event.MouseEvent evt) {
        db.getData();
    }

}
