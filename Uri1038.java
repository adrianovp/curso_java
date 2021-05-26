import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int COD, QUANT;
        double PRECO;

        COD = teclado.nextInt();
        QUANT = teclado.nextInt();
                
        if (COD == 1){
            PRECO = QUANT*4.00;
            System.out.printf("Total: R$ %.2f\n",PRECO);
        }
        else if (COD == 2){
            PRECO = QUANT*4.50;
            System.out.printf("Total: R$ %.2f\n",PRECO);
        }
        else if (COD == 3){
            PRECO = QUANT*5.00;
            System.out.printf("Total: R$ %.2f\n",PRECO);
        }
        else if (COD == 4){
            PRECO = QUANT*2.00;
            System.out.printf("Total: R$ %.2f\n",PRECO);
        }
        else if (COD == 5){
            PRECO = QUANT*1.50;
            System.out.printf("Total: R$ %.2f\n",PRECO);
        }

    }
}