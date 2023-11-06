package ejercicio8;

import java.util.Random;


public class Ejercicio8 {


    public static void main(String[] args) {
        Random ran = new Random();
        char num = (char) (ran.nextInt(26) + 'a');
        System.out.println("Carácter generado: " + num);
        if(num == 'a' || num == 'e' || num == 'i' || num == 'o' || num == 'u'){
            System.out.println("Letra vocal");
        }else{
            System.out.println("Letra consonante");
        }

    }
    
}
