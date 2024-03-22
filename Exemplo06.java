import java.util.Scanner;

public class Exemplo06 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira a temperatura: " );
        int C = leitor.nextInt();
        
        System.out.println("A temperatura em Celsius é: " + C);
        
        int F = (9 * C + 160) / 5;
        
        System.out.println("A conversão da temperatura para Fahrenheit é: " + F);
        
        leitor.close();
        
    }


}
