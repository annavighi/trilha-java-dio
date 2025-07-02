import java.util.Scanner;

public class ContaTerminal
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Número da conta: ");
            int accountNum = scanner.nextInt();
            scanner.nextLine();
        System.out.println("Nome completo: ");
            String name = scanner.nextLine();
        System.out.println("Agência: ");
            String ag = scanner.nextLine();
        System.out.println("Saldo: ");
            Double balance = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + ag + ", conta " + accountNum + " e seu saldo de " + balance + " já está disponível para saque.");
    }
}