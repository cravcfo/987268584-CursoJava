import java.util.Scanner;
public class Exercicio20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int sexo;
        float altura,peso;
        
        sexo = teclado.nextInt();
        altura = teclado.nextFloat();

        if ( sexo == 0 ){
            peso = (72.7f * altura) - 58f;
            System.out.println ("Peso ideal eh = " +peso);
        }
        else {
            peso = (62.1f * altura) - 44.7f;
            System.out.println ("Peso ideal eh = " +peso);
        }
    }
}



