import java.util.Scanner;

public class Exercicio2e{
   public static void main(String args []){
       Scanner teclado = new Scanner(System.in);

       double area, basem, baseme, altura; 
       
       System.out.println("Calculando um trapézio");
       System.out.println("Entre com o valor da Base Maior: ");
       basem = teclado.nextDouble();
        System.out.println("Entre com o valor da Base Menor: ");
       baseme = teclado.nextDouble();
        System.out.println("Entre com o valor da Altura: ");
       altura = teclado.nextDouble();
       area = (basem + baseme)* altura /2;
        System.out.println("A area do seu trapezio e: " + area);
    }
}