package ar.edu.unahur.obj2.w2j.contenidos;
import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido{
    private List<Temporada> temporadas = new ArrayList<>();
    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    @Override
    protected Double doCosto() {
        return temporadas.stream()
        .flatMap(t -> t.getEpisodios().stream())
        .mapToDouble(Episodio::getCosto)
        .average()
        .orElse(0.0);
    }

    public List <Temporada> getTemporadas() {
        return temporadas;
    }

    public void agregarTemporada(Temporada temporada){
        temporadas.add(temporada);
    }
}
