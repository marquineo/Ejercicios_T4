
package ejercicio10;


public class Ejercicio10 {

    
    public static void main(String[] args) {
        int t = 3665;
        int h = t / 3600;
        int m = (t % 3600) / 60;
        int s = (t % 3600) % 60;
        System.out.println(t + "s es igual a " + h + " horas" + m + " minutos" + s + " segundos");
    }
    
}
