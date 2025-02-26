import java.util.Scanner;


public class Espetaculo {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Custo de produção");
        float custoProducao = entrada.nextFloat();
        System.out.print("valor do ingresso");
        float valorIngresso = entrada.nextFloat();
        int qtdeConvites = (int) Math.ceil(custoProducao / valorIngresso);
        int qtdeConvites23 = (int)Math.ceil(custoProducao*1.23/valorIngresso);
        System.out.printf("quantidade de convites = %d\n", qtdeConvites);
        System.out.printf("Lucro de 23%% = %d\n", qtdeConvites23);
    }
}
