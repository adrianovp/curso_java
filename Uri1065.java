import java.util.Scanner;

public class Uri1065{
    public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    int valor;
    int positivo = 0;
    int negativo = 5;  
    int par=0;
    int impar=5;



    for (int cont = 1; cont <= 5; cont++){
        valor = teclado.nextInt();
        if (valor %2 == 0){
            par = par + 1;
        }
    }
    System.out.println(par+ " valor(es) par(es)");
    }
}