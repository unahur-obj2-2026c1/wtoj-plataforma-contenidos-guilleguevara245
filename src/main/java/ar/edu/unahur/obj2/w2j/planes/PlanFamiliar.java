package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public class PlanFamiliar extends PlanBasico {
    public PlanFamiliar(Integer limite) {
        super(limite);
    }

    @Override
    public Double costoPlan(Usuario usuario){
        return super.costoPlan(usuario) * 0.85;
    }
}
