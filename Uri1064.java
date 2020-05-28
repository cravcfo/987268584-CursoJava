import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor,media;
        int cont;

        media = 0f;
        cont = 0;
        
        for (int i = 1; i <= 6 ; i++){
            valor = teclado.nextFloat();
            if (valor > 0){
                media = media + valor;
                cont++;
            }
        }
        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n",media);
    }
} 
        