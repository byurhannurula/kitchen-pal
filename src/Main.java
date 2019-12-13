
public class Main {

    public static void main(String[] args) {
        GUI gui = GUI.getInstance();
        
        java.awt.EventQueue.invokeLater(() -> {
            gui.setResizable(false);
            gui.setVisible(true);
        });
    }

}
