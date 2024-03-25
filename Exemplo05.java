import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int a = leitor.nextInt();
        System.out.println("Agora, insira o valor de B:");
        int b = leitor.nextInt();

        System.out.println("Valores originais:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores trocados:");
        System.out.println("A: " + a);
        System.out.println("B: " + b);

        leitor.close();
    }
}
