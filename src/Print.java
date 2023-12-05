public class Print {

    public  void imprimirVectorR3(double[] vector) {
        if (vector.length != 3) {
            throw new IllegalArgumentException("El vector debe de tener tres elementos.");
        }

        System.out.println("Vector [" + vector[0] + ", " + vector[1] + ", " + vector[2] + "]");
    }

    public  void imprimirVectorR2(double[] vector) {
        System.out.println("Vector R2 [" + vector[0] + ", " + vector[1] + "]");
    }

}
