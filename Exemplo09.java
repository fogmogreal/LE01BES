import java.util.Scanner;

public class Exemplo09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int a = leitor.nextInt();

        System.out.println("Digite o valor de B:");
        int b = leitor.nextInt();
        if (a == b) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            if (a > b) {
                System.out.println("O número A é maior que o número B.");
            } else {
                System.out.println("O número B é maior que o número A.");
            }
        }

        leitor.close();
    }
}
