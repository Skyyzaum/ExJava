import javax.swing.JOptionPane;

//17) Entrar com dois números e imprimir o menor número (suponha números diferentes). 
public class ex17{
    static int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    static int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

    public static void main(String[] args) {
        if (n1 > n2) {
            System.out.println("o menor munero é" + n2);
        }else{
            System.out.println("o menor numero é " + n1);
        }
    }
}