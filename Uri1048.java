import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, reajuste;
        int r;

        salario = teclado.nextDouble();
        
        if (salario >= 0.00 && salario <= 400.00){
        reajuste = salario * 1.15;
        r= 15;
            System.out.printf("Novo salario: %.2f\n", reajuste);
            System.out.printf("Reajuste ganho: %.2f\n", (reajuste-salario));
            System.out.println("Em percentual: " +r+ " %");
        }
        else if (salario >= 400.01 && salario <= 800.00){
        reajuste = salario * 1.12;
        r= 12;
            System.out.printf("Novo salario: %.2f\n", reajuste);
            System.out.printf("Reajuste ganho: %.2f\n", (reajuste-salario));
            System.out.println("Em percentual: " +r+ " %");
        }
        else if (salario >= 800.01 && salario <= 1200.00){
        reajuste = salario * 1.10;
        r= 10;
            System.out.printf("Novo salario: %.2f\n", reajuste);
            System.out.printf("Reajuste ganho: %.2f\n", (reajuste-salario));
            System.out.println("Em percentual: " +r+ " %");
        }
        else if (salario >= 1200.01 && salario <= 2000.00){
        reajuste = salario * 1.07;
        r= 7;
            System.out.printf("Novo salario: %.2f\n", reajuste);
            System.out.printf("Reajuste ganho: %.2f\n", (reajuste-salario));
            System.out.println("Em percentual: " +r+ " %");
        }
        else if (salario > 2000.00){
        reajuste = salario * 1.04;
        r= 4;
            System.out.printf("Novo salario: %.2f\n", reajuste);
            System.out.printf("Reajuste ganho: %.2f\n", (reajuste-salario));
            System.out.println("Em percentual: " +r+ " %");
        }
    }
 }
