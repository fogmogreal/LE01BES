import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero1 = leitor.nextDouble();

        System.out.println("Digite outro número:");
        double numero2 = leitor.nextDouble();

        double calcular = numero1 + numero2;

        System.out.println("A soma dos números é: " + calcular);

        leitor.close();
    }
}
