import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int h1, h2, m1, m2, th, tm;
        
        h1 = teclado.nextInt();
        m1 = teclado.nextInt();
        h2 = teclado.nextInt();
        m2 = teclado.nextInt();
        h1 = 24-h1;
        h2 = 24-h2;
        m1 = 60-m1;
        m2 = 60-m2;
             
        if (h1 > h2 && m1 > m2){
            th=h1-h2;
            tm=m1-m2;
            System.out.println("O JOGO DUROU "+th+" HORA (S) E " +tm+ " MINUTO (S)");
        }
        else if (h1 > h2 && m1 < m2){
            th=h1-h2;
            tm=m2-m1;
            System.out.println("O JOGO DUROU "+th+" HORA (S) E " +tm+ " MINUTO (S)");
        }
        if (h2 > h1 && m1 > m2){
            th=h2-h1;
            tm=m1-m2;
            System.out.println("O JOGO DUROU "+th+" HORA (S) E " +tm+ " MINUTO (S)");
        }
        else if (h2 > h1 && m2 > m1){
            th=h2-h1;
            tm=m2-m1;
            System.out.println("O JOGO DUROU "+th+" HORA (S) E " +tm+ " MINUTO (S)");
        }
        else if (h1 == h2 && m1 == m2){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        
    }
 }
