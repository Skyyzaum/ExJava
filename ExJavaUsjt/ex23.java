// 23) Ler três números e armazená-los em três variáveis com os seguintes nomes, de acordo
// com seus valores relativos: maior, intermediário e menor (suponha números diferentes). 
import javax.swing.JOptionPane;
public class ex23{
    static int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    static int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    static int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    public static void main(String[] args) {
        if (n1 > n2) {
            if (n1 > n3){
                int menor = n2;
                int intermediário = n3;
                int maior = n1;
                System.out.println(maior + intermediário + menor);
            }else {
                int menor = n2;
                int intermediário = n1;
                int maior = n3;
                System.out.println(maior + intermediário + menor);
            }
        } else if (n2 > n1){
            if(n2 > n3){
                int menor = n1;
                int intermediário = n3;
                int maior = n2;
                System.out.println(maior + intermediário + menor);
            }
        }
    }
}