import java.util.Scanner;

public class Uri10010{
   public static void main(String args []){
       Scanner teclado = new Scanner(System.in);

       int A, B, A1, B1;
       double a, b, pagar;

       //entrada
       A = teclado.nextInt();
       B = teclado.nextInt();
       a = teclado.nextDouble();
       A1 = teclado.nextInt();
       B1 = teclado.nextInt();
       b = teclado.nextDouble();       
      
       //processamento
       pagar = (B * a)+(B1 * b);

       //saida
       System.out.printf("VALOR A PAGAR: R$ %.2f\n",pagar);
   }
}