package ar.edu.unahur.obj2.w2j.contenidos;

//Esto es Singleton
public class IDRA {
    private static IDRA instance = new IDRA();
    private Double valor = 0.5;
    private IDRA(){} //Constructor privado
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public static IDRA getInstance() {
        return instance;
    }
    
}
