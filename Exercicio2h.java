import java.util.Scanner;

public class Exercicio2h{
   public static void main(String args []){
       Scanner teclado = new Scanner(System.in);

       double PI, raio, altura, volume, diametro;

       PI = 3.14;

       System.out.println("Calculando um Cilindro");
       System.out.println("Entre com o valor do diametro : ");
       diametro = teclado.nextDouble();
        System.out.println("Entre com o valor da Altura: ");
       altura = teclado.nextDouble();
       raio = diametro/2;
       volume = PI * raio * raio * altura;
       System.out.printf("A area do seu Cilindro e: %.2f",volume);
    }
}