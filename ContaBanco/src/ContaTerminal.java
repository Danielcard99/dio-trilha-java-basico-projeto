import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        Integer numeroDaConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        String numeroDaAgencia = scanner.next();
        System.out.println("Por favor, digite o seu nome!");
        scanner.nextLine();
        String nomeDoCliente = scanner.nextLine();
        System.out.println("Por favor, digite o seu saldo!");
        Double saldoDaConta = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + numeroDaAgencia + ", conta " + numeroDaConta + " e seu saldo " + saldoDaConta
                        + " já está disponível para saque.");

        scanner.close();

    }
}
