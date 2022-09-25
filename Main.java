public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma( 10, 20, 15);
        System.out.println(resultado);


        Coche miCoche = new Coche();
        System.out.println("El numero de puertas es: " + miCoche.puertas);
}

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    static class Coche {
        public int puertas = 4;

        public void incPuertas() {
            this.puertas++;
        }
    }

}
