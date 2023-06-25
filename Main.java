// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then pres
public class Main {

    public static class coche {
        static int puertas = 4;

        void addPuertas(int numPuertas) {
            puertas += numPuertas;
            System.out.println(String.valueOf(coche.puertas));


        }

        public static void main(String[] args) {

            coche deportivo = new coche();
            deportivo.addPuertas(1);
        }

    }
}

