
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

import recipe.Recipe;
import storage.Storage;
import storage.SortData;

import window.BaseWindow;
import window.ReadWindow;
import window.AddWindow;
import window.Window;

public class GUI extends javax.swing.JFrame {

    // Variables declaration - do not modify
    private DefaultTableModel tableModel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel buttonLabel1;
    private javax.swing.JLabel buttonLabel2;
    private javax.swing.JPanel mainHeader;
    private javax.swing.JPanel newRecipeButton;
    private javax.swing.JPanel refreshTableButton;
    private javax.swing.JPanel layoutBackground;
    private javax.swing.JScrollPane tableBackground;
    private javax.swing.JTable dataTable;
    // End of variables declaration  

    private Window wnd;
    private Recipe recipe;
    private ArrayList<Recipe> recipeList;

    Storage db = new SortData();
    private static GUI instance = null;

    public static GUI getInstance() {
        if (instance == null) {
            return new GUI();
        }
        return instance;
    }

    private GUI() {
        initComponents(); // Create UI components
        initData(); // Gets data from .csv to recipeList
        fillTable(); // Gets data from recipeList and fills the table
    }

    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        tableBackground = new javax.swing.JScrollPane();
        layoutBackground = new javax.swing.JPanel();
        refreshTableButton = new javax.swing.JPanel();
        newRecipeButton = new javax.swing.JPanel();
        mainHeader = new javax.swing.JPanel();
        buttonLabel1 = new javax.swing.JLabel();
        buttonLabel2 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        dataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KitchenPal - Your Best Friend in the Kitchen");

        layoutBackground.setBackground(new java.awt.Color(255, 255, 255));
        layoutBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainHeader.setBackground(new java.awt.Color(35, 35, 217));

        newRecipeButton.setBackground(new java.awt.Color(57, 57, 223));
        newRecipeButton.setMaximumSize(new java.awt.Dimension(250, 35));
        newRecipeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newRecipeButtonClicked(evt);
            }
        });
        newRecipeButton.setLayout(new java.awt.BorderLayout());

        buttonLabel1.setText("New Recipe");
        buttonLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonLabel1.setForeground(new java.awt.Color(255, 255, 255));
        buttonLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        newRecipeButton.add(buttonLabel1, java.awt.BorderLayout.CENTER);

        refreshTableButton.setBackground(new java.awt.Color(57, 57, 223));
        refreshTableButton.setMaximumSize(new java.awt.Dimension(250, 35));
        refreshTableButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allRecipesButtonClicked(evt);
            }
        });
        refreshTableButton.setLayout(new java.awt.BorderLayout());

        buttonLabel2.setText("Refresh");
        buttonLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonLabel2.setForeground(new java.awt.Color(255, 255, 255));
        buttonLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refreshTableButton.add(buttonLabel2, java.awt.BorderLayout.CENTER);

        logoLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 254, 255));
        logoLabel.setText("CookingPal");

        javax.swing.GroupLayout mainHeaderLayout = new javax.swing.GroupLayout(mainHeader);
        mainHeader.setLayout(mainHeaderLayout);
        mainHeaderLayout.setHorizontalGroup(mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainHeaderLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(logoLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 534, Short.MAX_VALUE)
                    .addGroup(mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(newRecipeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshTableButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
        );
        mainHeaderLayout.setVerticalGroup(mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainHeaderLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                        .addGroup(mainHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(mainHeaderLayout.createSequentialGroup()
                            .addComponent(newRecipeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(refreshTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(logoLabel))
                    .addContainerGap(23, Short.MAX_VALUE))
        );

        layoutBackground.add(mainHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 130));

        tableBackground.setForeground(new java.awt.Color(255, 255, 255));
        tableBackground.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableBackground.setHorizontalScrollBar(null);

        dataTable.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Name", "Author", "Category"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        dataTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                initDetail(dataTable.getSelectedRow());
            }
        });

        
        dataTable.setRowHeight(26);
        dataTable.setRowMargin(14);
        dataTable.setDragEnabled(false);
        dataTable.getTableHeader().setResizingAllowed(false);
        dataTable.getTableHeader().setReorderingAllowed(false);
        dataTable.setGridColor(new java.awt.Color(245, 234, 234));
        dataTable.setIntercellSpacing(new java.awt.Dimension(1, 5));
        
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
    }// </editor-fold>

    // Event methods
    private void newRecipeButtonClicked(java.awt.event.MouseEvent evt) {
        wnd = new AddWindow(new BaseWindow());
        wnd.renderWindow();
    }

    private void allRecipesButtonClicked(java.awt.event.MouseEvent evt) {
        refreshTableData();
    }

    // Data methods
    private void initData() {
        recipeList = db.getData();
    }

    private void initDetail(int selectedRow) {
        recipe = recipeList.get(selectedRow);

        wnd = new ReadWindow(new BaseWindow());
        wnd.renderWindow();
        wnd.getRecipeData(recipe);
    }

    private void fillTable() {
        tableModel = (DefaultTableModel) dataTable.getModel();
        Object rowData[] = new Object[3];

        for (int i = 0; i < recipeList.size(); i++) {
            rowData[0] = recipeList.get(i).getName();
            rowData[1] = recipeList.get(i).getAuthor();
            rowData[2] = recipeList.get(i).getCategory();

            tableModel.addRow(rowData);
        }
    }

    private void refreshTableData() {
        tableModel.setRowCount(0);
        initData();
        fillTable();
    }

}
