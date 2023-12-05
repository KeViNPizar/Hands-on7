public class linearAlgebra {



    public double[] sumarVectoresR2(double[] vector1, double[] vector2) {

        double[] resultado = new double[2];
        resultado[0] = vector1[0] + vector2[0];
        resultado[1] = vector1[1] + vector2[1];

        return resultado;
    }

    public double[] restarVectoresR2(double[] vector1, double[] vector2) {

        double[] resultado = new double[2];
        resultado[0] = vector1[0] - vector2[0];
        resultado[1] = vector1[1] - vector2[1];

        return resultado;
    }

    public double[] sumarVectoresR3(double[] vector1, double[] vector2) {
        if (vector1.length != 3 || vector2.length != 3) {
            throw new IllegalArgumentException("Los vectores debe tener dos elementos.");
        }

        double[] resultado = new double[3];
        resultado[0] = vector1[0] + vector2[0];
        resultado[1] = vector1[1] + vector2[1];
        resultado[2] = vector1[2] + vector2[2];

        return resultado;
    }

    public double[] restarVectoresR3(double[] vector1, double[] vector2) {

        double[] resultado = new double[3];
        resultado[0] = vector1[0] - vector2[0];
        resultado[1] = vector1[1] - vector2[1];
        resultado[2] = vector1[2] - vector2[2];

        return resultado;
    }

    public double[] multiplicarVectorPorEscalar(double[] vector, double escalar) {

        double[] resultado = new double[2];
        resultado[0] = vector[0] * escalar;
        resultado[1] = vector[1] * escalar;

        return resultado;
    }

    public  double productoVec(double[] v1, double[] v2) {
        double resultado = 0.0;

        for (int i = 0; i < 3; i++) {
            resultado += v1[i] * v2[i];
        }

        return resultado;
    }

    public double[] multiplicarPorEscalarR3(double[] vector, double escalar) {


        double[] resultado = new double[3];
        for (int i = 0; i < 3; i++) {
            resultado[i] = vector[i] * escalar;
        }

        return resultado;

    }

    public static double[] multiplicarVectoresR3(double[] v1, double[] v2) {
        double[] resultado = new double[3];

        resultado[0] = v1[0] * v2[0];
        resultado[1] = v1[1] * v2[1];
        resultado[2] = v1[2] * v2[2];

        return resultado;
    }


    public  double[] productoCruz(double[] v1, double[] v2) {
        double[] resultado = new double[3];

        resultado[0] = (v1[1] * v2[2]) - (v1[2] * v2[1]);
        resultado[1] = (v1[2] * v2[0]) - (v1[0] * v2[2]);
        resultado[2] = (v1[0] * v2[1]) - (v1[1] * v2[0]);

        return resultado;
    }










    }