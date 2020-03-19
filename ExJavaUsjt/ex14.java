import javax.swing.JOptionPane;

// 14) Ler um número inteiro de 4 casas e imprimir se é ou não múltiplo de quatro o núuero
// formado pelos algarismos que estão nas casas das unidades de milhar e das centenas
public class ex14{
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero interio"));

        if(n1 % 4 == 0){
            System.out.println("ele é multiplo de 4");
        }else{
            System.out.println("ele nao é multipli de 4");
        }
    }
}