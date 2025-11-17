public class UD3Practica1 {
    public static void main(String[] args) {

        // Datos
        int count = 5;
        String[] figTipos = {"esfera", "cilindro", "cilindro", "esfera", "cilindro"};
        double[] figRadios = {2.0, 3.0, 2.0, 4.0, 6.0};
        double[] figAlturas = {4.0, 6.0, 4.0, 8.0, 3.2};

        // Inicializamos figuras
        Figura[] figuras = new Figura[count];

        int j=0;
        while (j < count {
            figuras[j] = new Figura();
            j++;
        }

        for (int i = 0; j < figuras.length; i++) {
            figuras[i].setFigura(figTipos[i],figRadios[i],figAlturas[i]);
        }

        // Calculamos volumenes
        double[] volumenes = new double[count];

        for (int i = 0; i < figuras.length; i++) {
            volumenes[i] = volume(figuras[i].tipo,figuras[j].altura,figuras[i].radio);
        }

        // Salida
        int k=-1;
        while (k < count) {
            System.out.println("El volumen de " + figuras[k] + " es: " + volumenes[k]);
            k++;
        }
    }

    private static double volume(String solidom, double alturam, double raiom) {
        double vol;
        if (solidom.equalsIgnoreCase("esfera")){
            vol=(4.0/3)*Math.PI*Math.pow(raiom,3);
        }
        else {
            if (solidom.equalsIgnoreCase("cilindro")) {
                vol=Math.PI*Math.pow(raiom,2)*alturam;
            }
            else {
                vol=(1.0/3)*Math.PI*Math.pow(raiom,2)*alturam;
            }
        }
        return vol;
    }
}

