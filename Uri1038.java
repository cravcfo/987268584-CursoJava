import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo,qtd;
        double valor;


        codigo = teclado.nextInt();
        qtd = teclado.nextInt();

        if (codigo == 1){
            valor = qtd * 4;
            System.out.printf("Total: R$ %.2f\n",valor);
            }
            else{
                if (codigo == 2){
                    valor = qtd * 4.5;
                    System.out.printf("Total: R$ %.2f\n ",valor);
                }
                else{
                    if (codigo == 3){
                        valor = qtd * 5;
                        System.out.printf("Total: R$ %.2f\n ",valor);
                    }
                    else{
                        if (codigo == 4){
                            valor = qtd * 2;
                            System.out.printf("Total: R$ %.2f\n ",valor);
                        }
                        else{
                            if (codigo == 5){
                                valor = qtd * 1.5;
                                System.out.printf("Total: R$ %.2f\n ",valor);
                            }
                        }
                    }
                }
            }
        }
    }

            
        
    
