package ar.edu.unahur.obj2.w2j.contenidos;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class Plataforma {
    private static Plataforma instance = new Plataforma();
    private List<Usuario> usuarios = new ArrayList<>();
    private Plataforma() {}
    public static Plataforma getInstance() {
        return instance;
    }
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void limpiarContenidos() {
        usuarios.stream().forEach(u -> u.limpiarContenidos());
    }
    public Double facturacionMnesual() {
        return usuarios.stream()
        .mapToDouble(u -> u.costoMensual()).sum();
    }
}
