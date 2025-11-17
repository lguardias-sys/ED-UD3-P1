public class Figura {

    public String tipo;   // "esfera" o "cilindro"
    public int altura;    // -1 si es esfera
    public int radio;     // 1 a 10

    public Figura() {
        tipo = "";
        altura = -1;
        radio = -1;
    }
    public void setFigura(String ft,double fr, double fa) {

        tipo = ft;

        if (tipo == "esfera") {
            altura = -1;
            radio = (int) fa;
        } else {
            tipo = "cilindro";
            altura = (int) fa;
            radio = (int) fr;
        }
    }

    @Override
    public String toString() {
        return "Cuerpo{" +
                "tipo='" + tipo + '\'' +
                ", altura=" + altura +
                ", radio=" + radio +
                '}';
    }
}
