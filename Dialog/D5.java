import javax.swing.JOptionPane;

public class D5 {
    public static void main(String[] args) {
       String f_name = JOptionPane.showInputDialog(null,"Enter your First_name :","Name",JOptionPane.QUESTION_MESSAGE);
       String l_name = JOptionPane.showInputDialog(null,"Enter your last_name :","Name",JOptionPane.QUESTION_MESSAGE);

       String name = f_name+" "+l_name;
       JOptionPane.showMessageDialog(null,"Your full name is : " + name, "Name", 0);
    }
}
