import java.util.Scanner;

public class Exercicio2c{
   public static void main(String args []){
       Scanner teclado = new Scanner(System.in);

       double base, altura, resultado; 
       
       System.out.println("Calculando um triangulo");
       System.out.println("Entre com o valor da Base: ");
       base = teclado.nextDouble();
        System.out.println("Entre com o valor da Altura: ");
       altura = teclado.nextDouble();
       resultado = base * altura;
       resultado = resultado/2;
        System.out.println("A area do seu triangulo e: " + resultado);
    }
}