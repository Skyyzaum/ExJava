import javax.swing.JOptionPane;

public class ex16{
    static int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    static int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

    public static void main(String[] args) {
        if (n1 == n2) {
            System.out.println("Estes numeros sao iguais");

        }
        System.out.println("Esses numeros sao diferentes");
    }
}