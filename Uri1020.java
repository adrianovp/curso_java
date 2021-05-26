import java.util.Scanner;

public class Uri1020{
   public static void main(String args []){
       Scanner teclado = new Scanner(System.in);

       int idade, anos, mes, dia, R;
       
       //entrada
       idade = teclado.nextInt();
             
       //processamento
        anos = idade / 365;
        R = idade % 365;
        mes = R / 30;
        dia = R % 30;

       //saida
       System.out.println(anos+ " ano(s)");
       System.out.println(mes+ " mes(es)");
       System.out.println(dia+ " dia(s)");
   }
}