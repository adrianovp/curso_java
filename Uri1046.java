import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int h1, h2, th, tm;
        
        h1 = teclado.nextInt();
        h2 = teclado.nextInt();
        m1 = teclado.nextInt();
        m2 = teclado.nextInt();
        h1 = 24-h1;
        h2 = 24-h2;
        m1 = 60-m1;
        m2 = 60-m2;
             
        if (h1 > h2){
            th=h1-h2;
            System.out.println("O JOGO DUROU "+t+" HORA(S)");
        }
        else if (h1 == h2){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else{
            t=h2-h1;
            System.out.println("O JOGO DUROU "+t+" HORA(S)");
        }
    }
 }
