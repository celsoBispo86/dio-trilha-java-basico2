import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
       
         int numeroDaConta;
         String agencia;
         String nomeCliente;
         double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("por favor, digite o número da conta");
        numeroDaConta = scanner.nextInt();

    

        scanner.nextLine();

        System.out.println("digite o número da agência");
        agencia = scanner.nextLine();

         System.out.print("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
        nomeCliente, agencia, numeroDaConta, saldo);

    }
}