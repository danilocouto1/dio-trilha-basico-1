import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int conta = scanner.nextInt();
        System.out.println("Digite o numero da agencia: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        
        
        String msg = String.format(
                "Ola %s, obrigado por criar uma conta em nosso banco, sua agencia %d, conta %d e seu saldo %.2f ja esta disponivel para saque",
                nome, agencia, conta, saldo);
        System.out.println(msg);
        
        
        scanner.close();

    }
}
