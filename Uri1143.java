import java.util.Scanner;
public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int a,b,c, cont;

        a = n;
        b = n * n;
        c = n * n * n;

        cont = n + 1;
        while (n > 1 && n < 1000){
            System.out.println( (cont * a)" "(cont * b)" "(cont * c));
        }
    }
}