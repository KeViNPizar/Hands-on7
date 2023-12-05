public class Main {
    public static void main(String[] args) {

        dataSet data =  new dataSet();
        discreteMathematics discretas = new discreteMathematics();
        linearAlgebra algebra = new linearAlgebra();
        Print print = new Print();

        //
        System.out.println("R2");
        System.out.println("Suma: ");
        double [] suma= algebra.sumarVectoresR2(data.a,data.b);
        print.imprimirVectorR2(suma);

        //
        System.out.println("Resta: ");
        double [] resta= algebra.restarVectoresR2(data.a,data.b);
        print.imprimirVectorR2(resta);

        //
        System.out.println("Suma de conjunto por escalar: ");
        double [] sumaPorEscalar = algebra.sumarVectoresR2(data.a,data.c);

        sumaPorEscalar= algebra.multiplicarVectorPorEscalar(sumaPorEscalar,7);
        print.imprimirVectorR2(sumaPorEscalar);


        //
        System.out.println("Suma de conjunto por escalar, menos un conjunto: ");
        double [] producto1 = algebra.sumarVectoresR2(data.a,data.b);
        double[] producto2 = algebra.multiplicarVectorPorEscalar(producto1,7);
        producto1= algebra.restarVectoresR2(producto2,data.c);
        print.imprimirVectorR2(producto1);

        //
        System.out.println("Suma de dos conjuntos por escalares, menos un conjunto: ");
        double [] sumaRestaMulti = algebra.multiplicarVectorPorEscalar(data.a,4);
        double [] sumaRestaMulti2= algebra.multiplicarVectorPorEscalar(data.b,5);
        double [] rSumaRestaMulti =algebra.sumarVectoresR2(sumaRestaMulti, sumaRestaMulti2);
        double [] res= algebra.restarVectoresR2(rSumaRestaMulti, data.c);
        print.imprimirVectorR2(res);


        //R3
        System.out.println("Suma: ");
        double [] sumaR3= algebra.sumarVectoresR3(data.u,data.v);
        print.imprimirVectorR3(sumaR3);

        //
        System.out.println("Resta: ");
        double [] resta2= algebra.restarVectoresR3(data.u,data.v);
        print.imprimirVectorR3(resta2);

        //
        System.out.println("R3 por escalar: ");
        double [] prueba= algebra.multiplicarPorEscalarR3(data.u, 4);
        print.imprimirVectorR3(prueba);

        //
        System.out.println("Producto de vectores");
        double  p = algebra.productoVec(data.u, data.v);
        System.out.println(p);

        //
        System.out.println("R= ");
        double [] escalarXU= algebra.multiplicarPorEscalarR3(data.u,4 );
        print.imprimirVectorR3(escalarXU);
        double [] escalarXV= algebra.multiplicarPorEscalarR3(data.v,2);
        print.imprimirVectorR3(escalarXV);
        double [] productoUV= algebra.productoCruz(escalarXU,escalarXV);
        print.imprimirVectorR3(productoUV);
        double [] vectorXC= algebra.productoCruz(productoUV,data.c2);
        print.imprimirVectorR3(vectorXC);
        double [] vectorXW= algebra.productoCruz(vectorXC, data.w);
        print.imprimirVectorR3(vectorXW);





















    }
}