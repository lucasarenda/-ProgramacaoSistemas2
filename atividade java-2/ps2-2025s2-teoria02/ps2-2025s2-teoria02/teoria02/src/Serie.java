import java.util.List;
import java.util.ArrayList;

public class Serie extends Midia {
    private List<Temporada> temporadas;

    public Serie(String titulo) {
        super(titulo);
        temporadas = new ArrayList<>();
    }

    public void adicionarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    @Override
    public long getDuracao() {
        long duracao = 0;
        for (Temporada temporada : temporadas) {
            duracao += temporada.getDuracao();
        }
        return duracao;
    }

    @Override
    public String info() {
        return "Série: " + super.info() + "; Total de Temporadas: " + temporadas.size();
    }
}