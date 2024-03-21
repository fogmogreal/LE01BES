import java.util.Scanner;

public class Exemplo08{

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int numero = leitor .nextInt();

        if (numero > 50) {
            System.out.println("Número maior do que 50!");
        } else {
            System.out.println("Número menor ou igual a 50!");
        }

        leitor.close();
    }
}