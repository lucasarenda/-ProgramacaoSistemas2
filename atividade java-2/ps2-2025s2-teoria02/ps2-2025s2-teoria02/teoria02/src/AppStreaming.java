import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AppStreaming {
    public static void main(String[] args) {
        List<Midia> midias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("(1) Adicionar novo Filme");
            System.out.println("(2) Adicionar nova Série");
            System.out.println("(3) Listar todas as mídias");
            System.out.println("(4) Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            
            switch (opcao) {
                case 1:
                    
                    System.out.print("Digite o título do filme: ");
                    String tituloFilme = scanner.nextLine();
                    System.out.print("Digite a duração do filme (em minutos): ");
                    long duracaoFilme = scanner.nextLong();
                    scanner.nextLine(); 
                    Filme filme = new Filme(tituloFilme, duracaoFilme);
                    midias.add(filme);
                    System.out.println("Filme adicionado com sucesso!");
                    break;
                    
                case 2:
                    System.out.print("Digite o título da série: ");
                    String tituloSerie = scanner.nextLine();
                    Serie serie = new Serie(tituloSerie);
                    
                    for (int i = 1; i <= 2; i++) {
                        System.out.println("Adicionar temporada " + i);
                        Temporada temporada = new Temporada(i);
                        for (int j = 1; j <= 2; j++) {
                            System.out.print("Digite o título do episódio " + j + ": ");
                            String tituloEpisodio = scanner.nextLine();
                            System.out.print("Digite a duração do episódio " + j + " (em minutos): ");
                            long duracaoEpisodio = scanner.nextLong();
                            scanner.nextLine();  
                            Episodio episodio = new Episodio(tituloEpisodio, duracaoEpisodio);
                            temporada.adicionar(episodio);
                        }
                        serie.adicionarTemporada(temporada);
                    }
                    midias.add(serie);
                    System.out.println("Série adicionada com sucesso!");
                    break;
                    
                case 3:
                    System.out.println("\n--- Listagem de Mídias ---");
                    for (Midia m : midias) {
                        System.out.println(m.info());
                        System.out.println("Duração total: " + m.getDuracao() + " minutos");
                    }
                    break;
                    
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
