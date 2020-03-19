import javax.swing.JOptionPane;

// Ler três números e escrever o maior número (suponha números diferentes)
public class ex21{
    static int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    static int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    static int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    public static void main(String[] args) {
        if (n1 > n2) {
            if (n1 > n3){
                System.out.println(n1);
            }else {
                System.out.println(n3);
            }
        } else if (n2 > n1){
            if(n2 > n3){
                System.out.println(n2);
            }
        }
    }
}