import javax.swing.JOptionPane;
// 13) Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das
// dezenas é par ou ímpar. 
public class aulaChico{
    
    public static void main(final String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite numero interio"));
            if (n1 % 2 == 0) {
                System.out.println("Este numero é par");
            }else {
                System.out.println("Este numero é Impar");
        }
    }

}