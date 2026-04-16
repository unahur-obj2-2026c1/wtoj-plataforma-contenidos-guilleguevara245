package ar.edu.unahur.obj2.w2j.usuarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.contenidos.Pelicula;
import ar.edu.unahur.obj2.w2j.planes.PlanBasico;

public class UsuarioTest {
    @Test
    void dadoUnUsuarioConPlanBasicoSeCalculaSuCostoMensual() {
        Usuario usuario = new Usuario();
        assertEquals(5.0, usuario.costoMensual());
    }

    @Test
    void dadoUnUsuarioConPlanBasicoYExcedentesSeCalculaSuCostoMensual() {
        Usuario usuarioVicioso = new Usuario(new PlanBasico(5));
        usuarioVicioso.verContenido(new Pelicula("Esperando la Carroza", 5.0));
        usuarioVicioso.verContenido(new Pelicula("Esperando la Carroza", 5.0));
        usuarioVicioso.verContenido(new Pelicula("Esperando la Carroza", 5.0));
        usuarioVicioso.verContenido(new Pelicula("Esperando la Carroza", 5.0));
        usuarioVicioso.verContenido(new Pelicula("Esperando la Carroza", 5.0));
        usuarioVicioso.verContenido(new Pelicula("Esperando la Carroza", 5.0));
        assertEquals(15.0, usuarioVicioso.costoMensual());
    }

    @Test
    void testGetPlan() {

    }

    @Test
    void testSetPlan() {

    }

    @Test
    void testVerContenido() {

    }
}
