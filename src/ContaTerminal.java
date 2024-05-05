import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Agência !");
        int numAgencia = scanner.nextInt();
        
        System.out.println("Digite sua Agência !");
        String agencia = scanner.next();

        System.out.println("Digite seu nome !");
        String nome = scanner.next();
        
        System.out.println("Digite seu saldo !");
        float saldo = scanner.nextFloat();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco");
        System.out.println("sua agência é " + agencia + ",");
        System.out.println("Conta " + numAgencia);
        System.out.println("e seu saldo " + saldo + " já está disponível para saque.");
        
        
    }
}

