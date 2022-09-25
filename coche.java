//Segunda parte:
//
//Crear una clase coche.
//
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//
//Una función que incremente el número de puertas que tiene el coche.
//
//Crea un objeto miCoche en el main y añadirle una puerta.
//
//Mostrar el número de puertas que tiene el objeto.

public class coche {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incPuertas();
        System.out.println(miCoche.puertas);

    }
    static class Coche {
        public int puertas = 0;

        public void incPuertas() {
            this.puertas++;
        }
        }

    }

