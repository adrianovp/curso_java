import java.util.Scanner;

public class Uri1019{
   public static void main(String args []){
       Scanner teclado = new Scanner(System.in);

       int KM;
       double Y, media;

       //entrada
       KM = teclado.nextInt();
       Y = teclado.nextDouble();       
      
       //processamento
       media = KM/Y;

       //saida
       System.out.printf("%.3f km/l\n",media);
   }
}