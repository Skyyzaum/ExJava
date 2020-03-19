import javax.swing.JOptionPane;

// 20) Criar um algoritmo que deixe entrar com dois números e imprimir o quadrado do menor
// número e a raiz quadrada do maior número, se for possível (suponha números diferentes).
public class ex20{
    static int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    static int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    public static void main(String[] args) {
        if(n1 > n2){
            int quadrado = (int) Math.sqrt(n1);
            System.out.println("o quadrado de" + n1 + " é" + quadrado);
        }else{
            int quadrada = (int) Math.sqrt(n2);
            System.out.println("o quadrado de" + n1 + " é" + quadrada);
        }
    }
}