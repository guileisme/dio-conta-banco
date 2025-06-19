import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double num_saldo = 485.27;
        String name;
        int conta_num;
        int agencia_num;
        System.out.print("Digite o seu nome: ");
        name = Scanner.nextLine();
        System.out.print("Olá, " + name + ". Digite os números indicados em cada campo.");
        // Número da conta
        System.out.print("\nNúmero da conta: ");
        conta_num = Scanner.nextInt();
        // Número da Agência
        System.out.print("Número da agência: ");
        agencia_num = Scanner.nextInt();
        System.out.print("Olá, " + name + "! obrigado por criar uma conta em " +
                "nosso banco, sua agência é " + agencia_num + ", conta " + conta_num + " e seu saldo " + num_saldo + " já está disponível para saque");
    }
}