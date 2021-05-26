import java.util.Scanner;

public class Uri1066{
    public static void main (String args[]){
    Scanner teclado = new Scanner(System.in);

    int valor;
    int positivo = 0;
    int negativo = 0;  
    int par=0;
    int impar=0;



    for (int cont = 1; cont <= 5; cont++){
        valor = teclado.nextInt();
        if (valor %2 == 0 && valor > 0){
            par = par + 1;
            positivo = positivo +1;
        }
            else if (valor %2 == 0 && valor < 0){
            par = par + 1;
            negativo = negativo +1;
        }
        else if (valor %2 != 0 && valor > 0){
            impar = impar + 1;
            positivo = positivo + 1;
        }  
        else if (valor %2 != 0 && valor < 0){
            impar = impar + 1;
            negativo = negativo + 1;
        }
        else if (valor %2 == 0){
            par = par + 1;
        }
    }
    System.out.println(par+ " valor(es) par(es)");
    System.out.println(impar+ " valor(es) impar(es)");
    System.out.println(positivo+ " valor(es) positivo(s)");
    System.out.println(negativo+ " valor(es) negativo(s)");
    }
}