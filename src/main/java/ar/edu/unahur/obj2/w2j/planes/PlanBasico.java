package ar.edu.unahur.obj2.w2j.planes;
import java.util.List;
import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class PlanBasico implements IPlan{
    private Integer limite;
    private Double costoBase = 5.0;

    public PlanBasico(Integer limite){
        this.limite = limite;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        List<Contenido> contenidos = usuario.getContenidos();
        Double costoExcedentes = contenidos.stream()
        .skip(limite)
        .mapToDouble(Contenido::getCostoBase)
        .sum();
        return this.costoBase + costoExcedentes;
 }
}