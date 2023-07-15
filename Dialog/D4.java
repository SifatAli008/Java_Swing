import javax.swing.JOptionPane;

public class D4 {
    public static void main(String[] args) {
      String name = JOptionPane.showInputDialog(null, "Enter your name : ");
      JOptionPane.showMessageDialog(null, name+" Welcome to swing.", "Your Name.", JOptionPane.PLAIN_MESSAGE);
    }
}
