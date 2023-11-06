package ejercicio11;


public class Ejercicio11 {

    
    public static void main(String[] args) {
        int eur = 532;
        int dci = eur / 200;
        int vei = eur % 200 / 20;
        int die = eur % 200 % 20 / 10;
        int mon = eur % 200 % 20 % 10 / 2;
        System.out.println( eur +" euros son: \n"
                + dci +" billete de 200 \n"
                + vei +" billete de 20 \n"
                + die +" billete de 10 \n"
                + mon +" monedas de 2 \n");
        
    }
    
}
