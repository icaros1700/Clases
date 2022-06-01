public class App {
    public static void main(String[] args) throws Exception {
        Coche miCoche = new Coche();
        miCoche.sumarpuertas();
        miCoche.sumarpuertas();
        System.out.println(miCoche.puertas);
    }

}

class Coche {
    public int puertas = 0;

    public void sumarpuertas () {
        this.puertas++;
    }
}
