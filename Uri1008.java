import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num,qtd;
        float valorH,total;

        num = teclado.nextInt();
        qtd = teclado.nextInt();
        valorH = teclado.nextFloat();
        
        total = qtd * valorH;

        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n",total);
    }
}