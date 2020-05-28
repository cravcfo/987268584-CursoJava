import java.util.Scanner;
public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade_dias;
        int x,y,z,resto;
            
        idade_dias = teclado.nextInt();

        x = idade_dias / 360;
        resto = idade_dias % 360;
        y = resto / 30;
        z = y % 30;
                    
        System.out.println(x+" ano(s)");
        System.out.println(y+" mes(es)");
        System.out.println(z+" dia(s)");
    }
}