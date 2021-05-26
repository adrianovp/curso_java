import java.util.Scanner;

public class Uri1019{
   public static void main(String args []){
       Scanner teclado = new Scanner(System.in);

       int T, H, M, S, R;
       
       //entrada
       T = teclado.nextInt();
             
       //processamento
        H = T / 3600;
        R = T % 3600;
        M = R / 60;
        S = R % 60;

       //saida
       System.out.println(H+":"+M+":"+S);
   }
}