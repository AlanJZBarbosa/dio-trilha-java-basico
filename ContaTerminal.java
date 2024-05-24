import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite seu nome: ");
    String nomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o número da conta: ");
    int numero = scanner.nextInt();
    
    System.out.println("Por favor, digite o número da sua agência: ");
    int agencia = scanner.nextInt();

    System.out.println("Agora digite seu saldo: ");
    double saldo = scanner.nextDouble();

    System.out.println("Olá,"+ nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta" + numero + "e seu saldo" + saldo + "ja está disponivel para saque.");

    }
}