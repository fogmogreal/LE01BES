import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");

        int numero = leitor.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está dentro do intervalo entre 100 e 200.");
        } else {
            System.out.println("O número não está dentro do intervalo entre 100 e 200.");
        }

        leitor.close();
    }
}
