import javax.swing.JOptionPane;

// 24) Ler cinco números e identificar o maior e o menor de todos (NÃO suponha números
// diferentes).
public class ex24 {
    static int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    static int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    static int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    static int n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    static int n5 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
    public static void main(String[] args) {
        if(n1 > n2){
            if (n1>n3){
                if(n1 > n4){
                    if (n1 > n5){
                        System.out.println(n1);
                    }
                }else if (n4 > n5){
                    System.out.println(n4);
                }
            }else if (n3 > n4){
                if (n3 > n5){
                    System.out.println(n3);
                }
            }else if (n4 > n5){
                System.out.println(n4);
            }
        }else {
            if(n2 > n3){
                if(n2 > n4){
                    if (n2 > n5){
                        System.out.println(n2);
                    }
                }else if (n4 > n5){
                    System.out.println(n4);
                }
            }else if (n3 > n4){
                if(n3 > n5){
                    System.out.println(n3);
                }   
            }else if (n4 > n5){
                System.out.println(n4);
            }
        }
    }
}