import java.util.Scanner;

public class Uri1070{
    public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    int inicio = teclado.nextInt();

    if (inicio %2==0){
        inicio++;
    }
    for (int cont=1; cont<=6; cont++){
        System.out.println(inicio);
        inicio = inicio + 2;
    }

    }
}