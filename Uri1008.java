import java.util.Scanner;

public class Uri1008{
   public static void main(String args []){
       Scanner teclado = new Scanner(System.in);

       int A, B;
       double hora, salario;

       //entrada
       A = teclado.nextInt();
       B = teclado.nextInt();
       hora = teclado.nextDouble();
       
       //processamento
       salario = (B * hora);

       //saida
       System.out.println("NUMBER = " +A);
       System.out.printf("SALARY = U$ %.2f\n",salario);
   }
}