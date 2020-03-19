import javax.swing.JOptionPane;

// 19) Entrar com dois números e imprimi-los em ordem decrescente (suponha números
// diferentes). 
public class ex19{
    static int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    static int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    public static void main(String[] args) {
        if(n1 > n2){
            System.out.println(n1 + "," + n2);
        }else{
            System.out.println(n2 + "," + n1);
        }
    }
}