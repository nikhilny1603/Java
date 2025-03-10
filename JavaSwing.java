import javax.swing.JOptionPane;

class JavaSwing{
    public static void main(String []args){
        String name = JOptionPane.showInputDialog("Enter your Name ");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age "));
        JOptionPane.showMessageDialog(null,"Your age is "+age);
    }
}