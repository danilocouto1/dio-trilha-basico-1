import java.util.Scanner;

/*
 * Programa terminal onde entrada de dados é formatada para que tenha uma saida com a frase dos dados inseridos pelo usuario.
 * 
 * Autor : Danilo Couto - 17/07/2023 Jequié-Ba
 */

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Adicionando o scanner ao projeto
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.println("Digite o numero da conta: ");
        int conta = scanner.nextInt();
        System.out.println("Digite o numero da agencia: ");
        int agencia = scanner.nextInt();
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        
        //Formatacao da string
        String msg = String.format(
                "Ola %s, obrigado por criar uma conta em nosso banco, sua agencia %d, conta %d e seu saldo %.2f ja esta disponivel para saque",
                nome, agencia, conta, saldo);
        
        //Saida dos dados
        System.out.println(msg);
        
        //Fechando o Scanner
        scanner.close();

    }
}
