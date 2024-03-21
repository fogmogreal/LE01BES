import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero1 = leitor.nextDouble();

        System.out.println("Digite outro número:");
        double numero2 = leitor.nextDouble();

        double somar = numero1 + numero2;
        double subtrair = numero1 - numero2;
        double multiplicar = numero1 * numero2;
        double dividir = numero1 / numero2;

        System.out.println("A soma dos números é: " + somar);
        System.out.println("A subtração dos números é: " + subtrair);
        System.out.println("A multiplicação dos números é: " + multiplicar);
        System.out.println("A divisão dos números é: " + dividir);

        leitor.close();
    }
}