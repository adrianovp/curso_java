import java.util.Scanner;

public class leitura{
   public static void main(String args []){
       Scanner teclado; //declarei um componente do tipo Scanner
       teclado = new Scanner(System.in); //Crio esse componente dizendo que vai ler do teclado

       int a;
       int b;

       System.out.println("Digite um valor.inteiro: ");
       a = teclado.nextInt();
        System.out.println("Digite um valor.inteiro: ");
       b = teclado.nextInt();
    }
}