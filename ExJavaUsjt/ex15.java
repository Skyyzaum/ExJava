import javax.swing.JOptionPane;

// 15) Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da
// pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido.
public class ex15{
    String data = JOptionPane.showInputDialog("Digite sua data de nascimento");
    static int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite a Data atual"));

    public void informarIdade(){
        String array[] = new String[3];

        array = data.split("/");
       // foru
    }

    public static void main(final String[] args) {
        System.out.println();
        if (anoAtual > 2020) {
            System.out.println("E um ano valido");
        }
    }
}