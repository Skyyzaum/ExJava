import javax.swing.JOptionPane;

// 18) Entrar com dois números e imprimi-los em ordem crescente (suponha números
// diferentes). 
public class ex18{
    static int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    static int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    public static void main(String[] args) {
        if(n1 > n2){
            System.out.println(n2 + "," + n1);
        }else{
            System.out.println(n1 + "," + n1);
        }
    }
}