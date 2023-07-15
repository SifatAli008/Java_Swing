import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class D3 {
    public static void main(String[] args) {
        ImageIcon icon = new  ImageIcon("password.png");// createing icon class for useing own icon
     
        JOptionPane.showMessageDialog(null,"wrong password" ,"warning", JOptionPane.PLAIN_MESSAGE,icon);
    }
}
