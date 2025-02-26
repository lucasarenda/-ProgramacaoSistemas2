import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("número publicações");
       int numeroPublicacoes = entrada.nextInt();
       int totalCurtidas=0;
        for(int i =1; i<= numeroPublicacoes; i++){
            System.out.printf("curtidas da publicação #%d", i);
            int numeroCurtidas = entrada.nextInt();
            totalCurtidas=totalCurtidas+numeroCurtidas;
            if(numeroCurtidas>=100){
                System.out.println("publicação popular");
                }
                else{
                    System.out.println("publicação com poucas curtidas");
                }
            }
            double mediaCurtidas = (double)totalCurtidas/numeroPublicacoes;
            System.out.printf("Média Curtidas = %.1f\n", mediaCurtidas);
            System.out.printf("Número publicações!");
            entrada.close();
        } 
    }

