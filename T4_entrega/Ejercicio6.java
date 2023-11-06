package ejercicio6;


public class Ejercicio6 {
    public static void main(String[] args) {
        // (A = π r²) r= 5,2cm
        float rad = 5.2f;
        float pi = 3.14f;
        System.out.println("Para calcular el área utilizamos (A = π r²), por lo que si el radio es igual a 5,2 cm el área será igual a " + Math.pow(rad,2) * pi + " cm");
    }
    
}
