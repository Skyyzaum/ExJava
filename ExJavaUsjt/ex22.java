import javax.swing.JOptionPane;

// 22) Ler três números e armazenar o maior número na variável de nome maior (suponha
// números diferentes).
public class ex22{
    static int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    static int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    static int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    public static void main(String[] args) {
        if (n1 > n2) {
            if (n1 > n3){
                int nomeMaior = n1;
                System.out.println(nomeMaior);
            }else {
                int nomeMaior = n3;
                System.out.println(nomeMaior);
            }
        } else if (n2 > n1){
            if(n2 > n3){
                int nomeMaior = n2;
                System.out.println(nomeMaior);
            }
        }
    }
}