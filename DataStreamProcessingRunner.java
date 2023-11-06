public class DataStreamProcessingRunner {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DataStreamProcessingGUI frame = new DataStreamProcessingGUI();
                frame.setVisible(true);
            }
        });
    }
}
