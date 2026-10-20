
import javax.swing.SwingUtilities;
import view.MainWindow;

public class Main {
    public static void main(String[] args) {
        String[] namaKarakter = {
            "Archer",
            "Knight",
            "Mage",
            "Assassin",
            "Paladin"

        
        };

        int[] levelKarakter = {
            10, 20, 30, 40, 50
        };

        SwingUtilities.invokeLater(() -> {
            new MainWindow(namaKarakter, levelKarakter);
        });
    }
}
