import java.util.Scanner;
public class Media{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float n1,n2,media;

        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();

        media = (n1 + n2)/2;

        System.out.println ("Media eh "+media);

        if (media >= 6) {
            System.out.println ("Aprovado");
        }
        else {
            System.out.println ("Tente novamente!");
        }
        System.out.println ("Fim do programa");
    }
}