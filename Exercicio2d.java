import java.util.Scanner;

public class Exercicio2d{
   public static void main(String args []){
       Scanner teclado = new Scanner(System.in);

       double diagonal1, diagonal2, resultado; 
       
       System.out.println("Calculando um Losango");
       System.out.println("Entre com o valor da Diagonal1: ");
       diagonal1 = teclado.nextDouble();
        System.out.println("Entre com o valor da Diagonal2: ");
       diagonal2 = teclado.nextDouble();
       resultado = diagonal1 * diagonal2;
       System.out.println("A area do seu losango e: " + resultado);
    }
}